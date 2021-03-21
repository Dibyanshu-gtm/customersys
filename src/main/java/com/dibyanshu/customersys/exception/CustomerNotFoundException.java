package com.dibyanshu.customersys.exception;



public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String message)
    {
        super(message);
    }
}
