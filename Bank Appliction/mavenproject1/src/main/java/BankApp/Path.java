package BankApp;
public class Path {
    static final String user="src\\main\\java\\BankApp\\Users\\User.txt";
    static final String payment="src\\main\\java\\BankApp\\Bills\\Payments.txt";
    static final String customer="src\\main\\java\\BankApp\\Customers\\Customer.txt";

    public static String getUser() {
        return user;
    }

    public static String getPayment() {
        return payment;
    }

    public static String getCustomer() {
        return customer;
    }
    
}
