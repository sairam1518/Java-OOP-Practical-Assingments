
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class Result extends Student {

    Result(String name, int marks) {
        super(name, marks);
    }

    void calculateGrade() {
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else if (marks >= 60)
            System.out.println("Grade: C");
        else if (marks >= 40)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: Fail");
    }

    @Override
    void display() {
        super.display();
        calculateGrade();
    }
}

public class StudentGrade {
    public static void main(String[] args) {

        Student s = new Result("Rahul", 85);

        s.display();
    }
}
