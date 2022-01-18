package workspace.ma29.dogemMatmid.Writer.db;

import workspace.ma29.dogemMatmid.DataStructures.Data;

import java.util.ArrayList;
import java.util.Date;

public abstract class LabResultsDbWriter<T extends Data> extends DBWriter<T> {

    public LabResultsDbWriter(ArrayList<T> data, String dbName) {
        super(data, dbName);
    }
}
