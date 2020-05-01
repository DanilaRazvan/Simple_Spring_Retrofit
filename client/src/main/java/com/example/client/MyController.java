package com.example.client;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Controller;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import javax.inject.Inject;

@Controller
@FxmlView("view.fxml")
public class MyController {

    @Inject
    private MyService myService;

    @FXML
    public Label label;

    public void onClick(MouseEvent mouseEvent) {
        myService.getRandomNumber(new Callback<UserDTO>() {
            @Override
            public void onResponse(Call<UserDTO> call, Response<UserDTO> response) {
                if (response.isSuccessful()) {
                    UserDTO user = response.body();

                    Platform.runLater(() -> label.setText(user.getName() + " - " + user.getAge()));

                } else {
                    System.out.println(response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<UserDTO> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }
}
