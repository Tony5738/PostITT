package app.model.entities;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import app.model.dao.oracle.ITTUserOracleDAO;
import app.model.dao.oracle.oracleDaoFactory.OracleDAOFactory;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class ITTUser {

    private static OracleDAOFactory oracleDAOFactory = new OracleDAOFactory();

    private IntegerProperty ITTUserID;
    private StringProperty firstname;
    private StringProperty surname;
    private StringProperty password;
    private StringProperty email;
    private IntegerProperty score;
    private StringProperty profilePic;
    private UserType userType;


    public ITTUser() {
        this.ITTUserID = new SimpleIntegerProperty();
        this.firstname = new SimpleStringProperty();
        this.surname = new SimpleStringProperty();
        this.password = new SimpleStringProperty();
        this.email = new SimpleStringProperty();
        this.score = new SimpleIntegerProperty();
        this.profilePic = new SimpleStringProperty();
        this.userType = new UserType();
    }

    public int getITTUserID() {
        return ITTUserID.get();
    }

    public void setITTUserID(int ITTUserID) {
        this.ITTUserID.set(ITTUserID);
    }

    public IntegerProperty userIDProperty() {
        return ITTUserID;
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
