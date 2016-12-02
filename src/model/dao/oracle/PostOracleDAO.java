package model.dao.oracle;

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
            String sqlStmt = "select posttext, postId from post where userid = 1";
            PreparedStatement stmt = dbMgr.getConnection().prepareStatement(sqlStmt);
            //stmt.setInt(1,1);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Post post = new Post();

                post.setPostText(rs.getString("posttext"));
                post.setPostId(rs.getInt("postId"));

                return post;
            } else {
                System.out.println("no post");
                return null;
            }

        } catch (SQLException e) {
           e.printStackTrace();
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
