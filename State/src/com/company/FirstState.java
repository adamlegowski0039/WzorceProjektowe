package com.company;

public class FirstState implements State{

    public void doState(Context context) {
        System.out.println("Rozpoczęcie stanu");
        context.setState(this);
    }

    public String toString(){
        return "Stan rozpoczęty";
    }
}
