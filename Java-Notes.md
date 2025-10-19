# Java Programming Notes

## Table of Contents
1. [Introduction to Java](#introduction-to-java)
2. [Basic Syntax](#basic-syntax)
3. [Data Types](#data-types)
4. [Operators](#operators)
5. [Control Flow Statements](#control-flow-statements)
6. [Object-Oriented Programming](#object-oriented-programming)
7. [Exception Handling](#exception-handling)
8. [Collections Framework](#collections-framework)
9. [Multithreading](#multithreading)
10. [File I/O](#file-io)

---

## Introduction to Java

Java is a high-level, class-based, object-oriented programming language designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA).

### Key Features:
- **Platform Independent**: Java code runs on any platform with a JVM
- **Object-Oriented**: Everything is an object in Java
- **Secure**: Built-in security features
- **Robust**: Strong memory management and exception handling
- **Multithreaded**: Built-in support for multithreading
- **Architecture Neutral**: Compiler generates bytecode that is platform-independent

### Java Environment Setup:
1. Download and install JDK (Java Development Kit)
2. Set JAVA_HOME environment variable
3. Add Java bin directory to PATH
4. Verify installation: `java -version`

---

## Basic Syntax

### Hello World Program
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Key Points:
- Every Java program must have at least one class
- The `main` method is the entry point of a Java program
- Java is case-sensitive
- Class names should start with an uppercase letter
- Method names should start with a lowercase letter

### Comments:
```java
// Single-line comment

/* Multi-line
   comment */

/** Documentation comment
  * Used for Javadoc
  */
```

---

## Data Types

### Primitive Data Types:

| Data Type | Size    | Default Value | Range                                    |
|-----------|---------|---------------|------------------------------------------|
| byte      | 1 byte  | 0             | -128 to 127                              |
| short     | 2 bytes | 0             | -32,768 to 32,767                        |
| int       | 4 bytes | 0             | -2³¹ to 2³¹-1                            |
| long      | 8 bytes | 0L            | -2⁶³ to 2⁶³-1                            |
| float     | 4 bytes | 0.0f          | ~±3.40282347E+38F                        |
| double    | 8 bytes | 0.0d          | ~±1.79769313486231570E+308               |
| boolean   | 1 bit   | false         | true or false                            |
| char      | 2 bytes | '\u0000'      | 0 to 65,535 (Unicode characters)         |

### Example:
```java
int age = 25;
double salary = 50000.50;
char grade = 'A';
boolean isActive = true;
String name = "John Doe"; // Reference type
```

### Type Casting:
```java
// Widening (automatic)
int num = 100;
double doubleNum = num;

// Narrowing (manual)
double d = 100.04;
int i = (int) d;
```

---

## Operators

### Arithmetic Operators:
```java
int a = 10, b = 5;
int sum = a + b;        // Addition
int diff = a - b;       // Subtraction
int product = a * b;    // Multiplication
int quotient = a / b;   // Division
int remainder = a % b;  // Modulus
```

### Relational Operators:
```java
a == b  // Equal to
a != b  // Not equal to
a > b   // Greater than
a < b   // Less than
a >= b  // Greater than or equal to
a <= b  // Less than or equal to
```

### Logical Operators:
```java
&&  // Logical AND
||  // Logical OR
!   // Logical NOT
```

### Assignment Operators:
```java
=   // Simple assignment
+=  // Add and assign
-=  // Subtract and assign
*=  // Multiply and assign
/=  // Divide and assign
%=  // Modulus and assign
```

### Increment/Decrement Operators:
```java
i++  // Post-increment
++i  // Pre-increment
i--  // Post-decrement
--i  // Pre-decrement
```

---

## Control Flow Statements

### If-Else Statement:
```java
if (condition) {
    // code block
} else if (anotherCondition) {
    // code block
} else {
    // code block
}
```

### Switch Statement:
```java
switch (variable) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    default:
        // code block
}
```

### For Loop:
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}

// Enhanced for loop (for-each)
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
```

### While Loop:
```java
while (condition) {
    // code block
}
```

### Do-While Loop:
```java
do {
    // code block
} while (condition);
```

### Break and Continue:
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) break;      // Exit loop
    if (i == 3) continue;   // Skip iteration
    System.out.println(i);
}
```

---

## Object-Oriented Programming

### Classes and Objects:
```java
public class Car {
    // Instance variables
    private String brand;
    private String model;
    private int year;
    
    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    // Methods
    public void displayInfo() {
        System.out.println(brand + " " + model + " (" + year + ")");
    }
    
    // Getters and Setters
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
}

// Creating objects
Car car1 = new Car("Toyota", "Camry", 2022);
car1.displayInfo();
```

### The Four Pillars of OOP:

#### 1. Encapsulation:
```java
public class BankAccount {
    private double balance;  // Private field
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

#### 2. Inheritance:
```java
// Parent class
public class Animal {
    protected String name;
    
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
    
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
```

#### 3. Polymorphism:
```java
// Method Overloading (Compile-time polymorphism)
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
}

// Method Overriding (Runtime polymorphism)
Animal animal = new Dog();
animal.eat();  // Calls Dog's eat() method
```

#### 4. Abstraction:
```java
// Abstract class
public abstract class Shape {
    abstract double calculateArea();
    
    public void display() {
        System.out.println("This is a shape");
    }
}

// Interface
public interface Drawable {
    void draw();
}

public class Circle extends Shape implements Drawable {
    private double radius;
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
```

---

## Exception Handling

### Try-Catch Block:
```java
try {
    int result = 10 / 0;  // May throw ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero: " + e.getMessage());
} finally {
    System.out.println("This always executes");
}
```

### Multiple Catch Blocks:
```java
try {
    // code that may throw exceptions
} catch (IOException e) {
    // handle IOException
} catch (SQLException e) {
    // handle SQLException
} catch (Exception e) {
    // handle any other exception
}
```

### Throwing Exceptions:
```java
public void validateAge(int age) throws IllegalArgumentException {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
    }
}
```

### Custom Exceptions:
```java
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

---

## Collections Framework

### List Interface:
```java
// ArrayList
List<String> arrayList = new ArrayList<>();
arrayList.add("Apple");
arrayList.add("Banana");
arrayList.add("Cherry");

// LinkedList
List<String> linkedList = new LinkedList<>();
linkedList.add("Apple");
```

### Set Interface:
```java
// HashSet (no duplicates, no order)
Set<Integer> hashSet = new HashSet<>();
hashSet.add(1);
hashSet.add(2);
hashSet.add(1);  // Won't be added (duplicate)

// TreeSet (sorted)
Set<Integer> treeSet = new TreeSet<>();
```

### Map Interface:
```java
// HashMap
Map<String, Integer> map = new HashMap<>();
map.put("Apple", 10);
map.put("Banana", 20);
map.put("Cherry", 30);

// Accessing values
int value = map.get("Apple");

// Iterating
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

### Queue Interface:
```java
Queue<String> queue = new LinkedList<>();
queue.offer("First");
queue.offer("Second");
String element = queue.poll();  // Removes and returns first element
```

---

## Multithreading

### Creating Threads:

#### Method 1: Extending Thread class
```java
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

MyThread thread = new MyThread();
thread.start();
```

#### Method 2: Implementing Runnable interface
```java
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

Thread thread = new Thread(new MyRunnable());
thread.start();
```

### Thread Synchronization:
```java
public class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
}
```

### Thread Methods:
```java
thread.start();      // Start the thread
thread.sleep(1000);  // Sleep for 1 second
thread.join();       // Wait for thread to finish
thread.interrupt();  // Interrupt the thread
```

---

## File I/O

### Reading from a File:
```java
import java.io.*;

// Using BufferedReader
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}

// Using Scanner
try (Scanner scanner = new Scanner(new File("file.txt"))) {
    while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
    }
} catch (FileNotFoundException e) {
    e.printStackTrace();
}
```

### Writing to a File:
```java
// Using BufferedWriter
try (BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"))) {
    bw.write("Hello, World!");
    bw.newLine();
    bw.write("Java File I/O");
} catch (IOException e) {
    e.printStackTrace();
}

// Using PrintWriter
try (PrintWriter pw = new PrintWriter(new FileWriter("file.txt"))) {
    pw.println("Hello, World!");
    pw.println("Java File I/O");
} catch (IOException e) {
    e.printStackTrace();
}
```

### File Operations:
```java
File file = new File("example.txt");

// Check if file exists
if (file.exists()) {
    System.out.println("File exists");
}

// Create new file
file.createNewFile();

// Delete file
file.delete();

// Get file information
System.out.println("Name: " + file.getName());
System.out.println("Path: " + file.getPath());
System.out.println("Size: " + file.length() + " bytes");
```

---

## Additional Topics

### Lambda Expressions (Java 8+):
```java
// Functional interface
@FunctionalInterface
interface Operation {
    int operate(int a, int b);
}

// Lambda expression
Operation addition = (a, b) -> a + b;
System.out.println(addition.operate(5, 3));  // Output: 8
```

### Streams API (Java 8+):
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Filter and map
List<Integer> squared = numbers.stream()
    .filter(n -> n % 2 == 0)
    .map(n -> n * n)
    .collect(Collectors.toList());
```

### Optional Class (Java 8+):
```java
Optional<String> optional = Optional.of("Hello");

if (optional.isPresent()) {
    System.out.println(optional.get());
}

// Or use orElse
String value = optional.orElse("Default Value");
```

---

## Best Practices

1. **Follow Naming Conventions**:
   - Classes: PascalCase (e.g., `MyClass`)
   - Methods/Variables: camelCase (e.g., `myMethod`)
   - Constants: UPPER_SNAKE_CASE (e.g., `MAX_SIZE`)

2. **Use Proper Access Modifiers**:
   - Keep fields private
   - Provide public getters/setters when needed

3. **Handle Exceptions Properly**:
   - Don't catch exceptions you can't handle
   - Use specific exception types
   - Always clean up resources (use try-with-resources)

4. **Write Clean Code**:
   - Keep methods short and focused
   - Use meaningful variable names
   - Add comments for complex logic

5. **Use Java Standard Libraries**:
   - Prefer Collections Framework over arrays
   - Use StringBuilder for string concatenation
   - Leverage Stream API for data processing

6. **Practice SOLID Principles**:
   - Single Responsibility Principle
   - Open/Closed Principle
   - Liskov Substitution Principle
   - Interface Segregation Principle
   - Dependency Inversion Principle

---

## Resources

- [Official Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- [Java API Specification](https://docs.oracle.com/en/java/javase/17/docs/api/)

---

**Happy Coding! ☕**
