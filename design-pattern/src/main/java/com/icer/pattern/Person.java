package com.icer.pattern;

public class Person {
    private static int numA;
    private int numA2;

    static {
        System.out.println("A的静态字段 : " + numA);
        System.out.println("A的静态代码块");
    }

    {
        System.out.println("A的成员变量  : " + numA2);
        System.out.println("A的非静态代码块");
    }

    public Person() {
        System.out.println("A的构造器");
    }

    public Person(int n) {
        System.out.println("A的有参构造");
        this.numA2 = n;
    }
}
