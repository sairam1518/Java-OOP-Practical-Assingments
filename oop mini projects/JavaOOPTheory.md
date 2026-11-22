
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
