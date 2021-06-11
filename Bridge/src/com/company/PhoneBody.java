package com.company;

public abstract class Phone {
    protected Phone phone;

    public PhoneBody(Phone phone) {
        this.phone=phone;
    }

    abstract public String buildPhoneBody();
}
