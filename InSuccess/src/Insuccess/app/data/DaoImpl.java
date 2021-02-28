package Insuccess.app.data;

import Insuccess.app.manager.DBConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoImpl  {

    private final DBConnectionManager manager;

    public DaoImpl(DBConnectionManager manager) {
        this.manager = manager;
    }
}
