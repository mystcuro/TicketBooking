/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.management;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class train extends reservation implements totalfare{
    int x,numberseatsof;
    final int seatsize=50;
    HashMap<Integer,String> trainseat=new HashMap();
    Scanner in1=new Scanner(System.in);
    Scanner in2=new Scanner(System.in);
    train(){
    System.out.println("please choose your destination");
        System.out.println("Press 1 for Dhaka to Shylet(Upaban Express)\nPress 2 for Dhaka to Khulna(Chitra Express)\nPress 3 for Dhaka to Chittagong(Shubarna Express)");
       int x1=in1.nextInt();
    
        System.out.println("Please choose\n1 for AC double bed\n2 for AC Single bed\n3 for Normal seat");
        x=in1.nextInt();
        
        
             System.out.println("How many seats do u want?");
        numberseatsof=in2.nextInt();
            System.out.println("Please choose bed number");
}
    public void totalfare()
{
    int choiceofpaymentmethod;
    String trxid=new String();
    String mobilenumber=new String();
    if(x==1){
    System.out.println("Please pay "+numberseatsof*1200+"for ac double bed to confirm your booking");
    }
    else if(x==2)
        System.out.println("Please pay "+numberseatsof*1000+" for ac single bed to confirm your booking");
    else
        System.out.println("Please pay "+numberseatsof*700+"for normal seats to confirm your booking");
    System.out.println("Please Choose Your Payment Method\nPress 1 for Bikash\nPress 2 for NexusPay\nPress 3 for Citytouch\nPress 4 for Upay");
    choiceofpaymentmethod=in1.nextInt();
    System.out.println("Please provide your phone number");
    mobilenumber=in1.next();
    System.out.println("Please Enter the transaction ID ");
    trxid=in1.next();

}
}