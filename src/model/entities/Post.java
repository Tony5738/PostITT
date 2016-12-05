package model.entities;

import model.dao.oracle.PostOracleDAO;
import model.dao.oracle.oracleDaoFactory.OracleDAOFactory;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class Post {

    private static OracleDAOFactory oracleDAOFactory = new OracleDAOFactory();

    private int postId;

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    private String postText;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }


    public static PostOracleDAO getPostOracleDAO()
    {
        return oracleDAOFactory.getPostOracleDAO();
    }

}
