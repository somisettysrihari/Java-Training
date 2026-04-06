import java.util.Scanner;

public class hospital_management
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String patient[] = new String[5];
        int count = 0;

        while(true)
        {
            System.out.println("\n1.Add Patient");
            System.out.println("2.View Patients");
            System.out.println("3.Search Patient");
            System.out.println("4.Delete Patient");
            System.out.println("5.Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1)
            {
                System.out.print("Enter patient name: ");
                patient[count] = sc.nextLine();
                count++;
            }

            else if(choice == 2)
            {
                for(int i=0;i<count;i++)
                    System.out.println(patient[i]);
            }

            else if(choice == 3)
            {
                System.out.print("Enter patient name: ");
                String name = sc.nextLine();

                for(int i=0;i<count;i++)
                {
                    if(patient[i].equals(name))
                        System.out.println("Patient Found");
                }
            }

            else if(choice == 4)
            {
                System.out.print("Enter patient number: ");
                int d = sc.nextInt();

                for(int i=d-1;i<count-1;i++)
                    patient[i] = patient[i+1];

                count--;
            }

            else if(choice == 5)
                break;
        }
    }
}