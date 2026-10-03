# Java OOP Coding Assignments

This repository contains Java OOP coding assignments covering classes, objects, constructors, inheritance, polymorphism, abstraction, interfaces, encapsulation, and object modeling.

---

# Q1 • CODING

## Bank Account Management System

**10 Marks**

Design and implement a Bank Account Management System using Java OOP concepts. Create a `BankAccount` class containing `accountNumber`, `accountHolder`, and `balance`. Account numbers must be automatically assigned whenever a new account is created. Use a static variable `totalAccounts` to keep track of the number of accounts created and a static variable `bankName` that is shared by all accounts. The balance must be encapsulated and should not be directly modified from outside the class. Implement `deposit()` and `withdraw()` methods with appropriate validation. A deposit should increase the balance, while a withdrawal should only be allowed when sufficient balance is available. Use constructors to initialize account information and use `this` where appropriate. Create a static method `getTotalAccounts()` to return the number of accounts created. The main program should create multiple accounts, perform transactions, and display the account details. The solution must demonstrate classes, objects, constructors, this, static members, encapsulation, and access modifiers.

### Constraints

- 1 <= N <= 100
- Initial balance must be non-negative.
- Transaction amount must be positive.
- A withdrawal must not exceed the available balance.
- Account numbers must be generated automatically.

### Input Format

The first line contains an integer N representing the number of bank accounts. The next N lines contain the account holder name and initial balance. The next line contains an integer M representing the number of transactions. Each transaction contains an account number, transaction type (DEPOSIT or WITHDRAW), and amount.

### Sample Input

    2
    Rahul 5000
    Priya 8000
    4
    1 DEPOSIT 2000
    1 WITHDRAW 1000
    2 WITHDRAW 3000
    2 DEPOSIT 1500

### Output Format

For each account, display the account number, account holder, and final balance. Finally, display the total number of accounts created.

### Sample Output

    Account Number: 1
    Account Holder: Rahul
    Balance: 6000.0

    Account Number: 2
    Account Holder: Priya
    Balance: 6500.0

    Total Accounts: 2

---

# Q2 • CODING

## E-Commerce Product Pricing System

**10 Marks**

Build an E-Commerce Product Pricing System using inheritance and runtime polymorphism. Create a base Product class containing productId, name, and price. Derive Electronics, Clothing, and Book classes from Product. Each category must calculate its final price differently. Electronics should add GST and a warranty charge, Clothing should apply GST and a discount, and Book should apply a fixed tax. Define calculateFinalPrice() in the Product class and override it in every subclass. Store all products using Product references, such as a Product array. The program must calculate the final price by calling the overridden method through the parent reference. Do not use instanceof, switch, or if-else statements to identify the concrete product type. The purpose is to demonstrate how runtime polymorphism allows each object to implement its own behavior while the calling code works with the parent class.

### Constraints

- 1 <= N <= 100
- Price must be positive.
- Electronics GST = 18% and warranty charge = 1000.
- Clothing GST = 5% and discount = 10%.
- Book tax = 5%.

### Input Format

The first line contains N, the number of products. Each subsequent line contains product type, product ID, product name, and base price. Product type will be ELECTRONICS, CLOTHING, or BOOK.

### Sample Input

    3
    ELECTRONICS 101 Laptop 50000
    CLOTHING 102 Jacket 3000
    BOOK 103 JavaBook 1000

### Output Format

For every product, display its name and calculated final price.

### Sample Output

    Laptop: 60000.0
    Jacket: 2832.0
    JavaBook: 1050.0

---

# Q3 • CODING

## Employee Salary Management System

**10 Marks**

Develop an Employee Salary Management System that demonstrates both compile-time and runtime polymorphism. Create an Employee class containing name, employeeId, and baseSalary. Implement overloaded calculateSalary() methods: one without parameters and another accepting a bonus amount. Create Manager, Developer, and Intern subclasses. Each subclass must override calculateSalary() and apply its own role-specific salary rule. Managers receive a 20% role bonus, Developers receive a 15% role bonus, and Interns receive a fixed 5000 allowance. The program must store different employee objects using Employee references and process them polymorphically. The implementation should clearly demonstrate that method overloading is resolved at compile time while method overriding is resolved at runtime.

