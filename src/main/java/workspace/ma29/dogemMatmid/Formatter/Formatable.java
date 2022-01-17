package workspace.ma29.dogemMatmid.Formatter;

import workspace.ma29.dogemMatmid.Formatter.Formats.BaseFormat;

public interface Formatable<T extends BaseFormat> {
    public T format(Object[] data);
}
