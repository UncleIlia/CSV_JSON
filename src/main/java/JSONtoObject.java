import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JSONtoObject {
    public String readString(String fileName) throws Exception {
        return readFileAsString(fileName);
    }

    public static String readFileAsString(String file) throws Exception {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    public List<Employee> jsonToList(String fileName) throws Exception {

        List<Employee> list = new ArrayList<>();

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(readString(fileName));
        for (Object o : jsonArray) {
            Employee employee = gson.fromJson(o.toString(), Employee.class);
            list.add(employee);
        }
        return list;
    }
}
