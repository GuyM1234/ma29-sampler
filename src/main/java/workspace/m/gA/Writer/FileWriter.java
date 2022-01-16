package workspace.m.gA.Writer;

import workspace.m.gA.DataStructures.Data;

import java.util.ArrayList;

public abstract class FileWriter<T> extends Writer {
    protected String writeTo;

    public FileWriter(ArrayList<T> data, String writeTo) {
        super(data);
        this.writeTo = writeTo;
    }
}
