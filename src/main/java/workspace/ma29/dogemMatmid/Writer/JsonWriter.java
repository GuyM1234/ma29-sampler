package workspace.ma29.dogemMatmid.Writer;
import com.fasterxml.jackson.databind.ObjectMapper;
import workspace.ma29.dogemMatmid.Formatter.Formats.BaseFormat;
import workspace.ma29.dogemMatmid.Formatter.Formats.JsonFormat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class JsonWriter extends FileWriter {
    private static final String fileType = ".json";
    private static final int recordPerFile = 250;

    public JsonWriter(ArrayList data, String writeTo) {
        super(data, writeTo, new ObjectMapper(), fileType, recordPerFile);
    }

    @Override
    public BaseFormat formatData(Object[] data) {
        return new JsonFormat(data);
    }
}
