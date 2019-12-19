package com.icer.pattern.command;

public abstract class Command {
    public abstract void execute(Target target);

    public abstract void undo();

    public abstract void redo();
}
