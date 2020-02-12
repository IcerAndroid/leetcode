package com.icer.pattern.builder;

public class App {
    public static void main(String[] args) {
        Hero hero = new Hero.Builder("法师", "安琪儿")
                .withArmor("藤甲")
                .withHairColor("黄色")
                .withHairType("卷发")
                .withWeapon("法杖").build();
        System.out.println();

    }
}
