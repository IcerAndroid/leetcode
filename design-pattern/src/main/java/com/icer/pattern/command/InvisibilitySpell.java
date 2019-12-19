package com.icer.pattern.command;

public class InvisibilitySpell extends Command {
    private Visibility oldVisibility;
    private Target target;

    @Override
    public void execute(Target target) {
        oldVisibility = target.getVisibility();
        target.setVisibility(Visibility.VISIBLE);
        this.target = target;
    }

    @Override
    public void undo() {
        if (oldVisibility != null && target != null) {
            Visibility temp = target.getVisibility();
            target.setVisibility(oldVisibility);
            oldVisibility = temp;
        }
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public String toString() {
        return "Invisibility Spell";
    }
}
