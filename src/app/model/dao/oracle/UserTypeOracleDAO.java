package app.model.dao.oracle;

import app.model.dao.UserTypeDAO;
import app.model.entities.UserType;
import app.oracleDBConnection.JDBCOracleConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created by antho_000 on 07/12/2016.
 */
public class UserTypeOracleDAO implements UserTypeDAO {


    private JDBCOracleConnector dbMgr;

    public UserTypeOracleDAO() {

        this.dbMgr = JDBCOracleConnector.getInstance();
    }

    @Override
    public UserType find(int id) {
        return null;
    }

    @Override
    public List<UserType> findAll() {
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
            alert.showAndWait();*/
            return null;
        //}
    }

    @Override
    public void save(UserType userType) {


    }
}
