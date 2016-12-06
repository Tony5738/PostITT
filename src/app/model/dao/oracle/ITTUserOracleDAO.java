package app.model.dao.oracle;

import app.model.dao.ITTUserDAO;
import app.model.entities.ITTUser;
import app.oracleDBConnection.JDBCOracleConnector;

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
        /*try {
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

        }*/
        return null;
    }
}
