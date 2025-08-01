package graphs;

// graph Adjacency List representation in Java

import java.util.*;

class Graph {

    int totalNodes;
    List<Integer> graph[];

    Graph(int totalNodes) {
        this.totalNodes = totalNodes;
        graph = new ArrayList[totalNodes];

        for (int node = 0; node < totalNodes; node++) {
            graph[node] = new ArrayList<>();
        }
    }
    public void addEdge(int source,int destination){
        graph[source].add(destination);
        graph[destination].add(source);
    }
    public static void main(String[] args) {

        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);

        printGraph(graph.graph);

    }

    // Print the graph
    static void printGraph(List<Integer>[] am) {

        for (int i = 0; i < am.length; i++) {
            System.out.print(i + "--> ");
            for (int j = 0; j < am[i].size(); j++) {
                System.out.print(am[i].get(j) + " ");
            }
            System.out.println();
        }

    }
}
