package com.icer.pattern.retrofit;


import org.jetbrains.annotations.Nullable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public interface CallAdapter<R, T> {
    Type responseType();

    T adapt(Call<R> call);

    abstract class Factory {
        public abstract @Nullable
        CallAdapter<?, ?> get(Type returnType, Annotation[] annotations,
                              Retrofit retrofit);
    }

}
