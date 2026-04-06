import java.util.Scanner;
public class registration_form
{
    public static void main(String[]args)
    {
        
Scanner sc=new Scanner(System.in);
System.out.println("name:" );
String name=sc.nextLine();
System.out.println("age" );
int age=sc.nextInt();
System.out.println("id" );
int id=sc.nextInt();
System.out.println("gmail");
String gmail=sc.nextLine();
System.out.println("password");
String password=sc.nextLine();

if (name.length()>0&&age>0&&id>0&&gmail.length()>0&&password.length()>0)
{
    System.out.println("registration successfull");
}
else
{
    System.out.println("registration not successfull");
}
}
}
