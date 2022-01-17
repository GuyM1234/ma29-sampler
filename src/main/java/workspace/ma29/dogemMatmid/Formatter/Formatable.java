package workspace.ma29.dogemMatmid.Formatter;

import workspace.ma29.dogemMatmid.DataStructures.Data;
import workspace.ma29.dogemMatmid.Formats.BaseFormat;

import java.util.ArrayList;

public interface Formatable<T extends BaseFormat> {
    public T format(Object[] data);
}
