import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String tag = sc.next();
            counts.put(tag, counts.getOrDefault(tag, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}