public class Loan {
    int tenure;
    float interestRate;
    public double calculateEMI(double principal) {
        double simpleInterest = (principal * interestRate * tenure) / 100;
        double emi = (simpleInterest + principal) / tenure;
        return emi;
    }
    // ...
}
class HomeLoan extends Loan {   // Inheritance
    HomeLoan() {    // Reusing super class member variables
        tenure = 5;
        interestRate = 8.5f;
    }
    public static void main(String[] args) {
        HomeLoan hloan = new HomeLoan();
        double amount = hloan.calculateEMI(200000);   // Calling super class member method
        System.out.println("HomeLoan emi per year..." + amount);
    }
}