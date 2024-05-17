package BankApp;
import java.util.Objects;
import java.io.Serializable;
public class Customer implements Serializable {
    int id,cvv;
    String firstName,secondName,expiredDate;

    public Customer(int id, int cvv, String firstName, String secondName, String expiredDate) {
        this.id = id;
        this.cvv = cvv;
        this.firstName = firstName;
        this.secondName = secondName;
        this.expiredDate = expiredDate;
    }

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
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
        if (this.id != other.id) {
            return false;
        }
        if (this.cvv != other.cvv) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.secondName, other.secondName)) {
            return false;
        }
        return Objects.equals(this.expiredDate, other.expiredDate);
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", cvv=" + cvv + ", firstName=" + firstName + ", secondName=" + secondName + ", expiredDate=" + expiredDate + '}';
    }
    
}
