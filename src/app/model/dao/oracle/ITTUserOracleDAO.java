package app.model.dao.oracle;

import app.model.dao.ITTUserDAO;
import app.model.entities.ITTUser;
import app.oracleDBConnection.JDBCOracleConnector;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class ITTUserOracleDAO implements ITTUserDAO {

    private JDBCOracleConnector dbMgr;

    public ITTUserOracleDAO() {
        this.dbMgr = JDBCOracleConnector.getInstance();
    }

    @Override
    public ITTUser find(int id) {

        System.out.println("appuserid "+id);
        PreparedStatement stmt = null;
          try {

                String sqlStmt = "select userID,firstname,surname,email,score,profilepic from VIEWUSERPROFILE where userid = ?";
                stmt = dbMgr.getConnection().prepareStatement(sqlStmt);
                stmt.setInt(1,id);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    ITTUser user = new ITTUser();

                    user.setITTUserID(rs.getInt("userid"));
                    user.setFirstname(rs.getString("firstname"));
                    user.setSurname(rs.getString("surname"));
                    user.setEmail(rs.getString("email"));
                    user.setScore(rs.getInt("score"));
                    user.setProfilePic(rs.getString("profilepic"));

                    return user;

                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR, "No user is found", ButtonType.OK);
                    alert.showAndWait();
                    return null;
                }



          } catch (SQLException e) {
                e.printStackTrace();
                Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage(), ButtonType.OK);
                alert.showAndWait();
                return null;
          }finally{
                dbMgr.closeStatement(stmt);
          }




    }

    @Override
    public List<ITTUser> findAll() {
        return null;
    }

    @Override
    public void save(ITTUser ittUser) {

        CallableStatement cStmt = null;
        try {
            //System.out.println("firstname inside " + ittUser.getFirstname());
            String sqlStmt = "call createITTUser(?,?,?,?,?,?)";
            cStmt = dbMgr.getConnection().prepareCall(sqlStmt);
            cStmt.setString(1, ittUser.getFirstname());
            cStmt.setString(2, ittUser.getSurname());
            cStmt.setString(3, ittUser.getPassword());
            cStmt.setString(4, ittUser.getEmail());
            cStmt.setString(5, ittUser.getProfilePic());
            cStmt.setInt(6,1);
            cStmt.executeUpdate();

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "User created !", ButtonType.OK);
            alert.showAndWait();

        } catch (SQLException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage(), ButtonType.OK);
            alert.showAndWait();


        }
        finally{
            dbMgr.closeStatement(cStmt);
        }
    }


    @Override
    public int login(String email, String password) {

        PreparedStatement stmt = null;
        try {

            String sqlStmt = "select * from ITTUser where email = ? and password = ?";
            stmt = dbMgr.getConnection().prepareStatement(sqlStmt);
            stmt.setString(1,email);
            stmt.setString(2,password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                ITTUser user = new ITTUser();

                user.setITTUserID(rs.getInt("userid"));
                user.setFirstname(rs.getString("firstname"));
                user.setSurname(rs.getString("surname"));


                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Bienvenue " + user.getFirstname() + " " + user.getSurname() + "!", ButtonType.OK);
                alert.showAndWait();

                return user.getITTUserID();

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR, "No user is found, Try Again !", ButtonType.OK);
                alert.showAndWait();
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage(), ButtonType.OK);
            alert.showAndWait();
            return 0;
        }finally{
            dbMgr.closeStatement(stmt);
        }



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

    }

    @Override
    public ITTUser refreshScore() {
        return null;
    }
}
