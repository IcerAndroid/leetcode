package com.icer.pattern.decorate;

public class CakeWithEggDecorate extends AbstractDecorate {

    public CakeWithEggDecorate(AbstractCake cake) {
        super(cake);
    }

    @Override
    String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    int getCost() {
        return super.getCost() + 3;
    }
}
