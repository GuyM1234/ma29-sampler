package workspace.ma29.dogemMatmid.Writer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import workspace.ma29.dogemMatmid.Formatter.Formats.BaseFormat;

import java.util.ArrayList;

public abstract class SizeFileWriter extends FileWriter{
    private double sizeInMb;
    private static final int bytesToMbMult = 1000000;

    public SizeFileWriter(ArrayList data, String writeTo, ObjectMapper objectMapper, String fileType, double sizeInMb) {
        super(data, writeTo, objectMapper, fileType);
        this.sizeInMb = sizeInMb;
    }

    @Override
    public int getRecordsNumber() {
        double sizeInBytes = 0;
        try {
            sizeInBytes = this.objectMapper.writeValueAsString(data).length();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        double avgSize = sizeInBytes / bytesToMbMult / this.data.size();
        return (int) (this.sizeInMb / avgSize);
    }
}
