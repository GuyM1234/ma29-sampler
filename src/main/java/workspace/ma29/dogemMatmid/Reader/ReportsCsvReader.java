package workspace.ma29.dogemMatmid.Reader;

import workspace.ma29.dogemMatmid.DataStructures.Report;
import org.apache.commons.csv.CSVRecord;

public class ReportsCsvReader extends CsvReader<Report> {

    public ReportsCsvReader(String path) {
        super(path);
    }

    @Override
    public Report readRecordToData(CSVRecord record) {
        return new Report(record.get(0),record.get(1),record.get(2),record.get(3),record.get(4),record.get(5),record.get(6),
                record.get(7),record.get(8),record.get(9),record.get(10),record.get(11));
    }

    @Override
    public boolean validate(CSVRecord record) {
        if (this.uniqueKey.contains(record.get(8))) {
            return false;
        }
        this.uniqueKey.add(record.get(8));
        return true;
    }
}
