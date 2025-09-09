package atm;
import java.util.*;
public class Main 
{
 public static void main(String[] args)
 {
     Scanner scan = new Scanner(System.in);
     Account account = new Account();

     System.out.println("Welcome TO ATM");
     System.out.print("1. Create Account\n2. Exit\n");
     System.out.print("Enter Your Choice : ");
     
     
     byte choice = scan.nextByte();
     scan.nextLine();

     if(choice==1) 
     {
         account.createAccount();
         System.out.print("1. Login\n2. Exit\n");
         System.out.print("Enter Your Choice : ");
         
         choice = scan.nextByte();
         scan.nextLine();
         
         while (choice > 2 || choice < 1)
         {
             System.out.println("Please, Enter Valid Choice");
             choice = scan.nextByte();
             scan.nextLine();
         }

         if(choice==1)
         {
             while(true) 
             {
                 System.out.print("Enter Your Account Number : ");
                 String accountNumber = scan.nextLine();
                 System.out.print("Enter Your Account Password : ");
                 String accountPassword = scan.nextLine();
                 if (account.login(accountNumber, accountPassword)) 
                 {
                     System.out.println("\n********************WELCOME BACK " + account.getname() + "*******************");
                     while(true) 
                     {
                         System.out.print("1. Deposit\n2. Withdraw\n3. Transfer\n4. Transition History\n5. Exit\n");
                         System.out.print("Enter Your Choice : ");
                         choice = scan.nextByte();
                         scan.nextLine();
                         while (choice > 5 || choice < 1) 
                         {
                             System.out.println("Please, Enter Valid Choice");
                             choice = scan.nextByte();
                             scan.nextLine();
                         }
                         System.out.println();
                         switch (choice) 
                         {
                             case 1:
                                 System.out.print("Enter Amount to Deposit : ");
                                 double depositAmount = scan.nextDouble();
                                 account.amountDeposit(depositAmount);
                                 System.out.println();
                                 break;
                             case 2:
                                 System.out.print("Enter Amount to Withdraw : ");
                                 double withdrawAmount = scan.nextDouble();
                                 scan.nextLine();
                                 account.amountWithdraw(withdrawAmount);
                                 System.out.println();
                                 break;
                             case 3:
                                 System.out.print("Enter Transfer Account Holder Name : ");
                                 String holderName = scan.nextLine();
                                 System.out.print("Enter Transfer Account Number : ");
                                 String transferAccountNumber = scan.nextLine();
                                 System.out.print("Enter Amount to Transfer : ");
                                 double transferAmount = scan.nextDouble();
                                 scan.nextLine();
                                 account.transferAmount(holderName, transferAccountNumber, transferAmount);
                                 System.out.println();
                                 break;
                             case 4:
                                 account.miniStatement();
                                 System.out.println();
                                 break;
                             case 5:
                                 System.out.println("Thank You for Using ATM");
                                 System.exit(0);
                         }
                     }


                 } 
                 else 
                 {
                     System.out.println("Please, Enter valid Account Details");
                 }
             }

         }
         else
         {
             System.out.println("Thank You for Using ATM");
             System.exit(0);
         }

     }
     else 
     {
         System.out.println("Thank You for Using ATM");
         System.exit(0);
     }

     scan.close();

 }


}