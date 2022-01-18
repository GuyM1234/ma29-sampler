package workspace.ma29.dogemMatmid.Writer.RecordsPerFileCalcs;

public class RecordsNumByConst extends RecordsNum {
    private int numberOfRecords;

    public RecordsNumByConst(int numberOfRecords) {
        this.numberOfRecords = numberOfRecords;
    }

    @Override
    public int getRecordsNumber() {
        return this.numberOfRecords;
    }
}
