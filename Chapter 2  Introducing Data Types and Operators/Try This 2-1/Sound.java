/*
 * This project creates a program that computes how far away, in feet a listener is from a lightning strike. Sound 
 * travels approximately 1,100 feet per second through air. Thus, knowing the interval between the time you see
 * a lightning bolt and the time the sound reaches you enables you to compute the distance to the lightning. For this
 * project, assume that the time interval is 7.2 seconds.
 * 
 * Extra challenge: you can compute the distance to a large object, such as a rock wall, by timing the echo. For example,
 * if you clap your hands and time how long it takes for you to hear the echo, then you know the total round-trip time.
 * Dividing this value by two yields the time it takes the sound to go one way. You can then use this value to compute
 * the distance to the object. Modify the preceding program so that it coputes the distance, assuming that the time
 * interval is that of an echo
 */
class Sound {
    public static void main(String[] args) {
        double time_interval = 7.2; // seconds
        int speed = 1_100; // feet per second
        double distance = speed * time_interval; //feet

        System.out.println("The lightning is " + distance + " feet away.");

        // extra challenge - assume time interval is that of an echo
        System.out.println("If it were an echo, the distance is: "+ distance/2);


    }
}