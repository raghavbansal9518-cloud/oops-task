import java.util.*;
interface PaymentMethod{
    void pay(double amount);
    void refund(double amount);
}
class UPIPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("UPI: Payment of "+amount+" successful");
    }
    public void refund(double amount){
        System.out.println("UPI: Refund of "+amount+" successful");
    }
}
class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("CREDIT: Payment of " + amount + " successful");
    }

    public void refund(double amount) {
        System.out.println("CREDIT: Refund of " + amount + " successful");
    }
}
class DebitCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("DEBIT: Payment of " + amount + " successful");
    }

    public void refund(double amount) {
        System.out.println("DEBIT: Refund of " + amount + " successful");
    }
}
class WalletPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("WALLET: Payment of " + amount + " successful");
    }

    public void refund(double amount) {
        System.out.println("WALLET: Refund of " + amount + " successful");
    }
}
class PaymentProcessor{
    void processPayment(PaymentMethod paymentMethod,double amount){
        if(amount>0){
            paymentMethod.pay(amount);
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,PaymentMethod> methods=new HashMap<>();
        methods.put("UPI", new UPIPayment());
        methods.put("CREDIT", new CreditCardPayment());
        methods.put("DEBIT", new DebitCardPayment());
        methods.put("WALLET", new WalletPayment());

        PaymentProcessor processor=new PaymentProcessor();
        for(int i=0;i<n;i++){
            String type=sc.next();
            double amount=sc.nextDouble();

            PaymentMethod paymentMethod=methods.get(type);
            if(paymentMethod!=null){
                processor.processPayment(paymentMethod,amount);
            }
        }
        sc.close();
    }
}