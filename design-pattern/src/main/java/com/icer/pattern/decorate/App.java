package com.icer.pattern.decorate;

public class App {
    public static void main(String[] args) {
        AbstractCake cake = new BatterCake();
        cake = new CakeWithEggDecorate(cake);
        cake = new CakeWithSausageDecorate(cake);
        System.out.println(cake.getDesc()+" 销售价格:"+cake.getCost());
    }
}
