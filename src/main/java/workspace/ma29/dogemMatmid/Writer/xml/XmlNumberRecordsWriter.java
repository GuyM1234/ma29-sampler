package workspace.ma29.dogemMatmid.Writer.xml;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import workspace.ma29.dogemMatmid.Formatter.Formats.BaseFormat;
import workspace.ma29.dogemMatmid.Formatter.Formatter;
import workspace.ma29.dogemMatmid.Writer.FileWriter.NumberRecordsFileWriter;

import java.util.ArrayList;

public class XmlNumberRecordsWriter extends NumberRecordsFileWriter {
    private Formatter formatter;
    private static final String fileType = ".xml";

    public XmlNumberRecordsWriter(ArrayList data, String writeTo, int recordsPerFile, Formatter formatter) {
        super(data, writeTo, new XmlMapper(), fileType, recordsPerFile);
        this.formatter = formatter;
    }

    @Override
    public BaseFormat formatData(Object[] data) {
        return formatter.format(data);
    }
}
