package workspace.ma29.dogemMatmid.Writer.json;
import com.fasterxml.jackson.databind.ObjectMapper;
import workspace.ma29.dogemMatmid.Writer.Formatter.Formats.BaseFormat;
import workspace.ma29.dogemMatmid.Writer.Formatter.Formats.JsonFormat;
import workspace.ma29.dogemMatmid.Writer.FileWriter.NumberRecordsFileWriter;

import java.util.ArrayList;


public class JsonNumberRecordWriter extends NumberRecordsFileWriter {
    private static final String fileType = ".json";

    public JsonNumberRecordWriter(ArrayList data, String writeTo, int recordsPerFile) {
        super(data, writeTo, new ObjectMapper(), fileType, recordsPerFile);
    }

    @Override
    public BaseFormat formatData(Object[] data) {
        return new JsonFormat(data);
    }
}
