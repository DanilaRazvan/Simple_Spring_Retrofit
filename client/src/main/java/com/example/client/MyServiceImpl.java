package com.example.client;

import org.springframework.stereotype.Service;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class MyServiceImpl implements MyService {

    private RequestsApi requestsApi;

    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        requestsApi = retrofit.create(RequestsApi.class);
    }





    @Override
    public void getRandomNumber(Callback<UserDTO> callback) {
        requestsApi.getRandomNumber().enqueue(callback);
    }
}
