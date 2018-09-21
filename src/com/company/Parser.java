package com.company;

import java.io.IOException;
import java.io.Reader;

public interface Parser {
    void setCounter(Counter counter);
    void parse(Reader reader) throws IOException;
}
