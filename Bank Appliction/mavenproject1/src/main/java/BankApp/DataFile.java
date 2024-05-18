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

    public static void AddCustomer(Customer c) throws IOException {
        FileOutputStream f = new FileOutputStream("C:\\Users\\capok\\Documents\\GitHub\\Bank-Project\\Bank Appliction\\mavenproject1\\src\\main\\java\\BankApp\\Customers\\Customer.txt");
        ObjectOutputStream obj = new ObjectOutputStream(f);
        obj.writeObject(c);
        obj.close();
    }
    public static boolean RemoveCustomer(String filePath,int id) throws IOException, ClassNotFoundException {
        if (FoundCustomer(filePath,id)) {
            List<Customer> l=readCustomersFromFile(filePath);
             for(Customer i:l){
                 if(i.getId()==id){
                     l.remove(i);
                     break;
                 }
             }
             writeCustomersToFile(filePath,l);
            return true;
        }
        return false;
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

    private static void writeCustomersToFile(String filePath, List<Customer> customers) throws IOException {
        try (FileOutputStream f = new FileOutputStream(filePath); ObjectOutputStream obj = new ObjectOutputStream(f)) {
            for (Customer customer : customers) {
                obj.writeObject(customer); 
           }
            obj.close();
        }
        
    }
        public static boolean FoundCustomer(String filePath,int id) throws IOException, ClassNotFoundException {
            List<Customer> c= DataFile.readCustomersFromFile(filePath);
            for(Customer i:c){
                if(i.getId()==id)return true;
            }
            return false;
    }
}

