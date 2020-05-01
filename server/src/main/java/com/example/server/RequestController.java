package com.example.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RequestController {

    @GetMapping("random")
    public UserDTO getRandomNumber() {
        return UserDTO.builder()
                .name("Razvan")
                .age(new Random().nextInt(60))
                .build();
    }
}
