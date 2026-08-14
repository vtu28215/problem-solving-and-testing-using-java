import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        System.out.println(hasPath(adj, start, end) ? "YES" : "NO");
    }

    private static boolean hasPath(Map<Integer, List<Integer>> adj, int start, int end) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.add(start);
        visited.add(start);
        while (!q.isEmpty()) {
            int curr = q.poll();
            if (curr == end) return true;
            for (int neighbor : adj.getOrDefault(curr, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    q.add(neighbor);
                }
            }
        }
        return false;
    }
}