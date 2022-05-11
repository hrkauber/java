
public class AllPairShortestPath {
	 // Initialize the INF value and the number of vertices for the graph input
    static int INF = 9999999, vertices = 4;

    void floyds(int[][] graph) {
        int[][] distance = new int[vertices][vertices];
        int i, j, k;

        /* Initializing the solution matrix the same as the original input graph matrix.
           Or we can say the initial values of shortest distances are based on shortest paths
           considering no intermediate vertex. */
        for (i = 0; i < vertices; i++)
            for (j = 0; j < vertices; j++)
                distance[i][j] = graph[i][j];

        /* Add all vertices one by one to the set of intermediate vertices.
          ---> Before start of an iteration,
               we have shortest
               distances between all pairs
               of vertices such that
               the shortest distances consider
               only the vertices in
               set {0, 1, 2, .. k-1} as
               intermediate vertices.
          ----> After the end of an iteration,
                vertex no. k is added
                to the set of intermediate
                vertices and the set
                becomes {0, 1, 2, .. k} */
        for (k = 0; k < vertices; k++)
        {
            // Select all vertices as source one by one
            for (i = 0; i < vertices; i++)
            {
                // Select all vertices as destination for the above picked source
                for (j = 0; j < vertices; j++)
                {
                    // If vertex k is on the shortest path from i to j, then update the value of distance[i][j]
                    if (distance[i][k] + distance[k][j] < distance[i][j])
                        distance[i][j] = distance[i][k] + distance[k][j];
                }
            }
        }

        // Print the shortest distance matrix
        printSolution(distance);
    }

    void printSolution(int[][] dist) {
        System.out.println("Shortest distances between every pair of vertices");
        for (int i=0; i<vertices; ++i)
        {
            for (int j=0; j<vertices; ++j)
            {
                if (dist[i][j]==INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j]+"   ");
            }
            System.out.println();
        }
    }

    // The main driver program to test above function
    public static void main (String[] args)
    {
        // 4x4 weighted graph input

        int[][] graph = {
                {0, 5, 11, 10},
                {2, 0, 3, 13},
                {2, 5, 0, 1},
                {-1, -2, -5, 0}
        };

        AllPairShortestPath floydTest = new AllPairShortestPath();

        // Print the solution
        floydTest.floyds(graph);
    }

}
