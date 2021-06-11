package com.company;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        FirstState firstState = new FirstState();
        firstState.doState(context);

        System.out.println(context.getState().toString());

        SecondState secondState = new SecondState();
        secondState.doState(context);

        System.out.println(context.getState().toString());


    }
}
