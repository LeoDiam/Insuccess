package Insuccess.app.manager;


import Insuccess.app.utils.DbConnectionUtils;

import java.sql.Connection;

public class DBConnectionManager {
    private final Connection con;


    public DBConnectionManager() {

        this.con = DbConnectionUtils.initConnection();
    }

    public Connection getCon() {
        return con;
    }


    public void closeCon() {
        DbConnectionUtils.closeConnection();
    }
}