### Constraints

- 1 <= N <= 100
- Salary must be positive.
- Manager bonus = 20% of base salary.
- Developer bonus = 15% of base salary.
- Intern allowance = 5000.

### Input Format

The first line contains N, the number of employees. Each subsequent line contains employee type, employee ID, employee name, and base salary.

### Sample Input

    3
    MANAGER E101 Rahul 50000
    DEVELOPER E102 Priya 60000
    INTERN E103 Aman 15000

### Output Format

Display each employee's name, role, and calculated salary.

### Sample Output

    Rahul - Manager - 60000.0
    Priya - Developer - 69000.0
    Aman - Intern - 20000.0

---

# Q4 • CODING

## University Course Management System

**10 Marks**

Design a University Course Management System using abstraction and inheritance. Create an abstract Course class containing courseCode, courseName, and credits. The class must define abstract methods calculateFee() and displayCourseDetails(). Create RegularCourse, OnlineCourse, and CertificationCourse subclasses. Each course type must calculate its fee differently: RegularCourse charges 5000 per credit, OnlineCourse charges 3000 per credit, and CertificationCourse charges 2000 per credit plus a fixed certification fee of 1000. Store all courses using Course references and process them polymorphically. The Course class must not be instantiated directly. Use constructors to initialize common and subclass-specific data. This problem tests whether students understand why abstraction is useful, how common properties can be moved into a parent class, and how specialized behavior can be implemented by subclasses.

### Constraints

- 1 <= N <= 100
- Credits must be positive.
- RegularCourse fee = credits * 5000.
- OnlineCourse fee = credits * 3000.
- CertificationCourse fee = credits * 2000 + 1000.

### Input Format

The first line contains N, the number of courses. Each subsequent line contains course type, course code, course name, and number of credits.

### Sample Input

    3
    REGULAR CS101 JavaProgramming 4
    ONLINE CS102 WebDevelopment 3
    CERTIFICATION CS103 AIEngineering 5

### Output Format

Display the course name, course code, course type, and calculated fee for every course.

### Sample Output

    JavaProgramming (CS101) - RegularCourse - Fee: 20000.0
    WebDevelopment (CS102) - OnlineCourse - Fee: 9000.0
    AIEngineering (CS103) - CertificationCourse - Fee: 11000.0

---

# Q5 • CODING

## Payment Gateway System

**10 Marks**

Create a flexible Payment Gateway System using interfaces and runtime polymorphism. Define a PaymentMethod interface containing pay(double amount) and refund(double amount). Implement this interface using UPIPayment, CreditCardPayment, DebitCardPayment, and WalletPayment classes. Each implementation should provide its own payment and refund behavior. Create a PaymentProcessor class with a processPayment(PaymentMethod paymentMethod, double amount) method. The processor must work with any implementation of PaymentMethod and must not use instanceof, switch, or long if-else statements to identify the payment type. The goal is to demonstrate programming against an interface rather than a concrete class. The design should also allow a new payment method to be introduced later without modifying the core processing logic.

### Constraints

- 1 <= N <= 100
- Amount must be greater than 0.
- All payment classes must implement PaymentMethod.
- PaymentProcessor must work using the interface reference.

### Input Format

The first line contains N, the number of transactions. Each subsequent line contains payment type and amount. Payment types are UPI, CREDIT, DEBIT, and WALLET.

### Sample Input

    4
    UPI 1500
    CREDIT 2500
    DEBIT 1000
    WALLET 750

### Output Format

For every transaction, display the payment method and the result of the payment.

Use the format:

`<PaymentType>: Payment of <amount> successful`

### Sample Output

    UPI: Payment of 1500.0 successful
    CREDIT: Payment of 2500.0 successful
    DEBIT: Payment of 1000.0 successful
    WALLET: Payment of 750.0 successful

---

# Q6 • CODING

## Food Delivery Object Modeling System

**10 Marks**

