package cn.swufe.test;

import cn.swufe.Util.dbconnection;

import java.sql.Connection;

public class TestDB {
    public static void main(String[] args) {
        dbconnection db = new dbconnection();
        Connection connection = db.getConnection();
        db.closeConnection(connection);
    }
}
