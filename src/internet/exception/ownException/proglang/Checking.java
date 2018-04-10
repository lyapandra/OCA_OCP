package internet.exception.ownException.proglang;

/**
 * Created by a on 10.04.2018.
 */
import java.io.*;

public class Checking {
    private int number;
    private double balance;

    public Checking(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= balance) {
            balance -= amount;
        }else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }
}