package com.icer.pattern.callback;

public class App {
    public static void main(String[] args) {
        new SimpleTask().executeWith(() -> {
            System.out.println("I'm done now.");
        });
    }
}
