package workspace.m.gA.Writer;

import workspace.m.gA.DataStructures.Data;

import java.util.ArrayList;

public abstract class Writer<T extends Data> implements Writable {
    protected ArrayList<T> data;

    public Writer(ArrayList<T> data) {
        this.data = data;
    }
}
