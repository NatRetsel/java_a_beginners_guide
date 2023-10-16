/*
    This program converts gallons to liters.
*/
class GalToLit {
    public static void main(String[] args) {
        double gallons; // holds the number of gallons
        double liters; // holds the number of liters

        gallons = 10;

        liters = gallons * 3.7854;

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}