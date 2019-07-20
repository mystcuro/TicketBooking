
package ticket.management;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.util.HashMap;
import javax.swing.*;
import javafx.scene.image.Image;
public class TicketManagement {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
       while(true) {
           
              String username;
        int month = 0,Date1 = 0,choicebuyorreturn,price,choiceofservice,exitcode;
        
           System.out.println("Please Enter Your Name");
        username=sc.next();
        
         System.out.println("Please Enter Your Choice: ");
         System.out.println("If You Want To Buy Tickets Press 1");
         System.out.println("If You Want To Return Tickets Press 2\n");
        choicebuyorreturn=sc.nextInt();
        
        if(choicebuyorreturn==1)
        {
            
            System.out.println("Press 1 to buy tickets for Buses\nPress 2 to buy tickets for Train\nPress 3 to buy Air Tickets\nPress 4 to buy tickets for Launches\nPress 5 to buy tickets for Movies\n");
            choiceofservice=sc.nextInt();
            System.out.println("Enter your destination");
        String des=sc1.nextLine();
        System.out.println("Enter your departing place");
        String s1=sc1.nextLine();
        System.out.println("Enter departing date:DD/MM");
        Date1=sc.nextInt();
        month=sc.nextInt();
        /*System.out.println("Enter departing time(HH:MM:SS):");
        String s2=sc.nextLine();*/
            if(choiceofservice==1)
            {
               Bus busobj=new Bus();
               busobj.selectbus();
               busobj.reserve(busobj.busseat,busobj.seatsize,busobj.numberofseats);
               busobj.totalfare();
                System.out.println("\n"+username+" Your bookings have been confirmed");
            }
            else if (choiceofservice==2)
            {   
                 train trainobj=new train();
                 trainobj.reserve(trainobj.trainseat,trainobj.seatsize,trainobj.numberseatsof);
                trainobj.totalfare();
            }
        else if (choiceofservice==3)
            {
                  plane planeobj=new plane();
                planeobj.selectplane();
                planeobj.showseatplan();
                if(planeobj.choiceofclass==1)
                   planeobj.reserve(planeobj.economyseat,planeobj.seatsizeofeconomy,planeobj.numberofseats);
                 if(planeobj.choiceofclass==2)
                   planeobj.reserve(planeobj.businessseat,planeobj.seatsizeofbusiness,planeobj.numberofseats);
                
                planeobj.totalfare();
                     System.out.println("\n"+username+" Your bookings have been confirmed");
            }
            else if (choiceofservice==4)
            {
                      launch launchobj=new launch();
                launchobj.selectlaunch();
                launchobj.showseatplan();
                if(launchobj.choiceofcabin==1)
                   launchobj.reserve(launchobj.doublecabin,launchobj.seatsize,launchobj.numberofseats);
                else  if(launchobj.choiceofcabin==2)
                   launchobj.reserve(launchobj.singlecabin,launchobj.seatsize,launchobj.numberofseats);
                 else  if(launchobj.choiceofcabin==3)
                   launchobj.reserve(launchobj.familycabin,launchobj.seatsize,launchobj.numberofseats);
                
                launchobj.totalfare();
                     System.out.println("\n"+username+" Your bookings have been confirmed");
            }
            else if (choiceofservice==5)
            {
                  movies mobj=new movies();
                mobj.selectmovies();
                mobj.showseatplan();
                if(mobj.choiceofclass==1)
                   mobj.reserve(mobj.premiumseat,mobj.seatsizeofpremium,mobj.numberofseats);
                 if(mobj.choiceofclass==2)
                   mobj.reserve(mobj.generalseat,mobj.seatsizeofgeneral,mobj.numberofseats);
                
                mobj.totalfare();
                     System.out.println("\n"+username+" Your bookings have been confirmed");
            }
                    Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR,2018);
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.DATE,Date1);
        Date date=cal.getTime();
        System.out.println(date);
        }
    
        else {
            returntickets obj=new returntickets();
            obj.selectservice();
            
            
        }
    System.out.println("\nPress 1 to get service again\nPress 2 to exit");
       exitcode=sc.nextInt();
       if(exitcode==2) break;
       }
       
    }
}
