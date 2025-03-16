package ua.org.nmu.dmelnikov.lab_4.misc;

import com.google.gson.*;
import ua.org.nmu.dmelnikov.lab_4.model.*;

import java.lang.reflect.Type;

public class HumanTypeAdapter implements JsonDeserializer<Human>, JsonSerializer<Human> {
    @Override
    public Human deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();

        // Deserialize based on the class type (e.g., Rector, Dean, etc.)
        if (jsonObject.has("firstName") && jsonObject.has("lastName")) {
            String firstName = jsonObject.get("firstName").getAsString();
            String lastName = jsonObject.get("lastName").getAsString();
            String middleName = jsonObject.get("middleName").getAsString();
            Sex sex = Sex.valueOf(jsonObject.get("sex").getAsString());

            // Check if the "type" field is present and match it to a specific subclass
            if (jsonObject.has("type") && jsonObject.get("type").getAsString().equals("rector")) {
                return new Rector(firstName, lastName, middleName, sex);
            } else if (jsonObject.has("type") && jsonObject.get("type").getAsString().equals("dean")) {
                return new Dean(firstName, lastName, middleName, sex);
            } else if (jsonObject.has("type") && jsonObject.get("type").getAsString().equals("departmentHead")) {
                return new DepartmentHead(firstName, lastName, middleName, sex);
            }
        }

        return null;  // Default return if no match
    }

    @Override
    public JsonElement serialize(Human src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("firstName", src.getFirstName());
        jsonObject.addProperty("lastName", src.getLastName());
        jsonObject.addProperty("middleName", src.getMiddleName());
        jsonObject.addProperty("sex", src.getSex().toString());

        switch (src) {
            case Rector rector -> jsonObject.addProperty("type", "rector");
            case Dean dean -> jsonObject.addProperty("type", "dean");
            case DepartmentHead departmentHead -> jsonObject.addProperty("type", "departmentHead");
            default -> {
            }
        }

        return jsonObject;
    }
}
