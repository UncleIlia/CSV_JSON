import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";
//        CSV_FileCreator csv_fileCreator = new CSV_FileCreator();
//        csv_fileCreator.createCSV("data.csv");

//        CSV_Parser CSVParser = new CSV_Parser();
//        List<Employee> list = CSVParser.parseCSV(columnMapping, fileName);
//
//        ToJSON toJSON = new ToJSON();
//        toJSON.listToJSON(list, "data.json");

//        XMLParser xml_parser = new XMLParser();
//        ToJSON toJSON = new ToJSON();
//        toJSON.listToJSON(xml_parser.parseXML("data.xml"), "data2.json");

        JSONtoObject jsoNtoObject = new JSONtoObject();
        System.out.println(jsoNtoObject.jsonToList("data.json"));

    }
}
