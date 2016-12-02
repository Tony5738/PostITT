package model.dao.oracle;

import model.dao.MediaDAO;
import model.entities.Media;
import oracleDBConnection.JDBCOracleConnector;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class MediaOracleDAO implements MediaDAO {

    private JDBCOracleConnector dbMgr;

    @Override
    public Media find() {
        return null;
    }

    @Override
    public Media save() {
        return null;
    }
}
