package workspace.ma29.dogemMatmid.Writer.FileWriter;

import com.fasterxml.jackson.databind.ObjectMapper;
import workspace.ma29.dogemMatmid.Writer.FileWriter.FileWriter;

import java.util.ArrayList;

public abstract class NumberRecordsFileWriter extends FileWriter {
    private int recordsPerFile;

    public NumberRecordsFileWriter(ArrayList data, String writeTo, ObjectMapper objectMapper, String fileType, int recordsPerFile) {
        super(data, writeTo, objectMapper, fileType);
        this.recordsPerFile = recordsPerFile;
    }

    @Override
    public int getRecordsNumber() {
        return this.recordsPerFile;
    }
}
