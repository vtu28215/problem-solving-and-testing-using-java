import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        List<Reading> readings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            readings.add(new Reading(sc.next(), sc.nextDouble()));
        }

        readings.stream()
                .filter(r -> r.temp > 50)
                .collect(Collectors.groupingBy(r -> r.id, Collectors.averagingDouble(r -> r.temp)))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }

    static class Reading {
        String id;
        double temp;
        Reading(String id, double temp) {
            this.id = id;
            this.temp = temp;
        }
    }
}