package app.model.dao.oracle;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import app.model.dao.PostDAO;
import app.model.entities.Media;
import app.model.entities.Post;
import app.oracleDBConnection.JDBCOracleConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class PostOracleDAO implements PostDAO {

    private JDBCOracleConnector dbMgr;

    public PostOracleDAO() {
        this.dbMgr = JDBCOracleConnector.getInstance();
    }

    @Override
    public Post find(int id) {
        return null;
    }

    @Override
    public List<Post> findAll() {
        /*try {
            String sqlStmt = "select posttext, postId from post where userid = ?";
            PreparedStatement stmt = dbMgr.getConnection().prepareStatement(sqlStmt);
            stmt.setInt(1,1);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Post post = new Post();

                post.setPostText(rs.getString("posttext"));
                post.setPostId(rs.getInt("postId"));

                return post;
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR, "No post is found", ButtonType.OK);
                alert.showAndWait();
                return null;
            }



        } catch (SQLException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage(), ButtonType.OK);
            alert.showAndWait();
            return null;
        }*/
        return null;
    }

    @Override
    public Post save(Post post) {
        return null;
    }


    @Override
    public Media getMedia() {
        return null;
    }
}
