package workspace.ma29.dogemMatmid.Writer.RecordsPerFileCalcs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RecordsNumByFileSizeLimit extends RecordsNum{
    private double sizeInMb;
    private Object[] data;
    private ObjectMapper objectMapper;
    private static final int bytesToMbMult = 1000000;

    public RecordsNumByFileSizeLimit(double sizeInMb, Object[] data, ObjectMapper objectMapper) {
        this.sizeInMb = sizeInMb;
        this.data = data;
        this.objectMapper = objectMapper;
    }


    @Override
    public int getRecordsNumber() {
        double sizeInBytes = 0;
        try {
            sizeInBytes = this.objectMapper.writeValueAsString(data).length();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        double avgSize = sizeInBytes / bytesToMbMult / this.data.length;
        return (int) (this.sizeInMb / avgSize);
    }
}
