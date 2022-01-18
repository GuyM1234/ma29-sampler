package workspace.ma29.dogemMatmid.Writer.db;

import workspace.ma29.dogemMatmid.DataStructures.Data;
import workspace.ma29.dogemMatmid.Writer.Writer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public abstract class DBWriter<T extends Data> extends Writer {
    protected Statement batchStmt;
    public DBWriter(ArrayList<T> data, String dbName) {
        super(data);
        String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=" + dbName;
        try {
            Connection conn = DriverManager.getConnection(dbURL);
            this.batchStmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public abstract void addToBatch(T record);

    @Override
    public void write() {
        try {
            this.data.forEach(record -> addToBatch((T) record));
            this.batchStmt.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}