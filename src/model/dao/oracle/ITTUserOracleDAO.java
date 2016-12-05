package model.dao.oracle;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import model.dao.ITTUserDAO;
import model.entities.ITTUser;
import model.entities.Post;
import oracle.jdbc.internal.OracleTypes;
import oracle.jdbc.oracore.OracleType;
import oracleDBConnection.JDBCOracleConnector;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class ITTUserOracleDAO implements ITTUserDAO {

    private JDBCOracleConnector dbMgr;

    public ITTUserOracleDAO() {
        this.dbMgr = JDBCOracleConnector.getInstance();
    }

    @Override
    public ITTUser find() {
        return null;
    }

    @Override
    public ITTUser save() {
        return null;
    }

    @Override
    public ITTUser login(String email, String password) {
        try {
            String sqlStmt = "select login(?,?) from dual";
            CallableStatement cStmt = dbMgr.getConnection().prepareCall(sqlStmt);
            cStmt.setString(1,email);
            cStmt.setString(2,password);
            cStmt.registerOutParameter(3, OracleTypes.CURSOR);
            cStmt.executeQuery();

            ResultSet response = (ResultSet) cStmt.getObject(3);
            if (response.next()) {
                ITTUser user = new ITTUser();

                user.setUserID(response.getInt("USERID"));
                user.setFirstname(response.getString("FIRSTNAME"));
                user.setSurname(response.getString("SURNAME"));
                user.setEmail(response.getString("EMAIL"));
                user.setScore(response.getInt("SCORE"));
                user.setProfilePic(response.getString("PROFILEPIC"));


                cStmt.close();

                return user;


            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Email or password are incorrect", ButtonType.OK);
                alert.showAndWait();

                cStmt.close();

                return null;



            }

        } catch (SQLException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage(), ButtonType.OK);
            alert.showAndWait();
            return null;

        }
    }
}
