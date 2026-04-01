package study.ch09.ex;

class BankAccount{
    String owner;
    int balance;

    BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        balance -= amount;
        if (balance <= 0){
            System.out.println("잔액부족");
        }
    }

    void printBalance(){
        System.out.println(owner + " : " + balance);
    }
}
public class Main06 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("김은채", 50000);
        account.deposit(5000);
        account.withdraw(45000);
        account.printBalance();
        account.withdraw(15000);
        account.printBalance();
    }
}
