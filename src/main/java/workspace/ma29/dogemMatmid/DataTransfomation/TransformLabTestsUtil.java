package workspace.ma29.dogemMatmid.DataTransfomation;

import workspace.ma29.dogemMatmid.DataStructures.LabTest;

import java.util.ArrayList;

public class TransformLabTestsUtil {
    public void addHealthData(ArrayList<LabTest> labTests) {
        labTests.forEach(labTest -> labTest.setHealthData());
    }
}
