package workspace.m.gA.Reader;

import workspace.m.gA.DataStructures.Data;

import java.util.ArrayList;

public interface Readable<T extends Data> {
    public ArrayList<T> read();
}
