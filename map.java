import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<Integer, String> dataMap = new HashMap<>();

        String name = "Pushpanjali";
        int hashCode = name.hashCode();

        // Key => hashCode
        dataMap.put(hashCode, name);
        String outputName = dataMap.get(hashCode);
        System.out.println("Name: " + outputName);
    }
}
