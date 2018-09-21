package com.company;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;


class MyParserTest {

    @Test
    void parse() {

        final int[] count = {0};

        Counter counter = new Counter() {
            @Override
            public void setReporter(Reporter reporter) {

            }

            @Override
            public void increaseCounter() {
                count[0]++;
            }
        };

        Parser parser = new MyParser();
        parser.setCounter(counter);

        Reader input = new StringReader("Мама мыла раму, рама мыла маму.");
        try {
            parser.parse(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(6, count[0]);
    }
}