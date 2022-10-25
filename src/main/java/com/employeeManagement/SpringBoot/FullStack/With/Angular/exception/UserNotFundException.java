package com.employeeManagement.SpringBoot.FullStack.With.Angular.exception;


public class UserNotFundException extends RuntimeException {
    public UserNotFundException(String message) {
        super(message);
    }
}
