package com.icer.pattern.command;

import java.util.Deque;
import java.util.LinkedList;

public class Wizard {
    private Deque<Command> undoStack = new LinkedList<>();
    private Deque<Command> redoStack = new LinkedList<>();

    public Wizard() {
    }

    public void castSpell(Command command, Target target) {
        System.out.println(String.format("%s casts %s at %s", this.toString(),
                command.toString(), target.toString()));
        command.execute(target);
        undoStack.offerLast(command);
    }

    public void undoLastSpell() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pollLast();
            redoStack.offerLast(command);
            System.out.println(String.format("%s undoes %s",
                    this.toString(), command.toString()));
            command.undo();
        }
    }


    public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pollLast();
            undoStack.offerLast(command);
            System.out.println(String.format("%s redoes %s",
                    this.toString(), command.toString()));
            command.redo();
        }
    }

    @Override
    public String toString() {
        return "Wizard";
    }
}
