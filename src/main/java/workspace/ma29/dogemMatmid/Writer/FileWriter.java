package workspace.ma29.dogemMatmid.Writer;

import java.util.ArrayList;

public abstract class FileWriter<T> extends Writer {
    protected String writeTo;

    public FileWriter(ArrayList<T> data, String writeTo) {
        super(data);
        this.writeTo = writeTo;
    }
}
