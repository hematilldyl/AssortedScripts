/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.hematillake;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author DYLAN
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Initialized scanner
        Scanner scan = new Scanner(System.in);
        //User inputs word
        String word = scan.nextLine();
        StringTokenizer st = new StringTokenizer(word);
        //Initialize storage of forwards and reverse spelling of word
        ArrayList wordbank = new ArrayList();
        ArrayList wordbank2 = new ArrayList();
        ArrayList sentencebank = new ArrayList();
        while(st.hasMoreTokens()){
            sentencebank.add(st.nextToken());
        //for loop stores each letter of the word forwards
        }
        System.out.println(sentencebank);
        for(int i=0; i<word.length(); i++){
        //for(int i=0; i<word.length(); i++){
            wordbank.add(word.charAt(i));
        }
        //stores each letter of the word backwards
        for(int j = word.length()-1; j>=0; j--){
            wordbank2.add(word.charAt(j));}
         //determines if palindrome. if same spelling backwards forwards, it is. else it is not
             if(wordbank.equals(wordbank2)){
                 System.out.println("Palindrome");
             } else{
                 System.out.println("Not Palindrome");
            }
           }
        }


  
    
    
    

