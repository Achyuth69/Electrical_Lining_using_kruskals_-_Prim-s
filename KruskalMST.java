import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;
    Edge(int s, int d, int w) {
        src = s; dest = d; weight = w;
    }

    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}

public class KruskalMST {
    int V;

    KruskalMST(int v) {
        this.V = v;
    }

    int find(int[] parent, int i) {
        if (parent[i] != i)
            parent[i] = find(parent, parent[i]);
        return parent[i];
    }

    void union(int[] parent, int[] rank, int x, int y) {
        int xroot = find(parent, x);
        int yroot = find(parent, y);

        if (rank[xroot] < rank[yroot])
            parent[xroot] = yroot;
        else if (rank[xroot] > rank[yroot])
            parent[yroot] = xroot;
        else {
            parent[yroot] = xroot;
            rank[xroot]++;
        }
    }

    void kruskalMST(List<Edge> edges) {
        Collections.sort(edges);
        int[] parent = new int[V];
        int[] rank = new int[V];
        for (int i = 0; i < V; ++i) {
            parent[i] = i;
            rank[i] = 0;
        }

        int e = 0;
        int total = 0;
        System.out.println("Edges in MST:");

        for (Edge edge : edges) {
            if (e == V - 1)
                break;
            int x = find(parent, edge.src);
            int y = find(parent, edge.dest);
            if (x != y) {
                System.out.println("House " + edge.src + " - House " + edge.dest + " = " + edge.weight);
                total += edge.weight;
                union(parent, rank, x, y);
                e++;
            }
        }

        System.out.println("Minimum total wire length: " + total);
    }
}
