
# Advanced Java OOP Theory Questions

## Question 11: Explain the Four Pillars of Object-Oriented Programming (OOP) with examples.

### 1. Encapsulation
Encapsulation means wrapping data and methods into a single unit (class) and restricting direct access to data using access modifiers.

Example:
```java
class Student {
    private int marks;

    void setMarks(int m) {
        marks = m;
    }

    int getMarks() {
        return marks;
    }
}
```

### 2. Inheritance
Inheritance allows one class to acquire the properties and methods of another class using the extends keyword.

Example:
```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

### 3. Polymorphism
Polymorphism means one method can have different behaviours depending on the object or arguments.

Example:
```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
```

### 4. Abstraction
Abstraction means hiding implementation details and showing only essential functionality.

Example:
```java
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car Started");
    }
}
```

### Advantages of OOP
1. Code reusability.
2. Data security.
3. Easy maintenance.
4. Better code organization.
5. Flexibility and scalability.

### Conclusion
The four pillars of OOP make programs secure, reusable, organized, and easier to maintain.





## Question 12: Explain the Difference Between Method Overloading and Method Overriding with Examples.

Method overloading and method overriding are two important concepts of polymorphism in Java.

### 1. Method Overloading

Method overloading occurs when multiple methods have the same name but different parameters within the same class.

Example:

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

Here, the add() method has different parameters. This is called method overloading.

### 2. Method Overriding

Method overriding occurs when a child class provides its own implementation of a method already defined in the parent class.

Example:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

Here, the Dog class overrides the sound() method of the Animal class.

### 3. Difference Between Overloading and Overriding

| Method Overloading | Method Overriding |
|---|---|
| Same method name, different parameters. | Same method signature in parent and child classes. |
| Usually occurs in the same class. | Requires inheritance. |
| Compile-time polymorphism. | Runtime polymorphism. |
| Return type alone cannot distinguish overloaded methods. | Return type must be compatible. |
| Increases flexibility. | Provides specialized behaviour. |

### 4. Advantages

1. Improves code reusability.
2. Makes programs flexible.
3. Supports polymorphism.
4. Improves code readability.

### Conclusion

Method overloading allows multiple methods with the same name but different parameters, whereas method overriding allows a child class to change the behaviour of an inherited method.






## Question 13: Explain Abstract Classes and Interfaces in Java. Differentiate Between Them with Examples.

### 1. Abstract Class

An abstract class is a class declared using the abstract keyword. It cannot be directly instantiated. It can contain both abstract methods and normal methods.

Example:

```java
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}
```

Here, Animal is an abstract class and Dog provides the implementation of the sound() method.

### 2. Interface

An interface is a blueprint of a class that defines methods which implementing classes must provide. It is declared using the interface keyword.

Example:

```java
interface Vehicle {

    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car Started");
    }
}
```

Here, Vehicle is an interface and Car implements its start() method.

### 3. Difference Between Abstract Class and Interface

| Abstract Class | Interface |
|---|---|
| Declared using the abstract keyword. | Declared using the interface keyword. |
| Can contain abstract and concrete methods. | Can contain abstract, default, static and private methods. |
| Can have constructors. | Cannot have constructors. |
| Can have instance variables. | Fields are public, static and final by default. |
| A class can extend only one class. | A class can implement multiple interfaces. |
| Uses the extends keyword. | Uses the implements keyword. |

### 4. Advantages

1. Provides abstraction.
2. Improves code reusability.
3. Supports flexible program design.
4. Helps organize large applications.

### Conclusion

Abstract classes and interfaces are important features of Java. Abstract classes are useful when related classes share common properties and behaviour, whereas interfaces are useful for defining common capabilities that different classes can implement.









## Question 14: Explain the Different Types of Inheritance in Java with Examples.

Inheritance is an important concept in Object-Oriented Programming. It allows one class to acquire the properties and methods of another class using the extends keyword.

### 1. Single Inheritance

When one child class inherits from one parent class, it is called single inheritance.

Example:

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

### 2. Multilevel Inheritance

When a class inherits from another child class, forming a chain of inheritance, it is called multilevel inheritance.

Example:

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Playing");
    }
}
```

### 3. Hierarchical Inheritance

When multiple child classes inherit from the same parent class, it is called hierarchical inheritance.

