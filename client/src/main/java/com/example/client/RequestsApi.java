package com.example.client;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestsApi {

    @GET("random")
    Call<UserDTO> getRandomNumber();
}
