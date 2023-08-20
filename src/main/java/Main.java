import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";
//        CSV_FileCreator csv_fileCreator = new CSV_FileCreator();
//        csv_fileCreator.createCSV("data.csv");

//        CSV_Parser CSVParser = new CSV_Parser();
//        List<Employee> list = CSVParser.parseCSV(columnMapping, fileName);
//
//        ToJSON toJSON = new ToJSON();
//        toJSON.listToJSON(list, "data.json");

        XML_Parser xml_parser = new XML_Parser();
        System.out.println(xml_parser.parseXML("data.xml"));

    }
}
