package model.entities;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import model.dao.oracle.ITTUserOracleDAO;
import model.dao.oracle.oracleDaoFactory.OracleDAOFactory;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class ITTUser {

    private static OracleDAOFactory oracleDAOFactory = new OracleDAOFactory();

    private IntegerProperty userID;
    private StringProperty firstname;
    private StringProperty surname;
    private StringProperty password;
    private StringProperty email;
    private IntegerProperty score;
    private StringProperty profilePic;
    private UserType userType;


    public ITTUser() {
    }


    public int getUserID() {
        return userID.get();
    }

    public void setUserID(int userID) {
        this.userID.set(userID);
    }

    public IntegerProperty userIDProperty() {
        return userID;
    }

    public String getFirstname() {
        return firstname.get();
    }

    public void setFirstname(String firstname) {
        this.firstname.set(firstname);
    }

    public StringProperty firstnameProperty() {
        return firstname;
    }

    public String getSurname() {
        return surname.get();
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    public StringProperty surnameProperty() {
        return surname;
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public StringProperty passwordProperty() {
        return password;
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public StringProperty emailProperty() {
        return email;
    }

    public int getScore() {
        return score.get();
    }

    public void setScore(int score) {
        this.score.set(score);
    }

    public IntegerProperty scoreProperty() {
        return score;
    }

    public String getProfilePic() {
        return profilePic.get();
    }

    public void setProfilePic(String profilePic) {
        this.profilePic.set(profilePic);
    }

    public StringProperty profilePicProperty() {
        return profilePic;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }


    public static ITTUserOracleDAO getITTUserOracleDAO(){
        return oracleDAOFactory.getITTUserOracleDAO();
    }




}
