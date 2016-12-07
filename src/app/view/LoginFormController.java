package app.view;

import app.model.entities.ITTUser;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * Created by antho_000 on 04/12/2016.
 */
public class LoginFormController extends Controller {

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button logInButton;


    public LoginFormController() {
    }

    @FXML
    private void initialize() {
        logInButton.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {


               int appUserID = ITTUser.getITTUserOracleDAO().login(loginField.getText(),passwordField.getText());

                if(appUserID != 0) {

                    //System.out.println("appUser "+appUserID);
                    mainController.setAppUserID(appUserID);
                    //System.out.println("appUser from mainController "+mainController.getAppUserID());

                    mainController.showPostListView();
                    mainController.showUserProfile();

                }

            }
        });
    }



}
