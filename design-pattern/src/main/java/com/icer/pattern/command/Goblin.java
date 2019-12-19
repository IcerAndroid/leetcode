package com.icer.pattern.command;

public class Goblin extends Target {
    public Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.INVISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
