import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GraphTraversalPracticeTest {

    private int[][] graph;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        graph = new int[][]{
                {1,5,7},
                {0,5},
                {3,6},
                {2},
                {6},
                {0,1},
                {2,4,7},
                {0,6}
        };
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        graph = null;
    }

    @org.junit.jupiter.api.Test
    void bfs() {
        int[] expectedPath = {0,1,5,7,6,2,4,3};
        int[] observedPath = GraphTraversal.bfs(graph, 0);
        int index = 0;
        for (int node: observedPath) {
            assertTrue(node == expectedPath[index++]);
        }
    }

    @org.junit.jupiter.api.Test
    void dfs() {
        int[] expectedPath = {0,1,5,7,6,2,3,4};
        int[] observedPath = GraphTraversal.dfs(graph, 0);
        int index = 0;
        for (int node: observedPath) {
            assertTrue(node == expectedPath[index++]);
        }
    }
}