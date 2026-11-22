
import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Sairam");
        students.put(104, "Priya");

        System.out.println("Student Records:");

        for (Integer roll : students.keySet()) {
            System.out.println(roll + " - " + students.get(roll));
        }

        System.out.println("\nTotal Students: " + students.size());

        students.remove(102);

        System.out.println("\nAfter Removing Roll No. 102:");

        System.out.println(students);
    }
}
