package app.view;

import app.Main;
import app.model.entities.ITTUser;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by antho_000 on 06/12/2016.
 */
public class UserProfileController extends Controller {

    @FXML
    private ImageView profilePic;

    @FXML
    private Label lblScore;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblCompleteName;

    @FXML
    private Button btnScoreRefresh;

    @FXML
    private Button btnCreateUser;

    public UserProfileController() {
    }

    @FXML
    private void initialize() {



        ITTUser user = ITTUser.getITTUserOracleDAO().find(38);

        if(user != null)
        {

            try{
                if(user.getProfilePic() != null)
                {

                    Image pic = new Image("/app/" + user.getProfilePic());
                    profilePic.setImage(pic);
                }else
                {
                    Image pic = new Image("/app/img/person_icon.png");
                    profilePic.setImage(pic);
                }
            }catch(IllegalArgumentException e)
            {
                e.printStackTrace();
                Alert alert = new Alert(Alert.AlertType.ERROR, "The picture is not found", ButtonType.OK);
                alert.showAndWait();
                Image pic = new Image("/app/img/person_icon.png");
                profilePic.setImage(pic);
            }



            lblScore.setText(String.valueOf(user.getScore()));
            lblCompleteName.setText(user.getFirstname()+" "+ user.getSurname());
            lblEmail.setText(user.getEmail());
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.ERROR, "An error occurred, there is no user", ButtonType.OK);
            alert.showAndWait();
        }

        btnScoreRefresh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //to do
                ITTUser.getITTUserOracleDAO().refreshScore();
            }
        });

        btnCreateUser.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                //call a new view
            }
        });







    }



}
