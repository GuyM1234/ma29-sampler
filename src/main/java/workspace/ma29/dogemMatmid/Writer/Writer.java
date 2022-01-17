package workspace.ma29.dogemMatmid.Writer;

import java.util.ArrayList;

public abstract class Writer implements Writable {
    protected ArrayList data;

    public Writer(ArrayList data) {
        this.data = data;
    }
}