Design a simplified Food Delivery System by modeling real-world entities using multiple interacting Java classes. Create Customer, Address, Restaurant, FoodItem, and Order classes. A Customer should have an Address, while an Order should contain multiple FoodItem objects. Each FoodItem should store its name, price, and quantity. The Order class must provide methods to add food items, calculate the subtotal, calculate tax, apply a discount, calculate the final bill, and display the order details. Use a delivery charge of 50 and a tax rate of 5%. If the subtotal is 1000 or more, apply a 10% discount; otherwise, no discount should be applied. The main method should primarily handle input and object creation while the classes themselves should be responsible for their own behavior. Avoid placing all calculations and business logic inside main(). The objective is to test object modeling, composition, encapsulation, constructors, methods, and separation of responsibilities.

### Constraints

- 1 <= N <= 50
- Price and quantity must be positive.
- Delivery charge = 50.
- Tax = 5% of the amount after discount.
- Discount = 10% when subtotal >= 1000, otherwise 0.

### Input Format

The first line contains the customer name. The second line contains the customer's address. The third line contains the restaurant name. The fourth line contains N, the number of food items. Each of the next N lines contains food item name, price, and quantity.

### Sample Input

    Rahul
    Patiala
    Campus Cafe
    3
    Burger 200 2
    Pizza 500 1
    Coffee 100 2

### Output Format

Display the customer name, restaurant name, subtotal, discount, tax, delivery charge, and final bill.

### Sample Output

    Customer: Rahul
    Restaurant: Campus Cafe
    Subtotal: 1200.0
    Discount: 120.0
    Tax: 54.0
    Delivery Charge: 50.0
    Final Bill: 1184.0

---

# Q7 • CODING

## University Student Polymorphism System

**10 Marks**

Create a student hierarchy to demonstrate multilevel inheritance, method overriding, upcasting, and runtime polymorphism. Create a base Person class and derive Student from it. Further derive EngineeringStudent from Student and CSEStudent from EngineeringStudent. Each class should contain appropriate information and the displayDetails() method should be overridden where necessary. Create different student objects and store them inside a Person[] array. Call displayDetails() using Person references and allow Java's runtime polymorphism to determine which implementation should execute. Your program must also demonstrate upcasting using a statement such as Person p = new CSEStudent(...). The important part of this problem is understanding that the reference type and actual object type can be different. Do not use instanceof or explicit type checking to decide which displayDetails() method to call. Let method overriding and dynamic method dispatch handle the behavior.

### Constraints

- 1 <= N <= 50
- Use inheritance to create the hierarchy.
- Use method overriding for displayDetails().
- Use Person references to demonstrate runtime polymorphism.
- Do not use instanceof for selecting behavior.

### Input Format

The first line contains N, the number of people. Each subsequent line contains the type followed by the relevant details. Types are STUDENT, ENGINEERING, or CSE.

### Sample Input

    3
    STUDENT S101 Rahul 19
    ENGINEERING E102 Priya 20 CSE
    CSE C103 Aman 21 Java

### Output Format

Display the details of every object using the displayDetails() method.

### Sample Output

    Student: Rahul, ID: S101, Age: 19
    Engineering Student: Priya, ID: E102, Age: 20, Branch: CSE
    CSE Student: Aman, ID: C103, Age: 21, Specialization: Java

---

# Q8 • CODING

## Extensible Notification Service

**10 Marks**

Design an extensible Notification Service using interfaces and polymorphism. Create a Notification interface containing a send(String message) method. Implement it using EmailNotification, SMSNotification, and PushNotification classes. Each class must provide its own implementation of sending a notification. Create a NotificationService class that accepts a Notification reference and sends the message through the selected implementation. The service must not depend directly on concrete notification classes. The program should process different notification types using the same interface. Do not use instanceof or large if-else or switch blocks inside NotificationService to identify the notification type. The design should make it easy to introduce another notification method, such as WhatsAppNotification, without modifying the existing processing logic. This problem focuses on abstraction, interfaces, polymorphism, loose coupling, and extensibility.

### Constraints

- 1 <= N <= 100
- The message must not be empty.
- All notification classes must implement the Notification interface.
- NotificationService must work using the Notification interface reference.

