package workspace.m.gA.Reader;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import workspace.m.gA.DataStructures.Data;
import org.apache.commons.csv.CSVFormat;

import java.io.IOException;
import java.util.ArrayList;

public abstract class CsvReader<T extends Data> extends FileReader {

    public CsvReader(String path) {
        super(path);
    }

    public abstract T readRecordToData(CSVRecord record);

    @Override
    public ArrayList<T> read() {
        ArrayList<T> data = new ArrayList<T>();
        try {
            CSVParser records = CSVFormat.DEFAULT.parse(super.getFile());
            records.forEach(record -> data.add(readRecordToData(record)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
