import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long balance = 0;
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            long amount = sc.nextLong();
            if (op.equalsIgnoreCase("Deposit")) {
                balance += amount;
            } else if (op.equalsIgnoreCase("Withdraw")) {
                balance -= amount;
            }
        }
        System.out.println(balance);
    }
}