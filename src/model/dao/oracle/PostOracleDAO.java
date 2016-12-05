package model.dao.oracle;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import model.dao.PostDAO;
import model.entities.Media;
import model.entities.Post;
import oracleDBConnection.JDBCOracleConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class PostOracleDAO implements PostDAO {

    private JDBCOracleConnector dbMgr;

    public PostOracleDAO() {
        this.dbMgr = JDBCOracleConnector.getInstance();
    }

    @Override
    public Post find() {
        try {
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
        }

    }

    @Override
    public Post save() {
        return null;
    }

    @Override
    public Media getMedia() {
        return null;
    }
}
