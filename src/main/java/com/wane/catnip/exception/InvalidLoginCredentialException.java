package com.wane.catnip.exception;

public class InvalidLoginCredentialException extends RuntimeException {
    public InvalidLoginCredentialException(String message) {
        super(message);
    }
}
