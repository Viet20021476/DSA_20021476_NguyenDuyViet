import java.util.*;

public class Ex4 {
    static class Student {
        private int id;
        private String name;
        private double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getID() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getCGPA() {
            return cgpa;
        }
    }


    static void getStudents(List<String> events) {
        PriorityQueue<Student> students = new PriorityQueue<>(new StudentComparator());
        for (String e : events) {
            if (e.startsWith("ENTER")) {
                String[] temp = e.split(" ");
                students.offer(new Student(Integer.parseInt(temp[3]), temp[1], Double.parseDouble(temp[2])));
            } else {
                students.remove();
            }
        }
        while (students.size() > 0) {
            System.out.println(students.remove().getName());
        }
    }

    static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if (o2.getCGPA() == o1.getCGPA()) {
                if (o1.getName().equals(o2.getName())) {
                    return Integer.compare(o1.getID(), o2.getID());
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            } else {
                return Double.compare(o2.getCGPA(), o1.getCGPA());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> events = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] temp = s.split(" ");
            if (temp[0].equals("ENTER")) {
                events.add(temp[0] + " " + temp[1] + " " + temp[2] + " " + temp[3]);
            } else {
                events.add("SERVED");
            }
        }
        getStudents(events);
    }
}
