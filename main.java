import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of houses (nodes):");
        int V = sc.nextInt();

        int[][] graph = new int[V][V];
        System.out.println("Enter adjacency matrix (0 if no direct wire):");
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                graph[i][j] = sc.nextInt();

        System.out.println("\n--- Prim's Algorithm ---");
        PrimMST prim = new PrimMST(V);
        prim.primMST(graph);

        System.out.println("\n--- Kruskal's Algorithm ---");
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < V; i++)
            for (int j = i + 1; j < V; j++)
                if (graph[i][j] != 0)
                    edges.add(new Edge(i, j, graph[i][j]));

        KruskalMST kruskal = new KruskalMST(V);
        kruskal.kruskalMST(edges);
    }
}
