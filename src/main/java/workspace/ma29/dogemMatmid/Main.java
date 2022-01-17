package workspace.ma29.dogemMatmid;

import workspace.ma29.dogemMatmid.DataStructures.LabTest;
import workspace.ma29.dogemMatmid.DataTransfomation.TransformLabTestsUtil;
import workspace.ma29.dogemMatmid.Formatter.LabTestXmlFormatter;
import workspace.ma29.dogemMatmid.Reader.LabTestsCsvReader;
import workspace.ma29.dogemMatmid.Writer.JsonWriter;
//import workspace.ma29.dogemMatmid.Writer.XmlWriter;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
//        ReportsCsvReader c = new ReportsCsvReader("src/main/resources/MadaReports.csv");
        LabTestsCsvReader c = new LabTestsCsvReader("src/main/resources/LabTests.csv");
        ArrayList<LabTest> d =  c.read();
        TransformLabTestsUtil labTestsUtil = new TransformLabTestsUtil();
        labTestsUtil.addHealthData(d);
//        XmlWriter j = new XmlWriter(d, "C:\\Users\\user\\Desktop\\Code\\Data\\file", new LabTestXmlFormatter());
        JsonWriter j = new JsonWriter(d, "C:\\Users\\user\\Desktop\\Code\\Data\\file");
        j.write();

    }
}
