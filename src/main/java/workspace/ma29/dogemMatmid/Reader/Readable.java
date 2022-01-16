package workspace.ma29.dogemMatmid.Reader;

import workspace.ma29.dogemMatmid.DataStructures.Data;

import java.util.ArrayList;

public interface Readable<T extends Data> {
    public ArrayList<T> read();
}
