package workspace.ma29.dogemMatmid.Writer;

import com.fasterxml.jackson.databind.ObjectMapper;
import workspace.ma29.dogemMatmid.Formatter.Formats.BaseFormat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class FileWriter<T extends BaseFormat> extends Writer {
    protected String writeTo;
    protected ObjectMapper objectMapper;
    protected String fileType;
    protected int recordPerFile;

    public FileWriter(ArrayList data, String writeTo, ObjectMapper objectMapper, String fileType, int recordPerFile) {
        super(data);
        this.writeTo = writeTo;
        this.objectMapper = objectMapper;
        this.fileType = fileType;
        this.recordPerFile = recordPerFile;
    }

    public abstract T formatData(Object[] data);

    @Override
    public void write() {
        try {
            int i = 0;
            for (; i < this.data.size() / this.recordPerFile; i++) {
                this.objectMapper.writeValue(new java.io.FileWriter(this.writeTo + i + fileType), formatData(arrayRange(i)));
            }
            if (this.data.size() % recordPerFile != 0) {
                this.objectMapper.writeValue(new java.io.FileWriter(this.writeTo + i + fileType),
                        formatData(Arrays.copyOfRange(this.data.toArray(), i * this.recordPerFile , this.data.size())));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Object[] arrayRange(int i) {
        return Arrays.copyOfRange(this.data.toArray(), i * this.recordPerFile , (i + 1) * this.recordPerFile);
    }


}
