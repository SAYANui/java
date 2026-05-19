public class ArmStrong {
public static void main(String[]args){

    int num=153;
    int num1=num;
    int a=0;
    int d=1;
    for(int m=0;m<num1;num1=num1/10){
        a++;
    }
num1=num;
    for (int b=0;b>num1;num1=num1%10){

        for(int c=0;a>c;c++){
            d*=num1;
        }
    }
    int v=d;
    System.out.println(v);





}




}





/*
public class ArmStrong {
    public static void main(String[] args) {
        int num = 153;

        // 1. Keep copies of the original number
        int temp = num;
        int originalNum = num;

        // 2. Count the number of digits
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // Reset temp to use it for extracting digits
        temp = num;
        int totalSum = 0;

        // 3. Extract digits and calculate power
        while (temp > 0) {
            int rem = temp % 10; // Gets the last digit

            // Calculate rem raised to the power of 'digits'
            int powerResult = 1;
            for (int c = 1; c <= digits; c++) {
                powerResult *= rem;
            }

            totalSum += powerResult; // Add to final sum
            temp = temp / 10;        // Remove the last digit
        }

        // 4. Check if it's an Armstrong number
        if (totalSum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
    }
}
}
 */