Example:

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing");
    }
}
```

### 4. Multiple Inheritance

Multiple inheritance means one class inherits features from more than one parent class.

Java does not support multiple inheritance through classes to avoid ambiguity. However, it supports multiple inheritance through interfaces.

Example:

```java
interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {

    public void show() {
        System.out.println("Interface A");
    }

    public void display() {
        System.out.println("Interface B");
    }
}
```

### 5. Hybrid Inheritance

Hybrid inheritance is a combination of two or more types of inheritance.

Java does not support hybrid inheritance through classes alone, but it can be achieved using interfaces.

### Advantages of Inheritance

1. Promotes code reusability.
2. Reduces code duplication.
3. Improves program organization.
4. Supports method overriding.
5. Makes programs easier to maintain.

### Conclusion

Inheritance allows classes to reuse existing code and establish relationships between classes. Java supports single, multilevel and hierarchical inheritance through classes, while multiple and hybrid inheritance can be achieved using interfaces.







# Q15. Explain Constructors in Java and Their Different Types with Examples.

## Introduction
A constructor in Java is a special method used to initialize objects. It is automatically called when an object is created.

A constructor has the same name as the class and does not have a return type.

## Types of Constructors

### 1. Default Constructor
A default constructor is automatically provided by Java if no constructor is defined in the class.

**Example:**
```java
class Student {
    int rollNo;
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Object created successfully");
    }
}
```

### 2. No-Argument Constructor
A no-argument constructor is a constructor created by the programmer that does not accept any parameters.

**Example:**
```java
class Student {
    Student() {
        System.out.println("Student object created");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
```

### 3. Parameterized Constructor
A parameterized constructor accepts values as parameters to initialize an object.

**Example:**
```java
class Student {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(101, "Rahul");
        s.display();
    }
}
```

### 4. Copy Constructor
Java does not provide a built-in copy constructor, but we can create one manually to copy the values of one object into another.

**Example:**
```java
class Student {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    Student(Student s) {
        rollNo = s.rollNo;
        name = s.name;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(s1);

        s2.display();
    }
}
```

## Features of Constructors
1. A constructor has the same name as its class.
2. It does not have a return type.
3. It is called automatically when an object is created.
4. Constructors can be overloaded.
5. Constructors are used to initialize object data.

## Advantages of Constructors
1. They initialize objects automatically.
2. They reduce repeated initialization code.
3. They make programs easier to understand.
4. They support constructor overloading.

## Conclusion
Constructors are an important feature of Java used to initialize objects. Java supports default, no-argument and parameterized constructors. A copy constructor can also be created manually to copy object values.






# Q16. Explain the `this` and `super` Keywords in Java with Examples.

## Introduction
In Java, `this` and `super` are special keywords used to refer to objects and their members.

- `this` refers to the current class object.
- `super` refers to the immediate parent class object.

## 1. this Keyword

The `this` keyword refers to the current object of a class. It is mainly used to access current class variables, methods and constructors.

### Example:
```java
class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(101, "Rahul");
        s.display();
    }
}
```

### Uses of this Keyword
1. Refers to the current class object.
2. Differentiates instance variables from local variables.
3. Calls another constructor of the same class using `this()`.
4. Calls current class methods.

## 2. super Keyword

The `super` keyword refers to the immediate parent class object. It is used to access parent class variables, methods and constructors.

### Example:
```java
class Animal {
    String name = "Animal";

    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        System.out.println(super.name);
        super.sound();
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
```

### Uses of super Keyword
1. Accesses parent class variables.
2. Calls parent class methods.
3. Calls the parent class constructor using `super()`.
4. Helps avoid confusion between parent and child class members.

## Difference Between this and super

| this Keyword | super Keyword |
|---|---|
| Refers to the current class object. | Refers to the immediate parent class object. |
| Accesses current class variables. | Accesses parent class variables. |
| Calls current class methods. | Calls parent class methods. |
| Uses `this()` to call another constructor in the same class. | Uses `super()` to call the parent class constructor. |
| Used within the current class. | Used in a child class. |

## Advantages
1. Helps access variables and methods clearly.
2. Reduces confusion between parent and child class members.
3. Supports inheritance.
4. Makes constructors easier to manage.

## Conclusion
The `this` and `super` keywords are important in Java. The `this` keyword refers to the current object, whereas `super` refers to the immediate parent class object. Both are useful for accessing variables, methods and constructors.
```


