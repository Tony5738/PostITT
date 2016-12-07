package app.model.entities;

import app.model.dao.UserTypeDAO;
import app.model.dao.oracle.PostOracleDAO;
import app.model.dao.oracle.oracleDaoFactory.OracleDAOFactory;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by antho_000 on 04/12/2016.
 */
public class UserType {


    private static OracleDAOFactory oracleDAOFactory = new OracleDAOFactory();

    private IntegerProperty UserTypeID;
    private StringProperty TypeDescription;

    public UserType() {
    }

    public int getUserTypeID() {
        return UserTypeID.get();
    }

    public void setUserTypeID(int userTypeID) {
        this.UserTypeID.set(userTypeID);
    }

    public IntegerProperty userTypeIDProperty() {
        return UserTypeID;
    }

    public String getTypeDescription() {
        return TypeDescription.get();
    }

    public void setTypeDescription(String typeDescription) {
        this.TypeDescription.set(typeDescription);
    }

    public StringProperty typeDescriptionProperty() {
        return TypeDescription;
    }

    public static UserTypeDAO getUserTypeDAO()
    {
        return oracleDAOFactory.getUserTypeOracleDAO();
    }

}
