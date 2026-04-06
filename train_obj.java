public class train_obj
 {
    int  train_no;
    String passengername;
    String train_name;
    String source;
    String destination;
    int seat_no;
    
    void bookticket()
    {
        System.out.println("ticket booked successfully");
    }
    void display()
    {
        System.out.println("train_no : " + train_no);
        System.out.println("passenger name : "+ passengername);
        System.out.println("train name : " +train_name);
        System.out.println("seat number : "+ seat_no);
        System.out.println("source :"+source);
        System.out.println("destination :"+ destination);
    }
    public static void main(String[] args) {
        train_obj t=new train_obj();
        t.train_no=4563;
        t.passengername="srihari"; 
        t.train_name="charminar express";
        t.source="chennai";
        t.destination="banglore";
        t.seat_no=13;  
        t.bookticket();
        t.display();  
    }
}
