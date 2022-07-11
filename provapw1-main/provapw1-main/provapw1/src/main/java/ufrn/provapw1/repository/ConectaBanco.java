package ufrn.provapw1.repository;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBanco {


    public static Connection getConnection() throws SQLException, URISyntaxException {
        String dbUri = System.getenv("localhost");
        String dbPort = System.getenv("5433");
        String dbName = System.getenv("dbprova");

        String username = System.getenv("postgres");
        String password = System.getenv("postgres");
        String dbUrl = "jdbc:postgresql://" + dbUri + ':' + dbPort + "/5432" + dbName + "?serverTimezone=UTC";

        return DriverManager.getConnection(dbUrl, username, password);
    }
}