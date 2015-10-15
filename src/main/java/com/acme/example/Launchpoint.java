package com.acme.example;

/**
 * Created by ppilgrim on 15-Oct-2015.
 */
public class Launchpoint {
    public static void main(String args[]) {
        TomEEApplication.run(HelloWorldServlet.class, SampleController.class);
    }
}
