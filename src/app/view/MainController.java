package app.view;

import app.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by antho_000 on 06/12/2016.
 */
public class MainController {

    private Stage primaryStage;
    private BorderPane rootLayout;

    //user id of the user, which is using the app
    private int appUserID;

    public int getAppUserID() {
        return appUserID;
    }

    public void setAppUserID(int appUserID) {
        this.appUserID = appUserID;
    }

    public MainController(Stage primaryStage) {

        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("PostITT");
        this.primaryStage.getIcons().add(new Image("app/img/post_it.png"));

        this.appUserID = 0;
    }

    /**
     * initializes the root layout
     */
    public void initRootLayout(){
        try {
            // Load root layout
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/root_layout.fxml"));
            rootLayout = (BorderPane) loader.load();

            //Show the scene containing the root layout
            Scene scene = new Scene(rootLayout, Color.WHITE);
            rootLayout.prefHeightProperty().bind(scene.heightProperty());
            rootLayout.prefWidthProperty().bind(scene.widthProperty());

            this.primaryStage.setScene(scene);
            this.primaryStage.show();



        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage(), ButtonType.OK);
            alert.showAndWait();
        }
    }

    /**
     * show the login form on the root layout
     */
    public void showLoginForm(){
        try {
            // Load login form.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/login_form.fxml"));
            Pane loginForm = (Pane) loader.load();

            rootLayout.setCenter(loginForm);

            LoginFormController loginFormController = loader.getController();
            loginFormController.setMainController(this);

        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage(), ButtonType.OK);
            alert.showAndWait();
        }
    }

    public void hideProfileView(){
        rootLayout.setRight(null);
    }


    /**
     * show the user profile on the root layout
     */
    public void showUserProfile(){
        try {
            // Load user profile view.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/user_profile_view.fxml"));
            GridPane userProfile = (GridPane) loader.load();

            rootLayout.setRight(userProfile);


            UserProfileController userProfileController = loader.getController();
            userProfileController.setMainController(this);

        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage(), ButtonType.OK);
            alert.showAndWait();
        }
    }

    /**
     * show the post list view on the root layout
     */
    public void showPostListView(){
        try {
            // Load post list view.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/post_list_view.fxml"));
            Pane postListView = (Pane) loader.load();

            rootLayout.setCenter(postListView);

            //PostListViewController postListViewController = loader.getController();
            //postListViewController.setMainController(this);

        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage(), ButtonType.OK);
            alert.showAndWait();
        }
    }

    /**
     * show the create user view on the root layout
     */
    public void showCreateUserForm(){
        try {
            // Load create user form.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/create_user_form.fxml"));
            GridPane createUserForm = (GridPane) loader.load();

            rootLayout.setRight(createUserForm);

            CreateUserFormController createUserFormController = loader.getController();
            createUserFormController.setMainController(this);


        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage(), ButtonType.OK);
            alert.showAndWait();
        }
    }



}
