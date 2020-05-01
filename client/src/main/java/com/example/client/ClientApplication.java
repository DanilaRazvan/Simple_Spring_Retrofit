package com.example.client;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SpringBootApplication
@ComponentScan("com.example.client")
public class ClientApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ClientApplication.class, args);
		Application.launch(JavaFxApplication.class, args);
	}

}
