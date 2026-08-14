import java.util.Scanner;

abstract class Vehicle {
    abstract int calculateFare(int distance);
}

class Bike extends Vehicle {
    int calculateFare(int distance) { return distance * 5; }
}

class Auto extends Vehicle {
    int calculateFare(int distance) { return distance * 12; }
}

class Cab extends Vehicle {
    int calculateFare(int distance) { return distance * 12; }
}

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                String type = sc.next();
                int dist = sc.nextInt();
                Vehicle v;
                if (type.equalsIgnoreCase("Bike")) v = new Bike();
                else if (type.equalsIgnoreCase("Auto")) v = new Auto();
                else if (type.equalsIgnoreCase("Cab")) v = new Cab();
                else throw new Exception();
                System.out.println(v.calculateFare(dist));
            } catch (Exception e) {
                System.out.println("Invalid Booking");
            }
        }
    }
}