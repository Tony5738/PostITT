package app.view;

import app.model.entities.Post;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antho_000 on 06/12/2016.
 */
public class PostListViewController extends Controller {

    @FXML
    ListView<Post> listView;

    ObservableList<Post> data = FXCollections.observableArrayList();

    public PostListViewController() {
    }

    @FXML
    public void initialize(){

        List<Post> listPost = new ArrayList<Post>();
        listPost = Post.getPostOracleDAO().findAll();

        for(int i = 0; i<listPost.size();i++)
        {
            data.add(listPost.get(i));
        }

        listView.setItems(data);
        //listView.setCellFactory(PostViewController.forListView(data));
    }
}
