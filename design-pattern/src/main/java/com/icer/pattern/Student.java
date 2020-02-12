package com.icer.pattern;

public class Student extends Person {
    private static int numB;
    private int numB2;

    static {
        System.out.println("B的静态字段 : " + numB);
        System.out.println("B的静态代码块");
    }

    {
        System.out.println("B的成员变量 : " + numB2);
        System.out.println("B的非静态代码块");
    }

    public Student() {
        System.out.println("B的构造器");
    }

    public Student(int n) {
        System.out.println("B的有参构造");
        this.numB2 = n;
    }

}
