
//Concrete class 3

class BankTransfer extends PaymentMethod {
    BankTransfer(String userName){
        super(userName);

    }
    void makePayment(double amount){
        System.out.println("Payment of $" + amount + " made through Bank Transfer.");
    }
}
