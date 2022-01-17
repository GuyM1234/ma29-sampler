package workspace.ma29.dogemMatmid.Writer;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import workspace.ma29.dogemMatmid.Formatter.Formats.BaseFormat;
import workspace.ma29.dogemMatmid.Formatter.Formatter;
import java.util.ArrayList;

public class XmlWriter extends FileWriter{
    private Formatter formatter;
    private static final String fileType = ".xml";
    private static final int recordPerFile = 250;

    public XmlWriter(ArrayList data, String writeTo, Formatter formatter) {
        super(data, writeTo, new XmlMapper(), fileType, recordPerFile);
        this.formatter = formatter;
    }

    @Override
    public BaseFormat formatData(Object[] data) {
        return formatter.format(data);
    }
}
