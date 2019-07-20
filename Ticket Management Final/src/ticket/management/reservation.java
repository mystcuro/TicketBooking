
package ticket.management;

import java.util.HashMap;
import java.util.Scanner;

class reservation {
    int seatsize,numberofseats;
         void reserve(HashMap<Integer,String>busseat,int seatsize,int numberofseats)
{
    this.seatsize=seatsize;
    this.numberofseats=numberofseats;
    numberofseats=5;
    Scanner sc=new Scanner(System.in);
       //HashMap<Integer,String> busseat=new HashMap();
       int myseats[]=new int[numberofseats+1];
    for(int b=0;b<=seatsize;b++)
        {
            if(b<10 )
                busseat.put(b,"ALREADY OCCUPIED\nPlease Choose Another One");
            else
                busseat.put(b,"NOT OCCUPIED");
        }
       int k=0;
       for(int c=1;c<=this.numberofseats;c++)
       {
           int j=sc.nextInt();
           if(j<=0 && j>this.seatsize)
           {
               System.out.println("Please Enter A Valid  Seat Number");
           }
           if(busseat.get(j).equals("ALREADY OCCUPIED\nPlease Choose Another One"))
             {
                 System.out.println(busseat.get(j));
                    c--;
              }    
           else{
               if(numberofseats-c==0){ System.out.println("All your bookings have been recorded.Please Pay to Confirm");
               myseats[k]=j;
               k++;
               }
               
               else{
                   System.out.println("Booking done,Please select " +(numberofseats-c)+ " more seats");
               busseat.put(j,"ALREADY OCCUPIED\nPlease Choose Another One");
               
               myseats[k]=j;
               k++;
               }
               
       }
       }
        System.out.println("your seats are:");
        for(int m=0;m<k;m++)
        {
            System.out.println(myseats[m]);
        }
    }
    

}