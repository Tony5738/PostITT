package model.dao.oracle.oracleDaoFactory;

import model.dao.oracle.ITTUserOracleDAO;
import model.dao.oracle.MediaOracleDAO;
import model.dao.oracle.PostOracleDAO;
import model.entities.ITTUser;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class OracleDaoFactory {

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
