class Loan3{
    protected int tenure;
    protected float interestRate;

    Loan3(int tenure, float interestRate){
        this.tenure = tenure;
        this.interestRate = interestRate;
    }
}

class HomeLoan2 extends Loan3{
    HomeLoan2(){
        super(5,8.5f);  //invoking super class constructor
    }
    public double calculateEMI(double principal){
        double simpleInterest = (principal * interestRate * tenure) / 100;
        double emi = (simpleInterest + principal) / tenure;
        int additionalTax = 200;
        return emi + additionalTax;
    }
}

class ExecuteLoan1{
    public static void main (String[] args) {
        HomeLoan2 loan = new HomeLoan2();     //Runtime polymorphism
        double hloan = loan.calculateEMI(2000000);
        System.out.println("Home loan emi per year..." + hloan);
    }
}