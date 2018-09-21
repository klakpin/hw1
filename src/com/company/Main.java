package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Reporter reporter = new MyReporter();

        Counter counter = new MyCounter();
        counter.setReporter(reporter);

        Parser parser = new MyParser();
        parser.setCounter(counter);

        ResourceReceiver resourceReceiver = new MyResourceReceiver();

        resourceReceiver.setParser(parser);

        ArrayList<InputStream> streams =new ArrayList<>();
        streams.add(new ByteArrayInputStream("Мама мыла раму, рама мыла маму.".getBytes()));
        try {
            streams.add(new FileInputStream(new File("myText.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("MyText not found");
        }

        resourceReceiver.addResources(streams);

    }
}
