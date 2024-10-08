package BankApp;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataFile implements Serializable {
    private static final String CUSTOMER_FILE_PATH = Path.getCustomer();
    private static final String PAYMENTS_FILE_PATH = Path.getPayment();
    private static final String USER_FILE_PATH = Path.getUser();
    
    public static void AddCustomer(Customer c) throws IOException, ClassNotFoundException {
        List<Customer>customers=readCustomersFromFile(CUSTOMER_FILE_PATH);
        customers.add(c);
        writeCustomersToFile(CUSTOMER_FILE_PATH,customers);
    }
    public static boolean RemoveCustomer(String filePath,String id) throws IOException, ClassNotFoundException {
        List<Customer> customers = readCustomersFromFile(filePath);
        boolean removed = customers.removeIf(customer -> customer.getId().equals(id));
        if (removed) {
            writeCustomersToFile(filePath, customers);
        }
        return removed;
    }

    public static List<Customer> readCustomersFromFile(String filePath) throws IOException, ClassNotFoundException {
        List<Customer> customers = new ArrayList<>();
        try (FileInputStream f = new FileInputStream(filePath); ObjectInputStream obj = new ObjectInputStream(f)) {
            while (true) {
                try {
                    Customer customer = (Customer) obj.readObject();
                    customers.add(customer);
                } catch (EOFException e) {
                    obj.close();
                    break;
                }
            }
        }
        return customers;
    }
        public static List<User> readUserFromFile(String filePath) throws IOException, ClassNotFoundException {
        List<User> Users = new ArrayList<>();
        try (FileInputStream f = new FileInputStream(filePath); ObjectInputStream obj = new ObjectInputStream(f)) {
            while (true) {
                try {
                    User u = (User) obj.readObject();
                    Users.add(u);
                } catch (EOFException e) {
                    obj.close();
                    break;
                }
            }
        }
        return Users;
    }
            public static void AddUser(User u) throws IOException, ClassNotFoundException {
        List<User>users=readUserFromFile(USER_FILE_PATH);
        users.add(u);
        writeUsersToFile(USER_FILE_PATH,users);
    }
        public static void writeUsersToFile(String filePath, List<User> users) throws IOException {
        try (FileOutputStream f = new FileOutputStream(filePath); ObjectOutputStream obj = new ObjectOutputStream(f)) {
            for (User u : users) {
                obj.writeObject(u); 
           }
            obj.close();
        }
        }

    
    public static void writeCustomersToFile(String filePath, List<Customer> customers) throws IOException {
        try (FileOutputStream f = new FileOutputStream(filePath); ObjectOutputStream obj = new ObjectOutputStream(f)) {
            for (Customer customer : customers) {
                obj.writeObject(customer); 
           }
            obj.close();
        }
        
    }
        public static boolean FoundCustomer(String filePath,String id) throws IOException, ClassNotFoundException {
            List<Customer> c= DataFile.readCustomersFromFile(filePath);
            for(Customer i:c){
                if(i.getId().equals(id))return true;
            }
            return false;
    }
        public static List<Payments> readPaymentsFromFile(String filePath) throws IOException, ClassNotFoundException {
        List<Payments> payments = new ArrayList<>();
        try (FileInputStream f = new FileInputStream(filePath); ObjectInputStream obj = new ObjectInputStream(f)) {
            while (true) {
                try {
                    Payments payment = (Payments) obj.readObject();
                    payments.add(payment);
                } catch (EOFException e) {
                    break;
                }
            }
        }
        return payments;
    }
         public static void writePaymentsToFile(String filePath, List<Payments> payments) throws IOException {
        try (FileOutputStream f = new FileOutputStream(filePath); ObjectOutputStream obj = new ObjectOutputStream(f)) {
            for (Payments payment : payments) {
                obj.writeObject(payment);
            }
        }
    }
        public static void addPayment(Payments c, String filePath) throws IOException, ClassNotFoundException {
        List<Payments> payments = readPaymentsFromFile(filePath);
        payments.add(c);
        writePaymentsToFile(filePath, payments);
    }
         public static Customer readCustomerFromFile(String filePath) throws IOException, ClassNotFoundException{
         Customer c = new Customer(null, 0, null, null, null);
         try (FileInputStream f = new FileInputStream(filePath); ObjectInputStream obj = new ObjectInputStream(f)) {
            while (true) {
                try {
                     c = (Customer) obj.readObject();
                    
                } catch (EOFException e) {
                    obj.close();
                    break;
                }
            }
        }
        
         return c;
         }
        public static void writeCustomerToFile(String filePath, Customer c) throws IOException {
        try (FileOutputStream f = new FileOutputStream(filePath); ObjectOutputStream obj = new ObjectOutputStream(f)) {
            
                obj.writeObject(c); 
           
            obj.close();
        }
        
    }
}

