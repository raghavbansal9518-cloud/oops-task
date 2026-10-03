// import java.util.*;
// class Address {
//     private String address;
//     Address(String address) {
//         this.address = address;
//     }
//     String getAddress() {
//         return address;
//     }
// }
// class Customer {
//     private String name;
//     private Address address;
//     Customer(String name, Address address) {
//         this.name = name;
//         this.address = address;
//     }
//     String getName() {
//         return name;
//     }
//     Address getAddress() {
//         return address;
//     }
// }
// class Restaurant {
//     private String name;
//     Restaurant(String name) {
//         this.name = name;
//     }
//     String getName() {
//         return name;
//     }
// }
// class FoodItem {
//     private String name;
//     private double price;
//     private int quantity;
//     FoodItem(String name, double price, int quantity) {
//         this.name = name;
//         this.price = price;
//         this.quantity = quantity;
//     }
//     double getTotalPrice() {
//         return price * quantity;
//     }
// }
// class Order {
//     private Customer customer;
//     private Restaurant restaurant;
//     private ArrayList<FoodItem> foodItems;
//     Order(Customer customer, Restaurant restaurant) {
//         this.customer = customer;
//         this.restaurant = restaurant;
//         this.foodItems = new ArrayList<>();
//     }
//     void addFoodItem(FoodItem item) {
//         foodItems.add(item);
//     }
//     double calculateSubtotal() {
//         double subtotal = 0;

//         for (FoodItem item : foodItems) {
//             subtotal += item.getTotalPrice();
//         }
//         return subtotal;
//     }
//     double calculateDiscount() {
//         double subtotal = calculateSubtotal();
//         if (subtotal >= 1000) {
//             return subtotal * 0.10;
//         }
//         return 0;
//     }
//     double calculateTax() {
//         double subtotal = calculateSubtotal();
//         double discount = calculateDiscount();
//         double amountAfterDiscount = subtotal - discount;
//         return amountAfterDiscount * 0.05;
//     }
//     double calculateFinalBill() {
//         double subtotal = calculateSubtotal();
//         double discount = calculateDiscount();
//         double tax = calculateTax();

//         return subtotal - discount + tax + 50;
//     }
//     void displayOrderDetails() {
//         System.out.println("Customer: " + customer.getName());
//         System.out.println("Restaurant: " + restaurant.getName());
//         System.out.println("Subtotal: " + calculateSubtotal());
//         System.out.println("Discount: " + calculateDiscount());
//         System.out.println("Tax: " + calculateTax());
//         System.out.println("Delivery Charge: 50.0");
//         System.out.println("Final Bill: " + calculateFinalBill());
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String customerName = sc.nextLine();
//         String addressText = sc.nextLine();
//         String restaurantName = sc.nextLine();
//         int n = sc.nextInt();
//         Address address = new Address(addressText);
//         Customer customer = new Customer(customerName, address);
//         Restaurant restaurant = new Restaurant(restaurantName);
//         Order order = new Order(customer, restaurant);
//         for (int i = 0; i < n; i++) {
//             String foodName = sc.next();
//             double price = sc.nextDouble();
//             int quantity = sc.nextInt();
//             FoodItem item = new FoodItem(foodName, price, quantity);
//             order.addFoodItem(item);
//         }
//         order.displayOrderDetails();
//         sc.close();
//     }
// }