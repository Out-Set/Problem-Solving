import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// BFS of graph

public class P13 {
    public static void main(String[] args) {
        
    }

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs = new ArrayList<Integer>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        vis[0] = true;
        
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
        
        
            for(Integer it: adj.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        
        return bfs;        
    }
}
