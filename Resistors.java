/*Calculates the resistance in a resistor
Author: Dylan Hematillake
Version: 1.5
*/
package edu.hdsb.gwss.hematillake;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Resistors {

    public static void main(String[] args) {
        //Set values for resistor colour bands
        String[] rColours = {"Black", "Brown", "Red","Orange",
        "Yellow","Green","Blue", "Violet","Grey","White"};
        //Will store the input of the user as an array
        String[] entry = new String [9];
        //boolean to allow program to run
        boolean work = true;
        //user must unput 3 colour bands
        int[] rValues ={0,1,2};
        //the sum of the resistance is initialized
        int sum = 0;
        //stores the index of each colour in order left to right
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        //just to print unit if resistance
        char ohm = 937;
        //Initialize scanner and requests user input
        Scanner scan = new Scanner(System.in);
        String codeColour = scan.nextLine();
        //intializes tokenizer to cut the string at each hyphen
        StringTokenizer st = new StringTokenizer(codeColour, "-");
    
            while(st.hasMoreTokens() && work == true){
                //runs the program if user input is correct
                if(st.countTokens()== 3){
                //stores each token in entry
                for(int i : rValues){
                entry[i] = st.nextToken(); 
                } 
                //rejects invalid input
             }else{
                work = false;
                System.out.println("Invalid input");
                }
               }
            //sets each variable
            index1 =Arrays.asList(rColours).indexOf(entry[0]);
            index2 =Arrays.asList(rColours).indexOf(entry[1]);
            index3 =Arrays.asList(rColours).indexOf(entry[2]);
            
            //resistance = [first colour second colour] * 10 ^ third colour
            sum = (int)((index1*10 + index2)* Math.pow(10, index3));
            
            //prints total resistance
            System.out.println(sum +" " +ohm);
            }
                    
            }

        
        
    
    

