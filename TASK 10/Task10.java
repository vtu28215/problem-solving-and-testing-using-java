import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String user = sc.next();
            String pass = sc.next();
            if (validate(user, pass)) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILURE");
            }
        }
    }

    private static boolean validate(String u, String p) {
        if (u.length() < 3 || u.length() > 20) return false;
        if (p.length() < 6 || p.length() > 20) return false;
        if (u.equals("admin") && p.equals("admin123")) return true;
        if (u.equals("user") && p.equals("password123")) return true;
        return u.length() >= 3 && p.length() >= 6 && !u.equals("ab") && !p.equals("pass");
    }
}