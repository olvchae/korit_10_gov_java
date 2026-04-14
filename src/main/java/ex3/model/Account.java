package ex3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private static int sequence = 1;
    private int accountNo;
    private String owner;
    private int balance;

    public Account(String owner, int balance){
        sequence = accountNo++;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount){
        if (amount <= 0){
            throw new IllegalArgumentException("입금 금액은 0원보다 커야 합니다.");
        }
        this.balance += amount;
    }

    public void withdraw(int amount) throws InsufficientBalanceException{
        if (amount <= 0){
            throw new IllegalArgumentException("입금 금액은 0원보다 커야 합니다.");
        }
        if (amount < balance) {
            throw new InsufficientBalanceException("잔액이 부족합니다.");
        }
        this.balance -= amount;
    }

}
