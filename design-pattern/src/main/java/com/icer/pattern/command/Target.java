package com.icer.pattern.command;

public class Target {
    private Size size;
    private Visibility visibility;

    public Target() {
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public void printStatus() {
        System.out.println(String.format("【size=%s】【visibility=%s】", size, visibility));
    }
}
