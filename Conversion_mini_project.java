package Chunk_2_Methods;

import java.util.Scanner;

public class Conversion_mini_project {
 
    public static void main(String[] args){
        
        int Convert = 0;
        int light = 0;
        int MPH = 0;
        int KGs = 0;
    
        System.out.println("Please enter variable for which conversion you'd like to convert.");//Ask for conversion
        System.out.println("1 For Light years to MPH");
        System.out.println("2 For MPH years to MPS (Miles per second)");
        System.out.println("3 For Lbs to Kgs");
       
        
        Scanner userInput = new Scanner(System.in);//Scanner cause duh.
        
        Convert = userInput.nextInt();
        
        switch (Convert){
        case 1:
            System.out.println("Please enter a number to indicate how many light years you would like to convert?");
            light = (int) userInput.nextDouble();
            System.out.println( light + " Light year = " + LightToMPH(light) + " MPH");
            break;
        case 2:
            System.out.println("Please enter a number to indicate how many MPH you would like to convert to MPS (Miles per second).");
            MPH = (int) userInput.nextDouble();
            System.out.println( MPH + " Miles per hour = " + MPHToMPS(MPH) + " Miles per second.");
            break;
        case 3:
            System.out.println("Please enter a number to indicate how many KGs you would like to convert to Freedom Units.");
            KGs = (int) userInput.nextDouble();
            System.out.println( KGs + " Kilograms = " + KGsToLBs(KGs) + " Freedom Units (Lbs)");
            break;
            
            }
        
        }
    
    public static double LightToMPH(double light){
    double MPH;
    MPH = (light *  670616629);
    return MPH;
    }
    
    public static double MPHToMPS(double MPH){
    double MPS;
    MPS = (MPH / 3600);
    return MPS;
    }

    public static double KGsToLBs(double KGs){
    double LBs;
    LBs = (KGs * 2.205);
    return LBs;
    }
}
        
