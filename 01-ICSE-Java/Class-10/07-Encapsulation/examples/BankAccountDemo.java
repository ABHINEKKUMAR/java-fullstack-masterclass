// BankAccountDemo: ICSE Java worked example.
public class BankAccountDemo {
    public static void main(String[] args) {
        Account account=new Account();account.deposit(250);System.out.println(account.getBalance());
    }
}
class Account {
    private double balance;
    void deposit(double amount){if(amount>0)balance+=amount;}
    double getBalance(){return balance;}
}
