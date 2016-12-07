package app.view;

import app.model.entities.ITTUser;
import app.model.entities.UserType;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * Created by antho_000 on 07/12/2016.
 */
public class CreateUserFormController extends Controller{


    @FXML
    private TextField firstnameField;

    @FXML
    private TextField surnameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField emailField;


    //@FXML
    //private ListView<String> UserTypeListView;

    @FXML
    private Button btnCreate;

    @FXML
    private Button btnCancel;

    public CreateUserFormController() {
    }

    @FXML
    private void initialize() {



        btnCreate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                ITTUser user = new ITTUser();
                //System.out.println("firstname outside " + firstnameField.getText() + " " + firstnameField.getLength());

                user.setFirstname(firstnameField.getText());
                user.setSurname(surnameField.getText());
                user.setPassword(passwordField.getText());
                user.setEmail(emailField.getText());
                user.setProfilePic("/app/img/person_icon.png");

                // TODO: 07/12/2016 Define a comboBox UserType 
                /*UserType uType = new UserType();
                uType.setTypeDescription("U");
                user.setUserType(uType);*/


                ITTUser.getITTUserOracleDAO().save(user);


                mainController.showUserProfile();


            }
        });

        btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainController.showUserProfile();
            }
        });

    }

    /*private boolean checkFirstnameIsNull(ITTUser user){
        return user.getFirstname() != null;
    }

    private boolean checkSurnameIsNull(ITTUser user){
        return user.getSurname() != null;
    }

    private boolean checkEmailIsNull(ITTUser user){
        return user.getEmail() != null;
    }

    private boolean checkProfilPicIsNull(ITTUser user){
        return user.getProfilePic() != null;
    }

    private boolean checkPasswordIsNull(ITTUser user){
        return user.getPassword() != null;
    }

    private boolean checkUserTypeIsNull(ITTUser user){
        return user.getUserType() != null;
    }

    private boolean checkForm(ITTUser user){
        return checkFirstnameIsNull(user)&&
                checkSurnameIsNull(user) &&
                checkEmailIsNull(user)&&
                checkPasswordIsNull(user)&&
                checkProfilPicIsNull(user);
    }*/

}
