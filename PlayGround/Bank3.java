class Bank3 {
    private String bankName, area;
    private String phoneNumber;
    Bank3() {    // Default constructor
        bankName = "IBank";
        area = "Gandhi Nagar";
        phoneNumber = "9876543210";
    }
    Bank3(String bname, String barea, String phoneNo) {  // Parameterized constructor
        bankName = bname;
        area = barea;
        phoneNumber = phoneNo;
    }
    void displayBankDetails(){
        System.out.println("bank Name: " + bankName);
        System.out.println("Area of bank: " + area);
        System.out.println("Phone number of bank: " + phoneNumber);
    }

    public static void main(String[] args){
        Bank3 bank1 = new Bank3();  //call default constructor
        Bank3 bank2 = new Bank3("IBank", "Jaydev Nagar", "8876543219"); //call Parameterized constructor

        bank1.displayBankDetails();
        System.out.println("***********************");
        bank2.displayBankDetails();
    }
}