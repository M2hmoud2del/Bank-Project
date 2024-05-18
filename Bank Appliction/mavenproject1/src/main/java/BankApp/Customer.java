package BankApp;
import java.util.Objects;
import java.io.Serializable;
import java.util.Random;
public class Customer implements Serializable {
    int cvv;
    String firstName,secondName,startedDate,expiredDate,cardNumber;

    public Customer(String cardNumber, int cvv, String firstName, String secondName, String expiredDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.firstName = firstName;
        this.secondName = secondName;
        this.expiredDate = expiredDate;
    }
    public Customer(String firstName, String secondName,String start) {
        Random r=new Random();
        this.cvv=r.nextInt()%10+r.nextInt()%10*10+r.nextInt()%10*100;
        this.cardNumber="5607 8402 ";
        int min = 10000000;
        int max = 99999999;
        int randomEightDigitNumber = r.nextInt((max - min) + 1) + min;
        this.cardNumber+=Integer.toString(randomEightDigitNumber).substring(0,4)+ " ";
        this.cardNumber+=Integer.toString(randomEightDigitNumber).substring(4);
        this.firstName = firstName;
        this.secondName = secondName;
        this.startedDate=start;
        String month=start.substring(0,2);
        String Year=start.substring(3);
        int y=Integer.parseInt(Year)+5;
        this.expiredDate=month+"/"+Integer.toString(y);
    }
    public String getId() {
        return cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setId(String id) {
        this.cardNumber = id;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.cvv != other.cvv) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.secondName, other.secondName)) {
            return false;
        }
        if (!Objects.equals(this.startedDate, other.startedDate)) {
            return false;
        }
        if (!Objects.equals(this.expiredDate, other.expiredDate)) {
            return false;
        }
        return Objects.equals(this.cardNumber, other.cardNumber);
    }



    @Override
    public String toString() {
        return "Customer{" + "id=" + cardNumber + ", cvv=" + cvv + ", firstName=" + firstName + ", secondName=" + secondName + ", expiredDate=" + expiredDate + '}';
    }
    
}
