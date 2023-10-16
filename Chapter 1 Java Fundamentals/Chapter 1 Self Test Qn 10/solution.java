/*
 * Adapt Try This 1-2 so that it prints out a conversion table of inches to meters. Display 12 feet of conversions, inch
 * by inch. Output a blank line every 12 inches. (One meter equals approximately 39.37 inches).
 */
class InchesToMeter {
    public static void main(String[] args){
        double inches, meters, feet;
        
        for (feet=1; feet <= 12; feet++){
            inches = feet * 12;
            meters = inches * 39.37; // convert to liters
            System.out.println(inches + " inches is " + meters + " meters.");
            System.out.println();
        }
    }
 }