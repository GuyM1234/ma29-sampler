package workspace.ma29.dogemMatmid.Reader;

import com.ctc.wstx.exc.WstxOutputException;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import workspace.ma29.dogemMatmid.DataStructures.Data;
import org.apache.commons.csv.CSVFormat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class CsvReader<T extends Data> extends FileReader {

    protected HashSet<String> uniqueKey;
    public CsvReader(String path) {
        super(path);
        this.uniqueKey = new HashSet<String>();
    }

    public abstract T readRecordToData(CSVRecord record);

    public abstract boolean validate(CSVRecord record);

    @Override
    public ArrayList<T> read() {
        ArrayList<T> data = new ArrayList<T>();
        try {
            CSVParser records = CSVFormat.DEFAULT.parse(super.getFile());
            for (CSVRecord record : records) {
                if (this.validate(record)) {
                    data.add(readRecordToData(record));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
