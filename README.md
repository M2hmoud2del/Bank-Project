# Bank Application

## Overview

This Java-based banking application features a graphical user interface (GUI) to facilitate user and admin interactions. It enables users to manage their accounts and transactions, while admins can oversee and manage customer accounts and activities.

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

The GUI components are implemented in this codebase to provide an intuitive user experience.

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
  - Open the application to launch the GUI.
  - Log in with your credentials.
  - Use the dashboard to view and manage your account and transactions.
  - Navigate through the GUI to manage transactions, transfer money, apply for loans, and pay local services bills.
  - Access and update settings through the GUI interface.

- **For Admins**:
  - Open the application to launch the GUI.
  - Log in with admin credentials.
  - Use the GUI to access customer management features to view, add, or remove customers.
  - Use the dashboard to get insights into customer activities and transactions.
  - Manage transactions through the GUI interface.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## Contact

For any inquiries or issues, please contact:

- **Email**: [capoking3@gmail.com](mailto:capoking3@gmail.com)
- **GitHub**: [https://github.com/M2hmoud2del](https://github.com/M2hmoud2del)
