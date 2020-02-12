package com.icer.pattern.callback;

import java.util.Optional;

public abstract class Task {
    public void executeWith(final Callback callback) {
        execute();
        Optional.ofNullable(callback).ifPresent(Callback::call);
    }

    public abstract void execute();
}
