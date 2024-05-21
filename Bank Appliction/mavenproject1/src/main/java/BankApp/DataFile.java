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

    public static void AddCustomer(Customer c) throws IOException, ClassNotFoundException {
        List<Customer>customers=readCustomersFromFile("C:\\Users\\capok\\Documents\\GitHub\\Bank-Project\\Bank Appliction\\mavenproject1\\src\\main\\java\\BankApp\\Customers\\Customer.txt");
        customers.add(c);
        writeCustomersToFile("C:\\Users\\capok\\Documents\\GitHub\\Bank-Project\\Bank Appliction\\mavenproject1\\src\\main\\java\\BankApp\\Customers\\Customer.txt",customers);
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
        List<User>users=readUserFromFile("C:\\Users\\capok\\Documents\\GitHub\\Bank-Project\\Bank Appliction\\mavenproject1\\src\\main\\java\\BankApp\\Users\\User.txt");
        users.add(u);
        writeUsersToFile("C:\\Users\\capok\\Documents\\GitHub\\Bank-Project\\Bank Appliction\\mavenproject1\\src\\main\\java\\BankApp\\Users\\User.txt",users);
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
}

