package com.icer.pattern.decorate;

public class AbstractDecorate extends AbstractCake {

    AbstractCake cake;

    public AbstractDecorate(AbstractCake cake) {
        this.cake = cake;
    }


    @Override
    String getDesc() {
        return cake.getDesc();
    }

    @Override
    int getCost() {
        return cake.getCost();
    }
}
