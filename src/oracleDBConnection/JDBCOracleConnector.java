package oracleDBConnection;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by antho_000 on 01/12/2016.
 */
public final class JDBCOracleConnector {


        private static volatile JDBCOracleConnector instance = null;


        private Connection connection;
        private OracleDBProperties prop;



        private JDBCOracleConnector() {
            super();
            this.prop = new OracleDBProperties();
        }


        public final static JDBCOracleConnector getInstance() {

            if (JDBCOracleConnector.instance == null) {

                synchronized(JDBCOracleConnector.class) {
                    if (JDBCOracleConnector.instance == null) {
                        JDBCOracleConnector.instance = new JDBCOracleConnector();
                    }
                }
            }
            return JDBCOracleConnector.instance;
        }


        public Connection getConnection() {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                connection = DriverManager.getConnection("jdbc:oracle:thin:@" + prop.getProperties("connectionUrl"), prop.getProperties("username"), prop.getProperties("password"));

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Successfully connected to the database", ButtonType.OK);
                alert.showAndWait();
                return connection;
            } catch (ClassNotFoundException e) {

                Alert alert = new Alert(Alert.AlertType.ERROR, "Impossible to find the Oracle JDBC Driver", ButtonType.OK);
                alert.showAndWait();
            } catch (SQLException e) {

                Alert alert = new Alert(Alert.AlertType.ERROR, "Connection to database failed: "+ e.getMessage(), ButtonType.OK);
                alert.showAndWait();
            }
            return null;
        }




}
