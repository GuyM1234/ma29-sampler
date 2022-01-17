package workspace.ma29.dogemMatmid.Formatter;

import workspace.ma29.dogemMatmid.DataStructures.Data;
import workspace.ma29.dogemMatmid.DataStructures.LabTest;
import workspace.ma29.dogemMatmid.Formats.BaseFormat;
import workspace.ma29.dogemMatmid.Formats.LabTestXmlFormat;

import java.util.ArrayList;

public class LabTestXmlFormatter extends Formatter<LabTestXmlFormat>{
    @Override
    public LabTestXmlFormat format(Object[] data) {
        return new LabTestXmlFormat<LabTest>(data);
    }
}
