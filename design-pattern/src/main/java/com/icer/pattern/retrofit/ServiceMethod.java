package com.icer.pattern.retrofit;

import java.lang.reflect.Method;

public abstract class ServiceMethod<T> {

    abstract T invoke(Object[] args);

//    static <T> ServiceMethod<T> parseAnnotations(Retrofit retrofit, Method method){
//    }
}
