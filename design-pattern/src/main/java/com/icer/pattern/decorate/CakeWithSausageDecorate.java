package com.icer.pattern.decorate;

public class CakeWithSausageDecorate extends AbstractDecorate {

    public CakeWithSausageDecorate(AbstractCake cake) {
        super(cake);
    }

    @Override
    String getDesc() {
        return super.getDesc() + " 加一个火腿肠";
    }

    @Override
    int getCost() {
        return super.getCost() + 5;
    }
}
