import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {




    private Stage primaryStage;

    public Stage getPrimaryStage() {
        return primaryStage;
    }


    public static void main(String[] args) {

        Application.launch(Main.class ,args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("PostITT - Log in");
        this.primaryStage.getIcons().add(new Image("img/post_it.png"));

        Group root = new Group();


        try {
            // Load login form.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/login_form.fxml"));
            Pane loginForm = (Pane) loader.load();


            Scene scene = new Scene(root,Color.WHITE);
            loginForm.prefHeightProperty().bind(scene.heightProperty());
            loginForm.prefWidthProperty().bind(scene.widthProperty());

            root.getChildren().add(loginForm);
            this.primaryStage.setScene(scene);
            this.primaryStage.show();



        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage(), ButtonType.OK);
            alert.showAndWait();
        }
    }

        /*      Button btn = new Button();
        btn.setLayoutX(100);
        btn.setLayoutY(80);
        btn.setText("dbTest");
        btn.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                Post post = new Post();
                OracleDAOFactory daoFactory = new OracleDAOFactory();
                post = daoFactory.getPostOracleDAO().find();

                if(post != null)
                {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "post : "+ post.getPostId()+", text : "+post.getPostText(), ButtonType.OK);
                    alert.showAndWait();
                }

            }
        });
        root.getChildren().add(btn);*/





}
