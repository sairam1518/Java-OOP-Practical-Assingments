
import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Sairam");
        students.add("Priya");

        System.out.println("Student List:");

        for (String name : students) {
            System.out.println(name);
        }

        students.remove("Amit");

        System.out.println("\nAfter Removing Amit:");

        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("\nTotal Students: " + students.size());
    }
}
