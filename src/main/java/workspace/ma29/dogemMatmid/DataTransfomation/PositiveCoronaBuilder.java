package workspace.ma29.dogemMatmid.DataTransfomation;

import workspace.ma29.dogemMatmid.DataStructures.Data;
import workspace.ma29.dogemMatmid.DataStructures.LabTest;
import workspace.ma29.dogemMatmid.DataStructures.PositivePerson;
import workspace.ma29.dogemMatmid.DataStructures.Report;

import java.util.ArrayList;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PositiveCoronaBuilder {
    public ArrayList<PositivePerson> build(ArrayList<LabTest> labTests, ArrayList<Report> reports) {
        ArrayList<PositivePerson> positivePeople = new ArrayList<PositivePerson>();
        System.out.println(labTests.size());
        System.out.println(reports.size());
        Map<String, LabTest> labTestsMap = labTests.stream().collect(Collectors.toMap(LabTest::getStickerNumber, Function.identity()));
        Map<String, Report> reportsMap = reports.stream().collect(Collectors.toMap(Report::getBarcode, Function.identity()));
//        for (String key : reportsMap.keySet()) {
//            if (labTestsMap.containsKey(key) && labTestsMap.get(key).getResultTestCorona().equals("1")) {
//                LabTest l = labTestsMap.get(key);
//                Report r = reportsMap.get(key);
//                positivePeople.add(new PositivePerson(r.getIdNum(),r.getIdType(),r.getFirstName(),r.getLastName(),r.getCity(),r.getStreet(),r.getBuildingNumber(),r.getBarcode(),
//                        l.getBirthDate(),l.getLabCode(),l.getResultDate(),r.getTakeDate(),l.getStickerNumber(), l.getResultTestCorona(),l.getVariant(),l.getTestType()));
//            }
//        }
        return positivePeople;
    }
}
