
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Hashtable;

public class MapCollection {
    public static void main(String[] args) {
        // Map<String, Integer> students = new HashMap<String, Integer>();
        Map<String, Integer> students = new Hashtable<String, Integer>(); // synchronized
        students.put("Adesh", 50);
        students.put("Nilesh", 60);
        students.put("Suresh", 56);
        students.put("Vishal", 10);
        students.put("Abhi", 80);
        students.put("Adesh", 100);

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.get("Adesh"));

        Set<Map.Entry<String, Integer>> entrySet = students.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
