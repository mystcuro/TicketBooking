
package ticket.management;
import java.util.Scanner;

public class returntickets {
    int selectservice;
    Scanner sc=new Scanner(System.in);
    void selectservice()
    {
        System.out.println("Which tickets do you want to return?");
         System.out.println("Press 1 to return tickets for Buses\nPress 2 to return tickets for Train\nPress 3 to return Air Tickets\nPress 4 to return tickets for Launches\nPress 5 to return tickets for Movies\n");
         selectservice=sc.nextInt();
         if(selectservice==1)
         {
             String bus=new String();
             int selectbus,numberoftickets,choicetoproceed;
             System.out.println("Which bus tickets do you want to return :");
             System.out.println("Press 1 to select Hanif Enterprise\nPress 2 to select Soudia Air Con\nPress 3 to select Shohagh Paribahan\nPress 4 to select Shohag Paribahan\nPress 4 to select Shohag Paribahan\nPress 5 to select Ena Transport\nPress 6 to select Shyamoli SP\nPress 7 to select Shohag Paribahan\nPress 8 to select SaintMartin Travels\nPress 9 to select Relax Transport\n") ;
             selectbus=sc.nextInt();
             System.out.println("How many tickets do you want to return ?");
             numberoftickets=sc.nextInt();
             System.out.println("WARNING! : YOU WILL GET ONLY 75% REFUND!");
             System.out.println("Press 1 to get refund\nPress 2 to go back\n");
             choicetoproceed=sc.nextInt();
             if(choicetoproceed==1)
                 System.out.println("You have got BDT"+numberoftickets*600*0.75+"Taka Refund");
         }
         
         else if(selectservice==2)
         {
             String bus=new String();
             int selectbus,numberoftickets,choicetoproceed,kindofticket,rate;
             System.out.println("Which train tickets do you want to return :");
             System.out.println("Press 1 for Dhaka to Shylet(Upaban Express)\\nPress 2 for Dhaka to Khulna(Chitra Express)\\nPress 3 for Dhaka to Chittagong(Shubarna Express)") ;
             selectbus=sc.nextInt();
             System.out.println("How many tickets do you want to return ?");
             numberoftickets=sc.nextInt();
             System.out.println("What kind of tickets do you want to return\nPlease choose\n1 for AC double bed\n2 for AC Single bed\n3 for Normal seat");
             kindofticket=sc.nextInt();
             
             System.out.println("WARNING! : YOU WILL GET ONLY 75% REFUND!");
             System.out.println("Press 1 to get refund\nPress 2 to go back\n");
             choicetoproceed=sc.nextInt();
             if(choicetoproceed==1 && kindofticket==1)
                 System.out.println("You have got BDT"+numberoftickets*1200*0.75+"Taka Refund");
             else if(choicetoproceed==1 && kindofticket==2)
                 System.out.println("You have got BDT"+numberoftickets*1000*0.75+"Taka Refund");
                  else  if(choicetoproceed==1 && kindofticket==3)
                 System.out.println("You have got BDT"+numberoftickets*700*0.75+"Taka Refund");
         }
      else if(selectservice==3)
         {
             String bus=new String();
             int selectbus,numberoftickets,choicetoproceed,kindofticket,rate;
             System.out.println("Which Airways tickets do you want to return :");
             System.out.println("Press 1 to select Biman Bangladesh\nPress 2 to select Regent Airways\nPress 3 to select Novo Air\nPress 4 to select US Bangla Airlines\n");
             selectbus=sc.nextInt();
             System.out.println("How many tickets do you want to return ?");
             numberoftickets=sc.nextInt();
             System.out.println("What kind of tickets do you want to return>");
             System.out.println("Press 1 for Economy Class Tickets(Fare BDT 2500) \n"+" \n Press 2 for Business Class Tickets(Fare BDT 5000)" );
             kindofticket=sc.nextInt();
             
             System.out.println("WARNING! : YOU WILL GET ONLY 75% REFUND!");
             System.out.println("Press 1 to get refund\nPress 2 to go back\n");
             choicetoproceed=sc.nextInt();
             if(choicetoproceed==1 && kindofticket==1)
                 System.out.println("You have got BDT"+numberoftickets*2500*0.75+"Taka Refund");
             else if(choicetoproceed==1 && kindofticket==2)
                 System.out.println("You have got BDT"+numberoftickets*5000*0.75+"Taka Refund");
                  
         }
         else if(selectservice==4)
         {
             String bus=new String();
             int selectbus,numberoftickets,choicetoproceed,kindofticket,rate;
             System.out.println("Which Launch tickets do you want to return :");
             System.out.println("Press 1 to select Surovi 07\nPress 2 to select Sundarban 11\nPress 3 to select MV Karnafully\nPress 4 to select P.S Masud\n");
             selectbus=sc.nextInt();
             System.out.println("How many tickets do you want to return ?");
             numberoftickets=sc.nextInt();
             System.out.println("What kind of tickets do you want to return>");
             System.out.println("Press 1 for double cabin(Fare BDT 800) \n"+" \n Press 2 for Single cabin(Fare BDT 500)"+"\n Press 3 for family cabin(Fare BDT 1000)" );
             kindofticket=sc.nextInt();
             
             System.out.println("WARNING! : YOU WILL GET ONLY 75% REFUND!");
             System.out.println("Press 1 to get refund\nPress 2 to go back to menu\n");
             choicetoproceed=sc.nextInt();
             if(choicetoproceed==1 && kindofticket==1)
                 System.out.println("You have got BDT"+numberoftickets*800*0.75+"Taka Refund");
             else if(choicetoproceed==1 && kindofticket==2)
                 System.out.println("You have got BDT"+numberoftickets*500*0.75+"Taka Refund");
              else if(choicetoproceed==1 && kindofticket==3)
                 System.out.println("You have got BDT"+numberoftickets*1000*0.75+"Taka Refund");
                  
         }
         
      else if(selectservice==6)
         {
             String bus=new String();
             int selectbus,numberoftickets,choicetoproceed,kindofticket,rate,movieticket;
             System.out.println("Which Cinema Hall's tickets do you want to return :");
             System.out.println("Press 1 to select Star Cineplex\nPress 2 to select Blockbuster Cinema Hall");
             selectbus=sc.nextInt();
             System.out.println("Which movie tickets do you want to return?");
              System.out.println("Press 1 to select Halloween (2D)\nPress 2 to select Debi (2D)  \nPress 3 to select Bohemian Rhapsody\nPress 4 to select Venom(3D)\n");
             movieticket=sc.nextInt();
             System.out.println("How many tickets do you want to return ?");
             numberoftickets=sc.nextInt();
             System.out.println("What kind of tickets do you want to return>");
             System.out.println("Press 1 for Premium Hall (BDT 500) \n"+" \n Press 2 for General Hall(Fare BDT 350)");
             kindofticket=sc.nextInt();
             
             System.out.println("WARNING! : YOU WILL GET ONLY 75% REFUND!");
             System.out.println("Press 1 to get refund\nPress 2 to go back to menu\n");
             choicetoproceed=sc.nextInt();
             if(choicetoproceed==1 && kindofticket==1)
                 System.out.println("You have got BDT"+numberoftickets*500*0.75+"Taka Refund");
             else if(choicetoproceed==1 && kindofticket==2)
                 System.out.println("You have got BDT"+numberoftickets*350*0.75+"Taka Refund");
           
                  
         }
    
    }
    
}
