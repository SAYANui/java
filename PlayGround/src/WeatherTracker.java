/*
Weather Data Tracker
We want to find the highest temperature recorded across a specific data set:

3 Cities (Layer)

7 Days of the week (Row)

4 Time slots per day (Column — e.g., Morning, Noon, Evening, Night)
 */
import java.util.Arrays;

public class WeatherTracker {

    public static void main(String[] args) {
        // Names for our dimensions to make the output readable
        String[] cities = {"New York", "London", "Tokyo"};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] timeSlots = {"Morning", "Noon", "Evening", "Night"};

        // 3D Array: [City][Day][TimeSlot]
        // Hardcoded some realistic temperature data (in Celsius)
        double[][][] temperatureData = {
                // City 0: New York
                {
                        {15.5, 22.0, 18.5, 14.0}, // Mon: Morn, Noon, Eve, Night
                        {16.0, 24.2, 19.0, 15.0}, // Tue
                        {14.8, 21.5, 17.5, 13.5}, // Wed
                        {17.0, 26.0, 20.0, 16.0}, // Thu
                        {18.5, 27.5, 22.0, 17.5}, // Fri
                        {19.0, 29.1, 23.0, 18.0}, // Sat (Highest here: 29.1)
                        {16.5, 23.0, 19.5, 15.0}  // Sun
                },
                // City 1: London
                {
                        {12.0, 17.5, 15.0, 11.0}, // Mon
                        {13.0, 18.0, 14.5, 12.0}, // Tue
                        {11.5, 16.0, 14.0, 10.5}, // Wed
                        {14.0, 19.5, 16.0, 13.0}, // Thu
                        {15.0, 21.0, 17.5, 14.0}, // Fri
                        {14.5, 20.0, 16.5, 13.5}, // Sat
                        {13.0, 18.5, 15.0, 12.0}  // Sun
                },
                // City 2: Tokyo
                {
                        {20.0, 26.5, 24.0, 21.0}, // Mon
                        {21.5, 28.0, 25.0, 22.0}, // Tue
                        {22.0, 28.5, 26.0, 23.0}, // Wed
                        {20.5, 27.0, 24.5, 21.5}, // Thu
                        {23.0, 29.0, 27.0, 24.0}, // Fri
                        {22.5, 28.0, 25.5, 23.0}, // Sat
                        {21.0, 26.0, 23.5, 20.5}  // Sun
                }
        };

        // Variables to keep track of the peak temperature and its context
        double maxTemp = temperatureData[0][0][0];
        int maxCityIdx = 0;
        int maxDayIdx = 0;
        int maxTimeIdx = 0;

        // Flattened nested loops to traverse the 3D grid
        for (int city = 0; city < temperatureData.length; city++) {
            for (int day = 0; day < temperatureData[city].length; day++) {
                for (int time = 0; time < temperatureData[city][day].length; time++) {

                    double currentTemp = temperatureData[city][day][time];

                    if (currentTemp > maxTemp) {
                        maxTemp = currentTemp;
                        maxCityIdx = city;
                        maxDayIdx = day;
                        maxTimeIdx = time;
                    }
                }
            }
        }

        // Print the results cleanly
        System.out.println("=== Weather Analysis Report ===");
        System.out.printf("Highest Recorded Temperature: %.1f°C\n", maxTemp);
        System.out.println("Location: " + cities[maxCityIdx]);
        System.out.println("Day: " + days[maxDayIdx]);
        System.out.println("Time of Day: " + timeSlots[maxTimeIdx]);
    }
}