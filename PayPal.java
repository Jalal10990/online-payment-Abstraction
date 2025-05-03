//concrete class 2


class PayPal extends PaymentMethod{
    PayPal(String userName){
        super(userName);
    }
    void makePayment(double amount){
        System.out.println("Payment of $" + amount + " made through PayPal.");
    }
}
