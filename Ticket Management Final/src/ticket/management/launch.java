 
package ticket.management;

import java.util.Scanner;
import java.util.HashMap;

public class launch extends reservation implements totalfare {
    Scanner sc=new Scanner(System.in);
    int choiceoflaunch,choiceofcabin,numberofseats;
    final int seatsize=50;
    HashMap<Integer,String> doublecabin=new HashMap<Integer,String>();
    HashMap<Integer,String> singlecabin=new HashMap<Integer,String>();
    HashMap<Integer,String> familycabin=new HashMap<Integer,String>();
    launch(){
     System.out.println("Available Launches:"
        +"             Service   First Trip	Last Trip	\n" +
"Surovi 07       	   4 Trip(s)	04:30 AM	11:55 PM	\n" +
"...\n" +
"Sundarban 11	          4 Trip(s)	02:00 AM	11:30 PM	\n" +
"...\n" +
"MV Karnaphully             3 Trip(s)	07:30 AM	11:30 PM	\n" +
"...\n" +
"Saintmartin Paribahan      0 Trip(s)	09:30 PM	10:45 PM	\n" +
"...\n" +
"P.S Masud                  5 trips	12:30 AM            11:30 PM	\n" +
"...\n" );
    
}
void selectlaunch()
{
    System.out.println("Press 1 to select Surovi 07\nPress 2 to select Sundarban 11\nPress 3 to select MV Karnafully\nPress 4 to select P.S Masud\n");
    choiceoflaunch=sc.nextInt();
    System.out.println("Press 1 for double cabin(Fare BDT 800) \n"+" \n Press 2 for Single cabin(Fare BDT 500)"+"\n Press 3 for family cabin(Fare BDT 1000)" );
      choiceofcabin=sc.nextInt();
      System.out.println("How many cabins do you want to book");
      numberofseats=sc.nextInt();
}
void showseatplan()
{
if(choiceofcabin==1)
{
           System.out.println("Seat Plan For Double Cabins: ");
       System.out.println("Driver        1 5 9 13 17 21 25 29 33 37 41 45 49");
       System.out.println("              2 6 10 14 18 22 26 30 34 38 42 46 50\n");
         System.out.println("              3 7 11 15 19 23 27 31 35 39 43 47 51");
           System.out.println("              4 8 12 16 20 24 28 32 36 40 44 48 52");
}
else if(choiceofcabin==2)
{
           System.out.println("Seat Plan For Single Cabins: ");
       System.out.println("Deck          1 5 9 13 17 21 25 29 33 37 41 45 49");
       System.out.println("              2 6 10 14 18 22 26 30 34 38 42 46 50\n");
         System.out.println("              3 7 11 15 19 23 27 31 35 39 43 47 51");
           System.out.println("              4 8 12 16 20 24 28 32 36 40 44 48 52");
}
else if(choiceofcabin==3)
{
           System.out.println("Seat Plan For Family Cabins: ");
       System.out.println("Lobby         1 5 9 13 17 21 25 29 33 37 41 45 49");
       System.out.println("              2 6 10 14 18 22 26 30 34 38 42 46 50\n");
         System.out.println("              3 7 11 15 19 23 27 31 35 39 43 47 51");
           System.out.println("              4 8 12 16 20 24 28 32 36 40 44 48 52");
}
}

public void totalfare()
{
    if(choiceofcabin==1)
            System.out.println("Please pay "+numberofseats*800+" to confirm your booking"); 

else if(choiceofcabin==2)
            System.out.println("Please pay "+numberofseats*500+" to confirm your booking"); 

else if(choiceofcabin==3)
            System.out.println("Please pay "+numberofseats*1000+" to confirm your booking"); 
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