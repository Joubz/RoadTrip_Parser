import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class main {
    public static void main(String[] args) {
        System.out.println("Begin");

        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("Ressources/colisee.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONObject monument = (JSONObject) obj;

            JSONArray monumentArray = (JSONArray) monument.get("elements");
            monumentArray.forEach(emp -> parseMonumentObject((JSONObject) emp));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseMonumentObject(JSONObject monument) {
        //Get first index
        if(monument.containsKey("tags"))
        {
            JSONObject monumentObject = (JSONObject) monument.get("tags");

            String address = (String) monumentObject.get("addr:street");
            String historic = (String) monumentObject.get("historic");
            String name = (String) monumentObject.get("name:fr");
            String openingHours = (String) monumentObject.get("opening_hours");

            Monument monument1 = new Monument(name);
            monument1.setHopeningHours(openingHours);
            monument1.setAddress(address);
            monument1.setHistoric(historic);

            System.out.println(monument1.toString());

        }
    }

}

