package com.example.client;

import org.springframework.stereotype.Service;
import retrofit2.Callback;

@Service
public interface MyService {

    void getRandomNumber(Callback<UserDTO> callback);

}
