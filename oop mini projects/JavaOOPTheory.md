
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








