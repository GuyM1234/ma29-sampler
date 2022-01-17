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
        Map<String, LabTest> labTestsMap = labTests.stream().collect(Collectors.toMap(LabTest::getIdNum, Function.identity()));
        Map<String, Report> reportsMap = reports.stream().collect(Collectors.toMap(Report::getIdNum, Function.identity()));

        for (String key : reportsMap.keySet()) {
            if (labTests.contains(key)) {

            }
        }
        return positivePeople;
    }
}
