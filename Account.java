package atm;

import java.util.*;
public class Account {
    Scanner scan  = new Scanner(System.in);
    private  String name;
    private  double balance;
    private  String account_number;
    private  String account_password;
    ArrayList<String> transitionHistory = new ArrayList<>();
    Account()
    {}


    public String getname()
    {
        return name;
    }
    public  double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


    public  void viewBalance() {
        System.out.println("Current Balance: "+ balance);

    }

    public void createAccount()
    {
        System.out.print("Enter Your Name : ");
        this.name = scan.nextLine();
        System.out.print("Enter Your Account Number : ");
        this.account_number = scan.nextLine();
        System.out.print("Enter Your Account Password : ");
        this.account_password = scan.nextLine();

        System.out.println("Account Created Successfully");
    }

    public boolean login(String accountNumber, String accountPassword)
    {
        if(accountNumber.equals(account_number) && accountPassword.equals(account_password))
        {
            return true;
        }
        return false;
    }


    public  void amountDeposit(double dAmount) 
    {


        setBalance(dAmount + getBalance());
        System.out.print("Deposit Amount: "+ dAmount+" ");
        viewBalance();
        System.out.println("Amount Deposit Successfully");
        transitionHistory.add("Deposit Amount " + getBalance());
    }

    public void amountWithdraw(double wAmount) {
        if((wAmount)%500 == 0 || (wAmount)%100==0 || (wAmount)%200==0)
        {
            if((getBalance()-wAmount) > 0)
            {

                setBalance(getBalance() - wAmount);
                System.out.print("Withdraw Amount "+ wAmount+" ");
                viewBalance();
                System.out.println("Amount Withdraw Successfully");
                transitionHistory.add("WithDraw Amount " + getBalance());

            }
            else
            {
                System.out.println("Insufficient Balance...!!!");
            }
        }
        else
        {
            System.out.println("Enter Amount in Multiple of 100, 200 or 500.");
        }

    }

    public void miniStatement() {
        System.out.println("----- Transaction History -----");
        for(String t: transitionHistory)
        {
            System.out.println(t);
        }
    }

    public void transferAmount(String holderName, String accountNumber, double transferAmount)
    {

        if(getBalance()>transferAmount)
        {
            setBalance(getBalance() - transferAmount);
            System.out.println("Your Balance : "+getBalance());
            System.out.println("Amount Transfer to "+holderName);
            transitionHistory.add("Amount transfer : "+transferAmount);
        }
        else
        {
            System.out.println("Insufficient balance..");
        }

    }


}