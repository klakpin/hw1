package com.company;

import java.io.*;
import java.util.List;

public class MyResourceReceiver implements ResourceReceiver {

    Parser myParser;

    @Override
    public void setParser(Parser parser) {
        myParser = parser;
    }

    @Override
    public void addResources(List<InputStream> resources) {
        for (InputStream inputStream : resources) {
            try (Reader r = new BufferedReader(new InputStreamReader(inputStream))) {
                myParser.parse(r);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Cannot create reader from given inputStream!");
            }

        }
    }
}
