package workspace.ma29.dogemMatmid.Writer.db;

import workspace.ma29.dogemMatmid.DataStructures.Data;
import workspace.ma29.dogemMatmid.DataStructures.LabTestSerology;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public class LabTestSerologyWriter extends LabResultsDbWriter<LabTestSerology> {

    public LabTestSerologyWriter(ArrayList<LabTestSerology> data) {
        super(data, "LabTest");
    }

    @Override
    public void addToBatch(LabTestSerology record) {
        try {
            this.batchStmt.addBatch("INSERT INTO LabResults_SerologyKits VALUES("
                    + record.getIdNum() + ','
                    + Integer.parseInt(record.getIdType()) + ','
                    + record.getFirstName() + ','
                    + record.getLastName() + ','
                    + Date.valueOf(record.getResultDate()) + ','
                    + Date.valueOf(record.getBirthDate())+ ','
                    + record.getLabCode() + ','
                    + record.getStickerNumber() + ','
                    + Integer.parseInt(record.getAntidotes()) + ','
                    + Integer.parseInt(record.getKitNumber()) + ')'
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
