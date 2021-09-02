/*
 * Name: CHOO YONG HAN
 * DAY 3 Project Submission
 */
package day3.project.cab.fee.calculation;

import java.util.Scanner;

class Cab{
    int fare;
    int distance;
    
    public Cab(){
        fare = 30;
    }
    
    //parameterized constructor
    public Cab(int amount ){
        fare = amount;
    }
    
    void displayFare(){
        System.out.println("Total Fare: Rs " + fare);
    }
   
}

public class Day3ProjectCabFeeCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cabDistance;
         
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the cab distance from user (km): ");
        cabDistance = sc.nextInt();
        
        if(cabDistance > 5)
        {
           Cab ob = new Cab(30 + 10 * (cabDistance - 5));
           System.out.print("Enter the distance from user (km): ");
           ob.distance = sc.nextInt();
           ob.fare += 10 * ob.distance;
           ob.displayFare();
        } 
        
        else
        {
           Cab ob = new Cab();
           System.out.print("Enter the distance from user (km): ");
           ob.distance = sc.nextInt();
           ob.fare += 10 * ob.distance;
           ob.displayFare();
        } 
    }
    
  }
    

