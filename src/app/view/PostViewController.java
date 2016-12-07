package app.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * Created by antho_000 on 06/12/2016.
 */
public class PostViewController extends Controller{

    @FXML
    private ImageView authorPic;

    @FXML
    private Label lblAuthorCompleteName;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblCategory;

    @FXML
    private Label lblPostText;

    @FXML
    private Label lblPostType;

    @FXML
    private Label lblPostTitle;


    public PostViewController() {
    }

    @FXML
    private void initialize() {

    }


}
