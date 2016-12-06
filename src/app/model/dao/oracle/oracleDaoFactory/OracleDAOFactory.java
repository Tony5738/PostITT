package app.model.dao.oracle.oracleDaoFactory;

import app.model.dao.oracle.ITTUserOracleDAO;
import app.model.dao.oracle.MediaOracleDAO;
import app.model.dao.oracle.PostOracleDAO;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class OracleDAOFactory {

    public PostOracleDAO getPostOracleDAO(){
        return new PostOracleDAO();
    }

    public MediaOracleDAO getMediaOracleDAO(){
        return new MediaOracleDAO();
    }

    public ITTUserOracleDAO getITTUserOracleDAO(){
        return new ITTUserOracleDAO();
    }
}
