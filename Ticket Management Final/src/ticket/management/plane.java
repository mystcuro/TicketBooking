/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.management;

import java.util.HashMap;
import java.util.Scanner;


public class plane extends reservation implements totalfare {
   int numberofseats,seatsizeofeconomy=121;
           final int seatsizeofbusiness=51;
   public int choiceofplane,choiceofclass;
  HashMap<Integer,String> economyseat=new HashMap();
    HashMap<Integer,String> businessseat=new HashMap();
   Scanner sc=new Scanner(System.in);
    plane(){
     System.out.println("Available Airways:"
        +"             Service   First Trip	Last Trip	\n" +
"Biman Bangladesh	   4 Trip(s)	04:30 AM	11:55 PM	\n" +
"...\n" +
"Regent Airways         4 Trip(s)	02:00 AM	11:30 PM	\n" +
"...\n" +
"Novo Air                   3 Trip(s)	07:30 AM	11:30 PM	\n" +
"...\n" +
"US Bangla Airlines        0 Trip(s)	09:30 PM	10:45 PM	\n" +
"...\n" );
    
}
void selectplane()
{
    System.out.println("Press 1 to select Biman Bangladesh\nPress 2 to select Regent Airways\nPress 3 to select Novo Air\nPress 4 to select US Bangla Airlines\n");
    choiceofplane=sc.nextInt();
     System.out.println("How Many Seats Do You Want to Book?");
      numberofseats=sc.nextInt();
    System.out.println("Press 1 for Economy Class Tickets(Fare BDT 2500) \n"+" \n Press 2 for Business Class Tickets(Fare BDT 5000)" );
      choiceofclass=sc.nextInt();

}
void showseatplan()
{System.out.println("Choose Seats: ");
if(choiceofclass==1)
{
           System.out.println("Seat Plan For Economy Class : ");
    for (int i = 1; i <=120; i++) {
        System.out.print(i+" ");
        if(i%12==0) System.out.print("\n");
        else if(i%4==0) System.out.print("     ");
        
    }
}
if(choiceofclass==2)
{
           System.out.println("Seat Plan For Business Class : ");
    for (int i = 1; i <=50; i++) {
        System.out.print(i+" ");
        if(i%4==0) System.out.print("\n");
        else if(i%2==0) System.out.print("     ");
        
    }
}
     
}

public void totalfare()
{
    if(choiceofclass==1)
            System.out.println("Please pay "+numberofseats*2500+" to confirm your booking"); 

else if(choiceofclass==2)
            System.out.println("Please pay "+numberofseats*5000+" to confirm your booking"); 
int choiceofpaymentmethod;
    String trxid=new String();
    String mobilenumber=new String();
System.out.println("Please Choose Your Payment Method\nPress 1 for Bikash\nPress 2 for NexusPay\nPress 3 for Citytouch\nPress 4 for Upay");
    choiceofpaymentmethod=sc.nextInt();
    System.out.println("Please provide your phone number");
    mobilenumber=sc.next();
    System.out.println("Please Enter the transaction ID ");
    trxid=sc.next();

}
}