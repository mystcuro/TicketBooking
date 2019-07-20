
package ticket.management;

import java.util.Scanner;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.util.HashMap;
import javax.swing.*;
import javafx.scene.image.Image;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Bus extends reservation implements totalfare
{
   int numberofseats;final int seatsize=53;
   public int choiceofbus;
  HashMap<Integer,String> busseat=new HashMap();
   
   Scanner sc=new Scanner(System.in);
    Bus()
   {  System.out.println("Available buses:"
        +"             Service   First Trip	Last Trip   Fare	\n" +
"Hanif Enterprise	47 Trip(s)	04:30 AM	11:55 PM    600	\n" +
"...\n" +
"Soudia Air Con	        4 Trip(s)	02:00 AM	11:30 PM    600	\n" +
"...\n" +
"Shohagh Paribahan	3 Trip(s)	07:30 AM	11:30 PM    600	\n" +
"...\n" +
"Saintmartin Paribahan  0 Trip(s)	09:30 PM	10:45 PM    600	\n" +
"...\n" +
"Ena Transport (Pvt) Lt 15 Trip(s)	12:30 AM	11:30 PM    600	\n" +
"...\n" +
"Shyamoli SP	        11 Trip(s)	10:00 AM	11:45 PM    600	\n" +
"...\n" +
"Saintmartin Travels	0 Trip(s)	08:30 PM	09:00 PM    600	\n" +
"...\n" +
"Relax Transport Ltd.	8 Trip(s)	09:30 AM	11:55 PM    600    \n");
    }
   void selectbus()
   {
       System.out.println("Press 1 to select Hanif Enterprise\nPress 2 to select Soudia Air Con\nPress 3 to select Shohagh Paribahan\nPress 4 to select Shohag Paribahan\nPress 4 to select Shohag Paribahan\nPress 5 to select Ena Transport\nPress 6 to select Shyamoli SP\nPress 7 to select Shohag Paribahan\nPress 8 to select SaintMartin Travels\nPress 9 to select Relax Transport\n") ;  
       choiceofbus=sc.nextInt();  
       System.out.println("How many seats do you want");
       numberofseats=sc.nextInt();
       System.out.println("Please Choose the seats");
       System.out.println("Seat Plan: ");
       Img obj=new Img();
       /*System.out.println("         Driver");
       System.out.println("01 02   03 04");
       System.out.println("05 06   07 08");
       System.out.println("09 10   11 12");
       for (int i = 13; i < 53; i++) {
           System.out.print(i+" ");
           if(i%4==0) System.out.print("\n");
           else if(i%2==0) System.out.print("  ");
           
       }*/
    }
   


public void totalfare()
{
    int choiceofpaymentmethod;
    String trxid=new String();
    String mobilenumber=new String();
    System.out.println("Please pay "+numberofseats*600+" to confirm your booking"); 
    System.out.println("Please Choose Your Payment Method\nPress 1 for Bikash\nPress 2 for NexusPay\nPress 3 for Citytouch\nPress 4 for Upay");
    choiceofpaymentmethod=sc.nextInt();
    System.out.println("Please provide your phone number");
    mobilenumber=sc.next();
    System.out.println("Please Enter the transaction ID ");
    trxid=sc.next();

}
class Img extends JFrame
{
      JPanel jp=new JPanel();
  JLabel jl= new JLabel();
   public Img()
    {
setTitle("SEATS");
setVisible(true);
setSize(400,200);
setDefaultCloseOperation(EXIT_ON_CLOSE);
jl.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\bus.jpg"));
jp.add(jl);
add(jp);
validate();
    }

}
}
