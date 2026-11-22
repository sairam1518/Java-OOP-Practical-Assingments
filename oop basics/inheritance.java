
class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Inheritance extends Person {

    public static void main(String[] args) {

        Inheritance s = new Inheritance();

        s.name = "Sairam";
        s.age = 19;

        s.displayPerson();
    }
}
