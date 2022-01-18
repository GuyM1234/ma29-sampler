package workspace.ma29.dogemMatmid.Writer.Formatter;

import workspace.ma29.dogemMatmid.Writer.Formatter.Formats.BaseFormat;

public interface Formatable<T extends BaseFormat> {
    public T format(Object[] data);
}
