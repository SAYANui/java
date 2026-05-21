public class ArmStrong {
public static void main(String[]args){

    int num=5474;
    int num1=num;
    int ornum=num;
    int ran=0;
    int count=0;
    for(;ran<num1;num1=num1/10){
        count++;
    }
num1=num;
    int ran1=0;

    int bnum=0;
    for (;num1>ran1;num1=num1/10){
int rem=num1%10;
        int totalnum=count;
int anum=1;
        for(;totalnum>0;totalnum--){
            anum=anum*rem;
        }
        bnum+=anum;
    }


    System.out.println(bnum);
    if(bnum==ornum){
        System.out.println("the number ia armstrong number");
    }
else {
    System.out.println("the number NOT armstrong number");
    }




}




}





/*
// Define a public class named 'ArmStrong' (the blueprint of our program)
public class ArmStrong {

    // The main method: this is the starting point where the program begins executing
    public static void main(String[] args) {

        // Create an integer variable 'num' and store the number we want to check (153)
        int num = 153;

        // Create 'temp' and store a copy of 'num' (153) to use for counting digits
        int temp = num;

        // Create 'originalNum' and store another copy of 'num' (153) for the final comparison
        int originalNum = num;

        // Create a counter variable 'digits' and set it to 0 to hold the total count of digits
        int digits = 0;

        // Start a loop that runs as long as 'temp' is greater than 0 (to count the digits)
        while (temp > 0) {

            // Increase the 'digits' count by 1 for every digit we find
            digits++;

            // Remove the last digit from 'temp' by dividing it by 10 (e.g., 153 becomes 15, then 1, then 0)
            temp = temp / 10;
        } // End of the digit-counting loop

        // Refill 'temp' with the original number (153) because it became 0 in the loop above
        temp = num;

        // Create 'totalSum' and set it to 0 to accumulate the powers of each digit
        int totalSum = 0;

        // Start a second loop to extract digits and calculate their powers, running while 'temp' > 0
        while (temp > 0) {

            // Get the last digit of 'temp' using the remainder operator (e.g., 153 % 10 gives 3)
            int rem = temp % 10;

            // Create 'powerResult' and set it to 1 to hold the result of the multiplication
            int powerResult = 1;

            // Start a loop that runs exactly 'digits' times (3 times for the number 153)
            for (int c = 1; c <= digits; c++) {

                // Multiply 'powerResult' by the extracted digit 'rem' to calculate the power (e.g., 3 * 3 * 3)
                powerResult *= rem;
            } // End of the power calculation loop

            // Add the calculated power result to our running total 'totalSum'
            totalSum += powerResult;

            // Remove the last digit from 'temp' by dividing it by 10 so we can process the next digit
            temp = temp / 10;
        } // End of the digit extraction and power calculation loop

        // Check if the calculated 'totalSum' is equal to our saved 'originalNum'
        if (totalSum == originalNum) {

            // If they are equal, print that the number is an Armstrong number
            System.out.println(originalNum + " is an Armstrong number.");

        // If they are not equal, execute the code inside this 'else' block instead
        } else {

            // Print that the number is NOT an Armstrong number
            System.out.println(originalNum + " is NOT an Armstrong number.");
        } // End of the if-else check
    } // End of the main method
} // End of the ArmStrong class
 */