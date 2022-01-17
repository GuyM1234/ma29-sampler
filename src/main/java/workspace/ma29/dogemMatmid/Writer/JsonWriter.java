package workspace.ma29.dogemMatmid.Writer;
import com.fasterxml.jackson.databind.ObjectMapper;
import workspace.ma29.dogemMatmid.Formatter.Formats.BaseFormat;
import workspace.ma29.dogemMatmid.Formatter.Formats.JsonFormat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class JsonWriter extends FileWriter<JsonFormat> {
    private ObjectMapper objectMapper;
    private static final String fileType = ".json";
    private static final int recordPerFile = 250;

    public JsonWriter(ArrayList data, String writeTo) {
        super(data, writeTo, new ObjectMapper(), fileType, recordPerFile);
    }

    @Override
    public JsonFormat formatData(Object[] data) {
        return new JsonFormat(data);
    }

    //    public JsonWriter(ArrayList<T> data, String writeTo) {
//        super(data, writeTo);
//        this.objectMapper = new ObjectMapper();
//    }

//    @Override
//    public void write() {
//        try {
//            int i = 0;
//            for (; i < this.data.size() / this.recordPerFile; i++) {
//                this.objectMapper.writeValue(new java.io.FileWriter(this.writeTo + i + fileType),
//                        Arrays.copyOfRange(this.data.toArray(), i * this.recordPerFile , (i + 1) * this.recordPerFile));
//            }
//            if (this.data.size() % recordPerFile != 0) {
//                this.objectMapper.writeValue(new java.io.FileWriter(this.writeTo + i + fileType),
//                        Arrays.copyOfRange(this.data.toArray(), i * this.recordPerFile , this.data.size()));
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
