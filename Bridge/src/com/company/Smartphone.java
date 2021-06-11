package com.company;

public class SmartPhone extends PhoneBody{
    public SmartPhone(Phone phone){
        super(phone);
    }
    @Override
    public String buildPhoneBody(){

        return "Phone model builded "+phone.model();
    }

}
