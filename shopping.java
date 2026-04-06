import java.util.Scanner;
public class shopping
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] products = {"Rice", "Milk", "Bread", "Eggs"};
        int[] price = {50, 30, 40, 10};
        int total = 0;
        int choice;
        while(true)
        {
            System.out.println("\n1.Display Products");
            System.out.println("2.Add Product to Cart");
            System.out.println("3.Calculate Total Bill");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Products List:");
                    for(int i=0;i<products.length;i++)
                        System.out.println((i+1) + ". " + products[i] + " - Rs." + price[i]);
                    break;
                case 2:
                    System.out.print("Enter product number: ");
                    int p = sc.nextInt();
                    total = total + price[p-1];
                    System.out.println("Product added to cart");
                    break;
                case 3:
                    System.out.println("Total Bill = Rs." + total);
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}