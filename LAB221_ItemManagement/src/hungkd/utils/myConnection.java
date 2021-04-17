/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungkd.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class myConnection {

    Connection conn = null;
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String url = "jdbc:sqlserver://localhost:1433;databaseName=ItemSupplier;username=sa;password=140383";

    public myConnection() {
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
        Class.forName(driver);
        conn = DriverManager.getConnection(url);
        return conn;
    }

}
