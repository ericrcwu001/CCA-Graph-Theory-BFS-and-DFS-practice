import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphTraversal {

    public static int[] bfs(int[][] graph, int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] visited = new boolean[graph.length];
        int[] trace = new int[graph.length];
        q.add(start);
        int i = 0;

        while(!q.isEmpty()) {
            int temp = q.poll();
            if (visited[temp]) continue;
            trace[i] = temp;
            i++;
            visited[temp] = true;
            for (int j: graph[temp]) {
                if (!visited[j]) {
                    q.add(j);
                }
            }
        }
        return trace;
    }

    public static int[] dfs(int[][] graph, int start) {
        Stack<Integer> s = new Stack<Integer>();
        boolean[] visited = new boolean[graph.length];
        int[] trace = new int[graph.length];
        s.push(start);
        int i = 0;

        while(!s.empty()) {
            int temp = s.pop();
            if (visited[temp]) continue;
            trace[i] = temp;
            i++;
            visited[temp] = true;
            for (int j = graph[temp].length-1; j >= 0; --j) {
                int temp2 = graph[temp][j];
                if (!visited[temp2]) {
                    s.push(temp2);
                }
            }
        }

        return trace;
    }

}
