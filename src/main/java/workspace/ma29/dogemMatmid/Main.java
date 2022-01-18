package workspace.ma29.dogemMatmid;

import workspace.ma29.dogemMatmid.DataStructures.LabTest;
import workspace.ma29.dogemMatmid.DataStructures.Report;
import workspace.ma29.dogemMatmid.DataTransfomation.TransformLabTestsUtil;
import workspace.ma29.dogemMatmid.Reader.LabTestsCsvReader;
import workspace.ma29.dogemMatmid.Reader.ReportsCsvReader;
import workspace.ma29.dogemMatmid.Writer.JsonFileSizeWriter;
import workspace.ma29.dogemMatmid.Writer.JsonNumberRecordWriter;
//import workspace.ma29.dogemMatmid.Writer.XmlWriter;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ReportsCsvReader c1 = new ReportsCsvReader("src/main/resources/MadaReports.csv");
        LabTestsCsvReader c2 = new LabTestsCsvReader("src/main/resources/LabTests.csv");
        ArrayList<Report> reports =  c1.read();
        ArrayList<LabTest> labTests =  c2.read();
        TransformLabTestsUtil labTestsUtil = new TransformLabTestsUtil();
        labTestsUtil.addHealthData(labTests);

//        System.out.println(new PositiveCoronaBuilder().build(labTests,reports));


//                XmlWriter j = new XmlWriter(d, "C:\\Users\\user\\Desktop\\Code\\Data\\file", new LabTestXmlFormatter());
//        JsonWriter j1 = new JsonWriter(labTests, "C:\\Users\\user\\Desktop\\Code\\Data\\reports\\file", new RecordsNumByConst(250));
        JsonFileSizeWriter j2 = new JsonFileSizeWriter(reports, "C:\\Users\\user\\Desktop\\Code\\Data\\labTests\\file",  0.05);
//        j1.write();
        j2.write();

//        System.out.println((int) Math.ceil((double) 4400000 / 1000000 / 0.5));
    }
}
