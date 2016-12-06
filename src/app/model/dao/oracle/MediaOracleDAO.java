package app.model.dao.oracle;

import app.model.dao.MediaDAO;
import app.model.entities.Media;
import app.oracleDBConnection.JDBCOracleConnector;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class MediaOracleDAO implements MediaDAO {

    private JDBCOracleConnector dbMgr;

    public MediaOracleDAO() {
        this.dbMgr = JDBCOracleConnector.getInstance();
    }

    @Override
    public Media find() {
        return null;
    }

    @Override
    public Media save() {
        return null;
    }
}
