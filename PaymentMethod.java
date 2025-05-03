// Abstract class
abstract class PaymentMethod {
    String userName;

    PaymentMethod(String userName) {
        this.userName = userName;
    }

    // Abstract method
    abstract void makePayment(double amount);

    // Non-abstract method
    void showUser() {
        System.out.println("User: " + userName);
    }
}