import java.util.Scanner;
public class voting_system
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] candidate = {"hari","deepak","rafi"};
        int[] votes = new int[3];
        int choice;
        while(true)
        {
            System.out.println("\n1.Display Candidates");
            System.out.println("2.Vote");
            System.out.println("3.Show Winner");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            if(choice == 1)
            {
                for(int i=0;i<candidate.length;i++)
                    System.out.println((i+1) + ". " + candidate[i]);
            }
            else if(choice == 2)
            {
                System.out.print("Enter candidate number: ");
                int v = sc.nextInt();
                votes[v-1]++;
            }
            else if(choice == 3)
            {
                int max = votes[0];
                int index = 0;
                for(int i=1;i<votes.length;i++)
                {
                    if(votes[i] > max)
                    {
                        max = votes[i];
                        index = i;
                    }
                }
                System.out.println("Winner: " + candidate[index]);
            }
            else
                break;
        }
    }
}