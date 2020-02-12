package com.icer.pattern.decorate;

public class BatterCake extends AbstractCake {
    @Override
    String getDesc() {
        return "这是煎饼果子";
    }

    @Override
    int getCost() {
        return 8;
    }
}
