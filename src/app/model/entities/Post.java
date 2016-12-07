package app.model.entities;

import app.model.dao.oracle.PostOracleDAO;
import app.model.dao.oracle.oracleDaoFactory.OracleDAOFactory;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class Post {

    private static OracleDAOFactory oracleDAOFactory = new OracleDAOFactory();

    private IntegerProperty postId;
    private StringProperty postText;
    private StringProperty date;
    private ITTUser author;
    private PostType postType;
    private Category category;




    public static PostOracleDAO getPostOracleDAO()
    {
        return oracleDAOFactory.getPostOracleDAO();
    }

}
