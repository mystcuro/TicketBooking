
package ticket.management;

import java.util.HashMap;
import java.util.Scanner;


public class movies extends reservation implements totalfare {
   int numberofseats;
   final int seatsizeofpremium=97;
   final int seatsizeofgeneral=97;
   public int choiceofhall,choiceofmovies,choiceofclass;
  HashMap<Integer,String>premiumseat=new HashMap();
    HashMap<Integer,String> generalseat=new HashMap();
   Scanner sc=new Scanner(System.in);
   
  
      
void selectmovies()

   { System.out.println("Press 1 to buy movie tickets at Star Cineplex\nPress 2 to buy movie tickets for Blockbuster Cinema Hall\n");
       choiceofhall=sc.nextInt();
       
       System.out.println("Movie Name:                   First Show          Second Show         Third Show");
       System.out.println("Halloween (2D)                11:30AM                4:30PM                    9:00PM      ");
       System.out.println("Debi (2D)                     10:30AM                1:30PM                    7:00PM      ");
       System.out.println("Bohemian Rhapsody              9:30AM                  2:30PM                    6:00PM      ");
       System.out.println("Venom(3D)                      11:30AM                3:00PM                    6:30PM      ");

    System.out.println("Press 1 to select Halloween (2D)\nPress 2 to select Debi (2D)  \nPress 3 to select Bohemian Rhapsody\nPress 4 to select Venom(3D)\n");
    choiceofmovies=sc.nextInt();
     System.out.println("How Many Seats Do You Want to Book?");
      numberofseats=sc.nextInt();
    System.out.println("Press 1 for Premium Hall(BDT 500) \n"+" \n Press 2 for General Hall(Fare BDT 350)" );
      choiceofclass=sc.nextInt();

}
void showseatplan()
{System.out.println("Choose Seats: ");
if(choiceofclass==1)
{
           System.out.println("Seat Plan For Premium Hall : ");
    for (int i = 1; i <=96; i++) {
        System.out.print(i+" ");
        if(i%24==0) System.out.print("\n");
        else if(i%8==0) System.out.print("     ");
        
    }
}
if(choiceofclass==2)
{
           System.out.println("Seat Plan For General Hall : ");
    for (int i = 1; i <=96; i++) {
        System.out.print(i+" ");
        if(i%24==0) System.out.print("\n");
        else if(i%8==0) System.out.print("     ");
        
    }
}
     
}

public void totalfare()
{
    if(choiceofclass==1)
            System.out.println("Please pay "+numberofseats*500+" to confirm your booking"); 

else if(choiceofclass==2)
            System.out.println("Please pay "+numberofseats*350+" to confirm your booking"); 
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