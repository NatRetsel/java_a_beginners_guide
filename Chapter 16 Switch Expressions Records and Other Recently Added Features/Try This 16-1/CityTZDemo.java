/*
 * In this project, you will create a switch expression that yields the time zone of a city given the city's name and 
 * demonstrate the switch in a short program. You will use arrow cases and case constant lists to streamline the switch.
 */
class CityTZDemo {
    
    // Use an enumeration to describe the time zones
    enum TZ { Eastern, Central, Mountain, Pacific, Other };

    public static void main(String[] args) {
        String[] cities = {"New York", "Boston", "Miami", "Chicago",
                            "St. Louis", "Des Moines", "Denver",
                            "Alburquerque", "Seattle", "San Francisco",
                            "Los Angeles", "Portland", "Honolulu"
                        };
        
        // Display the time zone for each city in the array.
        for(String city: cities) {
            TZ zone = switch(city) {
                case "New York", "Boston", "Miami" -> TZ.Eastern;
                case "Chicago", "St. Louis", "Des Moine" -> TZ.Central;
                case "Albuquerque", "Denver" -> TZ.Mountain;
                case "Seattle", "San Francisco", "Los Angeles",
                        "Portland" -> TZ.Pacific;
                default -> TZ.Other;
            };

            if(zone == TZ.Other)
                System.out.println(city + " is outside the Continental US");
            else
                System.out.println(city + " is in the " + zone + " time zone");
        }
    }
}