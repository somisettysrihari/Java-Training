import java.util.Scanner;
public class bus_booking
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int seat[] = new int[5];   // 0 = available, 1 = booked
        while(true)
        {
            System.out.println("\n1.Show Available Seats");
            System.out.println("2.Book Seat");
            System.out.println("3.Show Booked Seats");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            if(choice == 1)
            {
                System.out.println("Available Seats:");
                for(int i=0;i<seat.length;i++)
                {
                    if(seat[i]==0)
                        System.out.println("Seat " + (i+1));
                }
            }
            else if(choice == 2)
            {
                System.out.print("Enter seat number: ");
                int s = sc.nextInt();
                if(seat[s-1]==0)
                {
                    seat[s-1]=1;
                    System.out.println("Seat Booked");
                }
                else
                    System.out.println("Seat Already Booked");
            }
            else if(choice == 3)
            {
                System.out.println("Booked Seats:");
                for(int i=0;i<seat.length;i++)
                {
                    if(seat[i]==1)
                        System.out.println("Seat " + (i+1));
                }
            }
            else if(choice == 4)
                break;
        }
    }
}