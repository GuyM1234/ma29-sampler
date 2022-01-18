package workspace.ma29.dogemMatmid.Writer;

import workspace.ma29.dogemMatmid.DataStructures.Data;

import java.util.ArrayList;

public abstract class Writer<T extends Data> implements Writable {
    protected ArrayList<T> data;

    public Writer(ArrayList<T> data) {
        this.data = data;
    }
}
