package com.company;

public class MyCounter implements Counter{
    private long current = 0;

    private Reporter reporter;

    @Override
    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    @Override
    public void increaseCounter() {
        current++;
        reporter.newNumber(current);
    }
}
