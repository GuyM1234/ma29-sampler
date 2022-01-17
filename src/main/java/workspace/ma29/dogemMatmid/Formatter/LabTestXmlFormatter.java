package workspace.ma29.dogemMatmid.Formatter;

import workspace.ma29.dogemMatmid.Formatter.Formats.LabTestXmlFormat;

public class LabTestXmlFormatter extends Formatter<LabTestXmlFormat>{
    @Override
    public LabTestXmlFormat format(Object[] data) {
        return new LabTestXmlFormat(data);
    }
}
