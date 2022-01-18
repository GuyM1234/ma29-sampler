package workspace.ma29.dogemMatmid.Reader;

import org.apache.commons.csv.CSVRecord;
import workspace.ma29.dogemMatmid.DataStructures.LabTest;
import workspace.ma29.dogemMatmid.DataStructures.LabTestSerology;

public class LabTestSerologyCsvReader extends CsvReader<LabTestSerology> {

    public LabTestSerologyCsvReader(String path) {
        super(path);
    }

    @Override
    public LabTestSerology readRecordToData(CSVRecord record) {
        return new LabTestSerology(record.get(0),record.get(1),record.get(2),record.get(3),record.get(4),record.get(5),record.get(6),record.get(7),record.get(8),record.get(9));
    }

    @Override
    public boolean validate(CSVRecord record) {
        if (this.uniqueKey.contains(record.get(0))) {
            return false;
        } else if (record.get(0).length() != 9) {
            return false;
        }
        try {
            Integer.parseInt(record.get(0));
            Integer.parseInt(String.valueOf(record.get(6).charAt(0)));
            Integer.parseInt(String.valueOf(record.get(6).charAt(1)));
            Integer.parseInt(String.valueOf(record.get(6).charAt(4)));
        } catch (NumberFormatException e) {
            return false;
        }
        try {
            Integer.parseInt(String.valueOf(record.get(6).charAt(2)));
            Integer.parseInt(String.valueOf(record.get(6).charAt(3)));
            return false;
        } catch (NumberFormatException e) {}

        this.uniqueKey.add(record.get(0));
        return true;
    }
}
