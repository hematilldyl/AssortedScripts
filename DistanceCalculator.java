
package edu.hdsb.gwss.hematillake;

import java.util.ArrayList;
import java.util.Scanner;

/*
Author: Dylan Hematillake
Version: 1.4
Purpose: To calculate the between two places on the planet Earth, given their latitude and longitude from user input*/

public class DistanceCalculator {
    
//Convert Degrees to Radians
final static double DtR = 180/Math.PI;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize Scanner
        Scanner scan = new Scanner(System.in);
        //Set Array to Store names
        ArrayList<String> locations = new ArrayList<String>();
        //Collect location names
        System.out.println("State Location 1");
        locations.add(scan.nextLine());
        System.out.println("State Location 2");
        locations.add(scan.nextLine());
        
        //Array to store first location information in degrees
        ArrayList<Double> distance1 = new ArrayList<Double>();
        System.out.println("Latitude");
        //Automatically converts to radians
        distance1.add(Math.toRadians(scan.nextDouble()));
        System.out.println("Longitiude");
        distance1.add(Math.toRadians(scan.nextDouble()));
        
        //Array to store second location information in degrees
        ArrayList<Double> distance2 = new ArrayList<Double>();
        System.out.println("Latitiude 2");
        distance2.add(Math.toRadians(scan.nextDouble()));
        System.out.println("Longitude 2");
        distance2.add(Math.toRadians(scan.nextDouble()));
        
        //Print information
        System.out.println(locations);
        System.out.println(distance1);
        System.out.println(distance2);
        
        //Calculate Distance
        double a = Math.sin(distance1.get(0));
        double b = Math.sin(distance2.get(0));
        double c = Math.cos(distance1.get(0));
        double d = Math.cos(distance2.get(0));
        double e = Math.cos(distance2.get(1) - distance1.get(1));
        
        double distance =  6378.8 * Math.acos(a * b + c * d *e);
        
        //Print Distance
        System.out.println(distance);
    }        
   }
    

