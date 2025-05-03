class paymentSystem {
    public static void main(String[] args) {
        // Creating objects of different payment methods

        PaymentMethod p1 = new CreditCard("Shah Jalal");
        PaymentMethod p2 = new PayPal("Maryam");
        PaymentMethod p3 = new BankTransfer("Pakistan");

 // Making payments
 p1.showUser();
 p1.makePayment(2000);

 System.out.println();

 p2.showUser();
 p2.makePayment(1500);

 System.out.println();

 p3.showUser();
 p3.makePayment(3000);

    }
}
