package model.entities;

import model.dao.oracle.MediaOracleDAO;
import model.dao.oracle.oracleDaoFactory.OracleDAOFactory;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class Media {

    private static OracleDAOFactory oracleDAOFactory = new OracleDAOFactory();

    public static MediaOracleDAO getMediaOracleDAO()
    {
        return oracleDAOFactory.getMediaOracleDAO();
    }
}
