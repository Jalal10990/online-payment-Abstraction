
//concrete class 1

class CreditCard extends PaymentMethod {
    
    CreditCard(String userName){
        super(userName);
    }
void makePayment(double amount){
    System.out.println("Payment of $" + amount + " made through Credit Card.");
}
}
