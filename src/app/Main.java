package app;

import javafx.application.Application;
import javafx.stage.Stage;
import app.view.MainController;

public class Main extends Application {


    public static void main(String[] args) {

        Application.launch(Main.class ,args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        MainController mainController = new MainController(primaryStage);


        mainController.initRootLayout();
        mainController.showLoginForm();
        //mainController.showPostListView();
        //mainController.showUserProfile();
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
