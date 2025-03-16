package ua.org.nmu.dmelnikov.lab_4.misc;

import com.google.gson.*;
import ua.org.nmu.dmelnikov.lab_4.model.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONManager {

    private static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(Human.class, new HumanTypeAdapter())  // Register custom TypeAdapter
            .create();

    public static void writeUniversityToFile(University university, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(university, writer);
            System.out.println("University has been written to JSON file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static University readUniversityFromFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}
