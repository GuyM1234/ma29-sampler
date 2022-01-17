package workspace.ma29.dogemMatmid.Reader;

import org.apache.commons.csv.CSVRecord;
import workspace.ma29.dogemMatmid.DataStructures.LabTest;

public class LabTestsCsvReader extends CsvReader<LabTest> {

    public LabTestsCsvReader(String path) {
        super(path);
    }

    @Override
    public LabTest readRecordToData(CSVRecord record) {
        return new LabTest(record.get(0),record.get(1),record.get(2),record.get(3),record.get(4),record.get(5),record.get(6),
                record.get(7),record.get(8),record.get(9),record.get(10));
    }
}
