package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(Main.class ,args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275,Color.LIGHTCYAN));
        /*Button btn = new Button();
        btn.setLayoutX(100);
        btn.setLayoutY(80);
        btn.setText("Hello World");
        btn.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });
        root.getChildren().add(btn);*/
        primaryStage.show();
    }


}
