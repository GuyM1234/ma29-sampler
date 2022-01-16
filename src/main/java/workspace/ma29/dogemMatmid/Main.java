package workspace.ma29.dogemMatmid;

import workspace.ma29.dogemMatmid.DataStructures.ReportData;
import workspace.ma29.dogemMatmid.Reader.ReportsCsvReader;
import workspace.ma29.dogemMatmid.Writer.JsonWriter;
import workspace.ma29.dogemMatmid.Writer.XmlWriter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ReportsCsvReader c = new ReportsCsvReader("src/main/resources/MadaReports.csv");
        ArrayList<ReportData> d =  c.read();
        XmlWriter j = new XmlWriter(d, "C:\\Users\\user\\Desktop\\Code\\GA\\Data\\");
        j.write();
    }
}
