import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long[] salaries = new long[n];
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextLong();
        }
        Arrays.stream(salaries)
              .map(s -> (long)(s * 1.1))
              .forEach(s -> System.out.print(s + " "));
    }
}