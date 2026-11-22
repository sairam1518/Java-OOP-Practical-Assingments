
import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Sairam");
        students.add("Rahul");
        students.add("Priya");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("Total Students: " + students.size());
    }
}