### Input Format

The first line contains N, the number of notifications. Each subsequent line contains the notification type followed by the message. Types are EMAIL, SMS, and PUSH.

### Sample Input

    3
    EMAIL Welcome to Utkarsh
    SMS Your assignment is due tomorrow
    PUSH New session has been scheduled

### Output Format

Display the notification type and the message sent using the appropriate implementation.

### Sample Output

    EMAIL: Welcome to Utkarsh
    SMS: Your assignment is due tomorrow
    PUSH: New session has been scheduled

---

# Q9 • CODING

## Library Management System

**10 Marks**

Develop a Library Management System using proper object-oriented design. Create Library, Book, Member, and Librarian classes. A Library should maintain multiple books, while a Member should be able to borrow and return books. A book can be issued to only one member at a time and must maintain an availability state. Implement operations for issuing a book, returning a book, checking availability, and calculating a late fee. Create StudentMember, FacultyMember, and GuestMember subclasses. Each member type must have a different maximum borrowing limit:

- StudentMember can borrow 2 books.
- FacultyMember can borrow 5 books.
- GuestMember can borrow 1 book.

Use polymorphism so that the library works with Member references and does not use instanceof or large if-else blocks to determine the borrowing limit. A member should not be allowed to borrow a book if they have already reached their limit or if the book is unavailable. The solution should keep responsibilities within appropriate classes rather than placing all logic inside main().

### Constraints

- 1 <= N <= 100
- 1 <= M <= 200
- Student borrowing limit = 2.
- Faculty borrowing limit = 5.
- Guest borrowing limit = 1.
- A book cannot be borrowed if it is already issued.
- A book can only be returned by the member who borrowed it.

### Input Format

The first line contains N, the number of books. The next N lines contain book ID and book title. The next line contains the member type, member ID, and member name. The next line contains M, the number of operations. Each operation is either BORROW bookId or RETURN bookId.

### Sample Input

    3
    B101 JavaBasics
    B102 DSA
    B103 DBMS
    STUDENT M101 Rahul
    4
    BORROW B101
    BORROW B102
    BORROW B103
    RETURN B101

### Output Format

For every operation, display whether it was successful or rejected. At the end, display the number of books currently borrowed by the member.

### Sample Output

    Borrowed: JavaBasics
    Borrowed: DSA
    Borrow failed: Borrowing limit reached
    Returned: JavaBasics
    Books Borrowed: 1

---

# Q10 • CODING

## Employee Bonus Management

**10 Marks**

Create a simple Employee Bonus Management System using fundamental Java OOP concepts. Define an Employee class containing name, employeeId, and salary. Create two subclasses: Developer and Manager. Both subclasses should inherit the common employee information but calculate their bonuses differently. A Developer receives a bonus equal to 10% of the salary, while a Manager receives a bonus equal to 15% of the salary. Define calculateBonus() in the Employee class and override it in both subclasses. Also implement displayDetails() to display the employee name, ID, salary, and calculated bonus. Create multiple employee objects and store them using Employee references or an Employee[] array. Process the employees through the parent reference so that the correct overridden method is executed according to the actual object. Use constructors and this where appropriate. This question is intentionally simpler than the other problems and is designed to verify that students can correctly combine classes, objects, constructors, this, inheritance, method overriding, and basic runtime polymorphism.

### Constraints

- 1 <= N <= 100
- Salary must be positive.
- Developer bonus = 10% of salary.
- Manager bonus = 15% of salary.

### Input Format

The first line contains N, the number of employees. Each subsequent line contains employee type, employee ID, employee name, and salary. Employee types are DEVELOPER and MANAGER.

### Sample Input

    2
    DEVELOPER E101 Rahul 50000
    MANAGER E102 Priya 60000

### Output Format

For every employee, display the employee name, ID, salary, and calculated bonus.

### Sample Output

    Name: Rahul
    ID: E101
    Salary: 50000.0
    Bonus: 5000.0

    Name: Priya
    ID: E102
    Salary: 60000.0
    Bonus: 9000.0

---

# GitHub Repository
**GitHub Repository Link:**  
Add your repository link here.