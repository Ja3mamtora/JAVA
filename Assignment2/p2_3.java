import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class accountCheck {
private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
    ArrayList<Account> list = new ArrayList<Account>();
    Account a1 = new Account("ACC01",500);
    Account a2 = new Account("ACC02",500);
    Account a3 = new Account("ACC03",500);
    Account a4 = new Account("ACC04",500);
    Account a5 = new Account("ACC05",500);
    Account a6 = new Account("ACC06",500);
    Account a7 = new Account("ACC07",500);
    Account a8 = new Account("ACC08",500);
    Account a9 = new Account("ACC09",500);
    Account a10 = new Account("ACC10",500);
for (int i = 1; i < 11; i++) {
           list.add(a[i]);
        }
       
    static String getAccount() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Account Number : ");
            String ac_no = sc.next();
            if (ac_no.charAt(5) ="1"|| ac_no.charAt(5) =’2’ || ac_no.charAt(5) =’3’ || ac_no.charAt(5) =’4’ || ac_no.charAt(5) =’5’ || ac_no.charAt(5) =’6’ || ac_no.charAt(5) =’7’ || ac_no.charAt(5) =’8’ || ac_no.charAt(5) =’9’ || ac_no.charAt(4) =’1’) {return ac_no;
            }
            System.out.println("Invalid  account no");
        }
    }


        String ac_no;
        System.out.print("""
                1. Balance inquiry\n
                2. Withdraw money\n
                3. Deposit money\n
                4. Money Transfer\n
                5. Create Account\n
                6. Deactivate Account\n
                7. Exit\s
                Enter your Choice :\r""");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                ac_no=getAccount();
                list.get(ac_no).BalanceInquiry();
                break;
            case 2:
                ac_no=getAccount();
                int amo;
                System.out.println("Enter amount want to withdraw : ");
                amo = sc.nextInt();
                list.get(ac_no).withdraw(amo);
                break;
            case 3:
                ac_no=getAccount();
                int amo2;
                System.out.println("Enter amount want to Deposit : ");
                amo2 = sc.nextInt();
                list.get(ac_no).deposit(amo2);
                break;
            case 4:
                int amo3;
                ac_no = getAccount();
                System.out.println("Enter amount want to Transfer : ");
                amo3 = sc.nextInt();
                System.out.println("Enter account no : ");
                string ac_no2 = sc.next();
            case 5:
                System.out.println("Enter amount you want to deposit & minimum 300 required :");
                int amo4 = sc.nextInt();
                Account anew = new Account(i + 1, amo4);
                list.add(anew);
                System.out.println("Your account number is "+ (i+1));
                list.get(i).BalanceInquiry();
                break;
            case 6 :
                ac_no = getAccount();
                list.remove(ac_no);
                System.out.println("Your account is removed successfully");
                break;
            default:
                break;
        }

public class Account {
private String id = "ACC00";
    private double balance = 500.0;
    private static double annualInterestRate = 7.0;
    private java.util.DatedateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(String id2, double balance2) {
        id = id2;
        balance = balance2;
    }

    public String getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
