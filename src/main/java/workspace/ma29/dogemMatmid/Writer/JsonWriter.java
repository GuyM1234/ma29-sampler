package workspace.ma29.dogemMatmid.Writer;
import com.fasterxml.jackson.databind.ObjectMapper;
import workspace.ma29.dogemMatmid.Formatter.Formats.BaseFormat;
import workspace.ma29.dogemMatmid.Formatter.Formats.JsonFormat;
import workspace.ma29.dogemMatmid.Writer.RecordsPerFileCalcs.RecordsNum;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class JsonWriter extends FileWriter {
    private static final String fileType = ".json";

    public JsonWriter(ArrayList data, String writeTo, RecordsNum recordsNum) {
        super(data, writeTo, new ObjectMapper(), fileType, recordsNum);
    }

    @Override
    public BaseFormat formatData(Object[] data) {
        return new JsonFormat(data);
    }
}
