// import java.util.*;

// class Employee {
//     String name;
//     String employeeId;
//     double baseSalary;

//     Employee(String name, String employeeId, double baseSalary) {
//         this.name=name;
//         this.employeeId=employeeId;
//         this.baseSalary=baseSalary;
//     }

//     double calculateSalary() {
//         return baseSalary;
//     }

//     double calculateSalary(double bonus) {
//         return baseSalary+bonus;
//     }
// }

// class Manager extends Employee {
//     Manager(String name, String id, double salary) {
//         super(name, id, salary);
//     }

//     @Override
//     double calculateSalary() {
//         return baseSalary+(baseSalary*0.20);
//     }
// }

// class Developer extends Employee {
//     Developer(String name, String id, double salary) {
//         super(name, id, salary);
//     }

//     @Override
//     double calculateSalary() {
//         return baseSalary+(baseSalary*0.15);
//     }
// }

// class Intern extends Employee {
//     Intern(String name, String id, double salary) {
//         super(name, id, salary);
//     }

//     @Override
//     double calculateSalary() {
//         return baseSalary+5000;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         Employee[] emp=new Employee[n]; 
//         for(int i=0;i<n;i++){
//             String type=sc.next();
//             String id=sc.next();
//             String name=sc.next();
//             Double salary=sc.nextDouble();
//             if(type.equals("MANAGER")){
//                 emp[i]=new Manager(name,id,salary);
//             }
//             else if(type.equals("DEVELOPER")){
//                 emp[i]=new Developer(name,id,salary);
//             }
//             else if(type.equals("INTERN")){
//                 emp[i]=new Intern(name,id,salary);
//             }
//         }    
//         for(Employee e:emp){
//             System.out.println(e.name+" - "+e.getClass().getSimpleName()+" - "+e.calculateSalary());
//         }
//     }
// }