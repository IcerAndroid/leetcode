package com.icer.pattern.retrofit;

import java.util.concurrent.Executors;

public class Handler {
    public Handler(Looper looper) {
    }

    public void post(Runnable runnable) {
        Executors.newCachedThreadPool().execute(runnable);
    }
}
