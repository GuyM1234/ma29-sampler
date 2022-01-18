package workspace.ma29.dogemMatmid.Writer.Formatter.Formats;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "LabTests")
public class LabTestXmlFormat extends BaseFormat {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "LabTest")
    Object[] data;

    public LabTestXmlFormat(Object[] data) {
        this.data = data;
    }

    public Object[] getData() {
        return data;
    }

    public void setData(Object[] data) {
        this.data = data;
    }
}
