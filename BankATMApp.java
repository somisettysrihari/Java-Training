import java.util.Scanner;

// Interface
interface Payment {
    void pay(double amount);
}

// Payment Classes
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class DebitCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Debit Card");
    }
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

// Parent Class
class User {
    String name;
    double balance;

    User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("User: " + name);
        System.out.println("Balance: ₹" + balance);
    }
}

// Child Class
class Customer extends User {

    Customer(String name, double balance) {
        super(name, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void makePayment(Payment p, double amount) {
        if (amount <= balance) {
            balance -= amount;
            p.pay(amount);
        } else {
            System.out.println("Payment failed: Low balance");
        }
    }
}

// Main Class
public class BankATMApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Customer c = new Customer("Srihari", 10000);

        int choice;

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Display Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Make Payment");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    c.display();
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double dep = sc.nextDouble();
                    c.deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    double wd = sc.nextDouble();
                    c.withdraw(wd);
                    break;

                case 4:
                    System.out.println("Select Payment Method:");
                    System.out.println("1. Credit Card");
                    System.out.println("2. Debit Card");
                    System.out.println("3. UPI");

                    int payChoice = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();

                    Payment p = null;

                    if (payChoice == 1)
                        p = new CreditCardPayment();
                    else if (payChoice == 2)
                        p = new DebitCardPayment();
                    else if (payChoice == 3)
                        p = new UpiPayment();
                    else {
                        System.out.println("Invalid option");
                        break;
                    }

                    c.makePayment(p, amt);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}