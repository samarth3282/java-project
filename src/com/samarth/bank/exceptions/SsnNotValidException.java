package com.samarth.bank.exceptions;

public class SsnNotValidException extends Exception {
    private static final long serialVersionUID = 1234L;

    public SsnNotValidException(String ssn) {
        super("Ssn" + ssn + " is not valid");
    }
}
