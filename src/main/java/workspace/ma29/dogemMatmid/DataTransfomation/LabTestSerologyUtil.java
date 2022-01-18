package workspace.ma29.dogemMatmid.DataTransfomation;

import workspace.ma29.dogemMatmid.DataStructures.LabTestSerology;

import java.util.ArrayList;
import java.util.HashMap;

public class LabTestSerologyUtil {
    private HashMap<Integer, Integer> kitsMap;
    private final int minKit = 15;
    public LabTestSerologyUtil() {
        this.kitsMap = new HashMap<Integer, Integer>();
        this.kitsMap.put(15, 500);
        this.kitsMap.put(16, 1500);
        this.kitsMap.put(17, 3000);
    }

    public void updateKits(ArrayList<LabTestSerology> labTestSerologies) {
        labTestSerologies.forEach(labTestSerology -> {
            if (kitsMap.get(Integer.parseInt(labTestSerology.getKitNumber())) > Integer.parseInt(labTestSerology.getAntidotes())) {
                labTestSerology.setKitNumber(String.valueOf(getKit(labTestSerology)));
            }
        });
    }

    public int getKit(LabTestSerology labTestSerology) {
        for (int i = Integer.parseInt(labTestSerology.getKitNumber()) - 1; i >= minKit; i--) {
            if (kitsMap.get(i) < Integer.parseInt(labTestSerology.getAntidotes())) {
                return i;
            }
        }
        return -1;
    }
}
