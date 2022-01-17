//package workspace.ma29.dogemMatmid.Writer;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.dataformat.xml.XmlMapper;
//import workspace.ma29.dogemMatmid.Formatter.Formatter;
//;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class XmlWriter<T> extends FileWriter{
//    private Formatter formatter;
//
//    public XmlWriter(ArrayList<T> data, String writeTo, Formatter formatter) {
//        super(data, writeTo);
//        this.xmlMapper = new XmlMapper();
//        this.formatter = formatter;
//    }
//
//    @Override
//    public void write() {
//        try {
//            int i = 0;
//            for (; i < this.data.size() / recordPerFile; i++) {
//                this.xmlMapper.writeValue(new java.io.FileWriter(this.writeTo + i + fileType),
//                        formatter.format(Arrays.copyOfRange(this.data.toArray(), i * recordPerFile , (i + 1) * recordPerFile)));
//            }
//            if (this.data.size() % recordPerFile != 0) {
//                this.xmlMapper.writeValue(new java.io.FileWriter(this.writeTo  + i + fileType),
//                        formatter.format(Arrays.copyOfRange(this.data.toArray(), i * recordPerFile , this.data.size())));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
