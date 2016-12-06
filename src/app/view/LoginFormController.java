package app.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Created by antho_000 on 04/12/2016.
 */
public class LoginFormController extends Controller {

    @FXML
    private TextField loginField;

    @FXML
    private TextField passwordField;

    @FXML
    private Button logInButton;


    public LoginFormController() {
    }

    @FXML
    private void initialize() {
        logInButton.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {

                System.out.println("OK");
                //ITTUser user = new ITTUser();

                //ITTUser.getITTUserOracleDAO().login(loginField.getText(),passwordField.getText());

            }
        });
    }



}
