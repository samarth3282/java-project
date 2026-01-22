package com.samarth.bank.exceptions;

public class InsufficientAmountException extends Exception {
    private static final long serialVersionIUD = 1234L;

    public InsufficientAmountException(double amount) {
        super("Amount" + amount + "is negative");
    }
}
