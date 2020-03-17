package com.icer.pattern.retrofit;

public class App {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.baidu.com")
                .build();
        retrofit.create(ApiService.class).getPerson();
    }
}
