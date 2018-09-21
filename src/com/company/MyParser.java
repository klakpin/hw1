package com.company;

import java.io.IOException;
import java.io.Reader;

public class MyParser implements Parser {

    private Counter counter;

    @Override
    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void parse(Reader reader) throws IOException {
        int currentChar;
        while ((currentChar = reader.read()) != -1) {
            if (Character.isLetter((char) currentChar)) {
                do {
                    currentChar = reader.read();
                } while (Character.isLetter((char) currentChar));
                counter.increaseCounter();
            }
        }
    }
}
