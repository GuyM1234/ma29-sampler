package workspace.ma29.dogemMatmid.Writer.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import workspace.ma29.dogemMatmid.Writer.Formatter.Formats.BaseFormat;
import workspace.ma29.dogemMatmid.Writer.Formatter.Formats.JsonFormat;
import workspace.ma29.dogemMatmid.Writer.FileWriter.SizeFileWriter;

import java.util.ArrayList;

public class JsonFileSizeWriter extends SizeFileWriter {
    private static final String fileType = ".json";

    public JsonFileSizeWriter(ArrayList data, String writeTo, double sizeInMb) {
        super(data, writeTo, new ObjectMapper(), fileType, sizeInMb);
    }

    @Override
    public BaseFormat formatData(Object[] data) {
        return new JsonFormat(data);
    }
}
