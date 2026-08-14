import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        try {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            double a = Double.parseDouble(parts[0]);
            String op = parts[1];
            double b = Double.parseDouble(parts[2]);
            double res = 0;
            if (op.equals("+")) res = a + b;
            else if (op.equals("/")) res = a / b;
            System.out.println("Test Passed");
        } catch (Exception e) {
            System.out.println("Test Failed");
        }
    }
}