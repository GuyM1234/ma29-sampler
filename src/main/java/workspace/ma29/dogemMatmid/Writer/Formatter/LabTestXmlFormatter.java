package workspace.ma29.dogemMatmid.Writer.Formatter;

import workspace.ma29.dogemMatmid.Writer.Formatter.Formats.LabTestXmlFormat;

public class LabTestXmlFormatter extends Formatter<LabTestXmlFormat>{
    @Override
    public LabTestXmlFormat format(Object[] data) {
        return new LabTestXmlFormat(data);
    }
}
