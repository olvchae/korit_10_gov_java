package ex3.model;

import lombok.Data;

@Data
public class Transaction {
    private String type;
    private int amount;
    private int balanceAfter;
    private String dataTime;
}
