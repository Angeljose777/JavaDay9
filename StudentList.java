import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        System.out.println("Student Names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
