
class Student {
    private String name;
    private int age;

    void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setDetails("Sairam", 19);
        s.display();
    }
}
