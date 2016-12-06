package app.oracleDBConnection;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by antho_000 on 01/12/2016.
 */
public class OracleDBProperties extends Properties{

    public OracleDBProperties(){

        FileInputStream fileStream = null;
        try {
            String fileName = "dBConfig.txt";
            File file = new File(fileName);
            fileStream = new FileInputStream(file);
            super.load(fileStream);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Impossible to open the file", ButtonType.OK);
            alert.showAndWait();
        } finally {
            try {
                if (fileStream != null) {
                    fileStream.close();
                }
            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Error during the closing process", ButtonType.OK);
                alert.showAndWait();
            }
        }

    }

    public String getProperties(String propertyName)
    {
        return this.getProperty(propertyName);
    }
}
