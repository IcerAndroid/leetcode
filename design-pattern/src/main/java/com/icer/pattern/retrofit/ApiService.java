package com.icer.pattern.retrofit;

import com.icer.pattern.Person;

public interface ApiService {

    Call<Person> getPerson();
}
