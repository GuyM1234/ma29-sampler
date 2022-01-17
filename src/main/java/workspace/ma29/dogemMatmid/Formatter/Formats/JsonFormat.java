package workspace.ma29.dogemMatmid.Formatter.Formats;


public class JsonFormat extends BaseFormat {
    private Object[] data;

    public JsonFormat(Object[] data) {
        this.data = data;
    }

    public Object[] getData() {
        return data;
    }

    public void setData(Object[] data) {
        this.data = data;
    }
}
