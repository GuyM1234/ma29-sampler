package workspace.m.gA;

import workspace.m.gA.DataStructures.ReportData;
import workspace.m.gA.Reader.ReportsCsvReader;
import workspace.m.gA.Writer.JsonWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        int recordPerFile = 250;
        int i = 1;
        ReportsCsvReader c = new ReportsCsvReader("src/main/resources/MadaReports.csv");
        ArrayList<ReportData> d =  c.read();
        JsonWriter j = new JsonWriter(d, "C:\\Users\\user\\Desktop\\Code\\GA\\Data\\");
        j.write();
//        System.out.println();
    }
}
