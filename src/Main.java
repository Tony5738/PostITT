import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import loginForm.LoginController;
import model.dao.oracle.oracleDaoFactory.OracleDaoFactory;
import model.entities.Post;

public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(Main.class ,args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //FXMLLoader loader = new FXMLLoader();
        //Group root = FXMLLoader.load(getClass().getResource("login_form.fxml"));
        Group root = new Group();

        //LoginController controller = loader.getController();
        //controller.setMainApp(this);

        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 300, 275,Color.LIGHTCYAN));

              Button btn = new Button();
        btn.setLayoutX(100);
        btn.setLayoutY(80);
        btn.setText("dbTest");
        btn.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                Post post = new Post();
                OracleDaoFactory daoFactory = new OracleDaoFactory();
                post = daoFactory.getPostOracleDAO().find();

                if(post != null)
                {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "post : "+ post.getPostId()+", text : "+post.getPostText(), ButtonType.OK);
                    alert.showAndWait();
                }

            }
        });
        root.getChildren().add(btn);

        primaryStage.show();
    }


}
