# codsoft_taskno3
# ATM Machine

This is a simple Java console application simulating an ATM Machine. Users can check their balance, withdraw money, deposit money, and exit the program.

## How to Use

1. **Compile the Code:**
    - Ensure you have a Java Development Kit (JDK) installed.
    - Open a terminal and navigate to the directory containing the `User_account.java` file.
    - Compile the code using the command: `javac User_account.java`

2. **Run the Program:**
    - Run the compiled program with the command: `java User_account`
    - Follow the on-screen instructions to select an option from the ATM menu.

3. **ATM Operations:**
    - **Check Balance:** View the current account balance.
    - **Withdraw:** Withdraw a specified amount from the account.
    - **Deposit:** Deposit a specified amount into the account.
    - **Exit:** Terminate the program.

4. **Initial Balance:**
    - The program initializes the account balance to $9999.

## Code Structure

The code is organized into two classes (`Atm` and `User_account`). Here's a brief overview:

- `Atm` class: Manages the account balance and performs withdrawal, deposit, and balance checking operations.
- `User_account` class: Handles user interaction and provides a simple menu for users to choose ATM operations.

## ATM Operations Implementation

- **Withdrawal:** Checks if the withdrawal amount is within the account balance before processing the transaction.
- **Deposit:** Adds the specified amount to the account balance.
- **Check Balance:** Displays the current account balance.

## Improvements and Modifications

Feel free to modify and enhance the code to suit your preferences or add additional features. Consider incorporating additional security measures, handling edge cases, or implementing a more advanced transaction history system.

