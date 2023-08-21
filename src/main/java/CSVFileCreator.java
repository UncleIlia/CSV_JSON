import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class CSVFileCreator {
    public void createCSV (String fileName){
        try (CSVWriter writer = new CSVWriter(new FileWriter(fileName, true))){
            String[] employee1 = "1,John,Smith,USA,25".split(",");
            String[] employee2 = "2,Ivan,Petrov,RU,23".split(",");
            writer.writeNext(employee1);
            writer.writeNext(employee2);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
