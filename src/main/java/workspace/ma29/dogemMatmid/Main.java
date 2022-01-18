package workspace.ma29.dogemMatmid;

import workspace.ma29.dogemMatmid.DataStructures.LabTestSerology;
import workspace.ma29.dogemMatmid.DataTransfomation.LabTestSerologyUtil;
import workspace.ma29.dogemMatmid.Reader.LabTestSerologyCsvReader;
import workspace.ma29.dogemMatmid.Writer.db.DBWriter;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
//        ReportsCsvReader c1 = new ReportsCsvReader("src/main/resources/MadaReports.csv");
//        LabTestsCsvReader c2 = new LabTestsCsvReader("src/main/resources/LabTests.csv");
//        ArrayList<Report> reports =  c1.read();
//        ArrayList<LabTest> labTests =  c2.read();
//        TransformLabTestsUtil labTestsUtil = new TransformLabTestsUtil();
//        labTestsUtil.addHealthData(labTests);

//        ArrayList<PositivePerson> positivePeople = new PositiveCoronaBuilder().build(labTests,reports);

//        XmlNumberRecordsWriter j = new XmlNumberRecordsWriter(labTests, "C:\\Users\\user\\Desktop\\Code\\Data\\labTests\\file", 100,new LabTestXmlFormatter());
//        JsonFileSizeWriter j2 = new JsonFileSizeWriter(positivePeople, "C:\\Users\\user\\Desktop\\Code\\Data\\positive_corona_people\\file",  0.05);
//        j.write();
//        j2.write();


        LabTestSerologyCsvReader c3 = new LabTestSerologyCsvReader("src/main/resources/Serology.csv");
        ArrayList<LabTestSerology> labTestSerologies = c3.read();
        System.out.println(labTestSerologies.size());

        LabTestSerologyUtil u = new LabTestSerologyUtil();
        u.updateKits(labTestSerologies);
//        DBWriter dbWriter = new DBWriter(labTestSerologies);
    }
}
