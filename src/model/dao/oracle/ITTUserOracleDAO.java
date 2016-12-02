package model.dao.oracle;

import model.dao.ITTUserDAO;
import model.entities.ITTUser;
import oracleDBConnection.JDBCOracleConnector;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class ITTUserOracleDAO implements ITTUserDAO {

    private JDBCOracleConnector dbMgr;


    @Override
    public ITTUser find() {
        return null;
    }

    @Override
    public ITTUser save() {
        return null;
    }
}
