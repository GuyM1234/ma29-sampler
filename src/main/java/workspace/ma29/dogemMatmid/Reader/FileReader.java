package workspace.ma29.dogemMatmid.Reader;

import java.io.FileNotFoundException;

public abstract class FileReader extends Reader {
    private String path;

    public FileReader(String path) {
        this.path = path;
    }

    protected java.io.Reader getFile() {
        try {
            return new java.io.FileReader(this.path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
