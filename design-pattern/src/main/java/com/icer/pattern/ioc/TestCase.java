package com.icer.pattern.ioc;

public abstract class TestCase {

    abstract boolean dotest();

    public void run() {
        if (dotest()) {
            System.out.println("test success!");
        } else {
            System.out.println("test failed...");
        }
    }
}
