package workspace.m.gA.Writer;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class JsonWriter<T> extends FileWriter {
    private ObjectMapper objectMapper;
    private static final String fileName = "json_file";
    private static final int recordPerFile = 250;
    public JsonWriter(ArrayList<T> data, String writeTo) {
        super(data, writeTo);
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public void write() {
        try {
            int i = 0;
            for (; i < this.data.size() / recordPerFile; i++) {
                this.objectMapper.writeValue(new java.io.FileWriter(this.writeTo + fileName + i + ".json"),
                        Arrays.copyOfRange(this.data.toArray(), i * recordPerFile , (i + 1) * recordPerFile));
            }
            if (this.data.size() % recordPerFile != 0) {
                this.objectMapper.writeValue(new java.io.FileWriter(this.writeTo + fileName + i + ".json"),
                        Arrays.copyOfRange(this.data.toArray(), i * recordPerFile , this.data.size()));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
