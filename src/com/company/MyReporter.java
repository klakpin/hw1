package com.company;

public class MyReporter implements Reporter{

    @Override
    public void newNumber(long number) {
        System.out.println("Current number = " + number);
    }
}
