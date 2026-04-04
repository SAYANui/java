class ABCBank{
    int phone=312345;
    double getPhone(){
        System.out.print("phone number received");
        return phone;
    }
    public static void main(String[] args) {
        ABCBank bank=new ABCBank();
        System.out.print(bank.getPhone());
    }
}