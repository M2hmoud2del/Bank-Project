# Bank Application

## Overview

This Java-based banking application provides both user and admin functionalities. Users can manage their accounts and transactions, while admins can oversee and manage customer accounts and activities.

## Features

### For Users:
- **Login**: Secure authentication for accessing user accounts.
- **Dashboard**: Displays the user's name and transaction history.
- **Transaction Window**: View and manage all transactions.
- **Transfer Money**: Transfer funds between accounts.
- **Loan Management**: Apply for and manage loans.
- **Local Services Bills**: Pay local services bills.
- **Settings**: 
  - Change password
  - Toggle dark/light mode
  - Access help resources

### For Admins:
- **Login**: Secure authentication for accessing admin accounts.
- **Customer Management**:
  - **View Customer Details**: Access detailed information about customers.
  - **Add Customers**: Add new customer accounts.
  - **Remove Customers**: Remove existing customer accounts.
- **Logout**: Securely log out from the admin account.
- **Dashboard**: Provides a summary of customer transactions and activities.
- **Transaction Window**: View all transactions across the system.

## Project Structure

The main application code is located in the following directory:

```
Bank-Project/BankApplication/mavenproject1/src/main/java/BankApp/Bank_app.java
```

## Installation

1. **Clone the repository:**
   ```sh
   git clone <repository-url>
   ```

2. **Navigate to the project directory:**
   ```sh
   cd Bank-Project/BankApplication/mavenproject1
   ```

3. **Build the project using Maven:**
   ```sh
   mvn clean install
   ```

4. **Run the application:**
   ```sh
   mvn exec:java -Dexec.mainClass="BankApp.Bank_app"
   ```

## Usage

- **For Users**:
  - Log in with your credentials.
  - Use the dashboard to view and manage your account and transactions.
  - Navigate to the transaction window for transaction details and fund transfers.
  - Apply for loans and pay local services bills under the respective sections.
  - Update your settings as needed.

- **For Admins**:
  - Log in with admin credentials.
  - Access customer management features to view, add, or remove customers.
  - Use the dashboard to get insights into customer activities and transactions.
  - Manage transactions through the transaction window.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries or issues, please contact:

- **Email**: [your-email@example.com](mailto:your-email@example.com)
- **GitHub**: [your-github-profile](https://github.com/your-github-profile)

---

Feel free to adjust the paths and details as needed!
