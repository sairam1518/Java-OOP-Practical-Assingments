
import java.util.*;

class Student {
    int rollNo;
    String name;
    String course;
    int marks;

    Student(int rollNo, String name, String course, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("--------------------");
    }
}

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();

    static int readInt(Scanner sc, String message) {
        while (true) {
            System.out.print(message);

            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.println("5. Update Student");
            System.out.println("6. Delete Student");

            choice = readInt(sc, "Enter choice: ");

            switch (choice) {

                case 1:
                    int roll = readInt(sc, "Enter Roll Number: ");
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    int marks = readInt(sc, "Enter Marks: ");

                    students.add(new Student(roll, name, course, marks));
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No Students Found!");
                    } else {
                        for (Student s : students) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    int search = readInt(sc, "Enter Roll Number to Search: ");
                    boolean found = false;

                    for (Student s : students) {
                        if (s.rollNo == search) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                case 5:
                    int updateRoll = readInt(sc, "Enter Roll Number to Update: ");
                    sc.nextLine();
                    found = false;

                    for (Student s : students) {
                        if (s.rollNo == updateRoll) {
                            System.out.print("Enter New Name: ");
                            s.name = sc.nextLine();

                            System.out.print("Enter New Course: ");
                            s.course = sc.nextLine();

                            s.marks = readInt(sc, "Enter New Marks: ");

                            System.out.println("Student Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 6:
                    int deleteRoll = readInt(sc, "Enter Roll Number to Delete: ");
                    found = false;

                    Iterator<Student> iterator = students.iterator();

                    while (iterator.hasNext()) {
                        Student s = iterator.next();

                        if (s.rollNo == deleteRoll) {
                            iterator.remove();
                            System.out.println("Student Deleted Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
