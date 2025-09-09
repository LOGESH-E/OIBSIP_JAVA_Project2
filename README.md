```markdown
# 💳 Project Report: ATM Interface System in Java

## 🎯 Objective
To simulate a simple ATM banking system using object-oriented principles in Java that allows users to:
- Create an account
- Login securely
- Deposit money
- Withdraw cash
- Transfer funds
- View a mini statement

---

## 🛠️ Technologies Used
- **Programming Language:** Java  
- **Tools/IDE:** IntelliJ IDEA  
- **Java Concepts Applied:**
  - Classes and Objects
  - Encapsulation (Getters/Setters)
  - Control Structures (`if-else`, `switch-case`, loops)
  - `ArrayList` for storing transaction history
  - `Scanner` for user input

---

## 📋 Features Implemented

### 🧑‍💼 1. Account Creation
- Inputs: **Name**, **Account Number**, **Password**
- Displays confirmation message after successful creation.

### 🔐 2. Secure Login
- Requires **Account Number** and **Password**.
- Access granted only if credentials match.

### 💰 3. Deposit
- Accepts any valid amount.
- Updates balance accordingly.
- Records transaction in history.

### 🏧 4. Withdraw
- Allowed only in multiples of 100, 200, or 500.
- System checks for sufficient balance.
- Updates balance if valid, else shows error.

### 💸 5. Fund Transfer
- Inputs: **Recipient Name**, **Recipient Account Number**, **Amount**.
- Transfer allowed only if balance is sufficient.
- Records transaction in sender and recipient history.

### 📜 6. Mini Statement
- Displays all past transactions in list format.

### 🚪 7. Exit
- Exits program safely.

---

## 🧠 Core Concepts Practiced
- **OOP Principles:** Encapsulation using private attributes & methods.
- **Input Handling:** Using `Scanner` for real-time user interaction.
- **Condition Checking:** Validating ranges and user input choices.
- **Data Structures:** `ArrayList` used for transaction history.
- **User Feedback:** Real-time confirmations and error messages.

---

## 📂 Suggested Project Structure
```

atm-interface-java/
├─ src/
│  └─ main/
│     └─ java/
│        └─ atm/
│           ├─ Main.java
│           ├─ models/
│           │  ├─ Account.java
│           │  └─ Transaction.java
│           └─ services/
│              └─ BankService.java
└─ README.md

````

---

## 🚀 Running the Project
### In IntelliJ IDEA:
1. Open project → *Run `Main.java`*

### In Terminal:
```bash
javac -d out src/main/java/atm/**/*.java
java -cp out atm.Main
````

---

## 📸 Output Screenshots

* Screenshot 2025-08-04 085345
* Screenshot 2025-08-04 085411

---

## 📄 License

MIT License © 2025 Logesh

```
```
