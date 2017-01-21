package edu.hdsb.gwss.hematillake;
/*
Author: Dylan Hematillake
Version 1.2
The program determines the date of Easter based on the year a user inputs based on a series of divisions devised in 1876
*/
import java.util.Scanner;
/**
 *
 * @author 1hematilldyl
 */
public class EasterBunny {

       public static void main(String[] args) {
       //Initialize Scanner for this method
       Scanner scan = new Scanner (System.in);
       
        //Prevent user from inputing non-int data type
    int year = 0;
    while (true) {
       //Request user input
        System.out.println("Please give a year in the form of YYYY");
        try {
        year = Integer.parseInt(scan.next());
        break; 
        }catch (NumberFormatException ignore) {
       }
      }
    //Calculate Step 1-2 Variables
    if(year >= 0){
                
        //Variables
            int a = year%19;
            int b = year/100;
            int c = year%100;
       
        //Step 2 - 4 Calculations for d, e, f
            int d = b/4;
            int e = b%4;
            int f = (b +8)/25;
        
        //Step 5 Calculate g
            int g = (b - f + 1)/3;
        
        //Step 6 -7 Calculate h, i, k
            int h = ((19*a)+b-d-g+15)%30;
            int i = c/4;
            int k = c%4;
        
        //Step 8 Calculate j
            int j = (32 + (2*e)+(2*i)-h-k)%7;
        
        //Step 9 Calculate m
            int m = (a+(11*h)-(22*j))/451;
        
        //Step 10 Calculate p
            int p = (h + j - (7*m)+114)%31;
            
        //Calculate the month of Easter's occurance! 
            int month = (h + j - (7*m)+114)/31;
        
        //Calculate the date of Easter!!
            int day = p+1;
        
        //Determine date to print
        if(month == 3){
        System.out.println("The date of Easter is March " + day);
        }else if (month == 4){
        System.out.println("The date of Easter is April " + day);
        }
    }else{ 
        System.out.println("Please input a year.");
        }
    }
}
