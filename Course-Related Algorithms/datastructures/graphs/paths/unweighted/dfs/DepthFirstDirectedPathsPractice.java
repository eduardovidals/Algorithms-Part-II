package computerscience.algorithms.datastructures.graphs.paths.unweighted.dfs;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.Stack;

/**
 * @author Eduardo
 */
public class DepthFirstDirectedPathsPractice {

    private boolean[] marked;
    private int[] edgeTo;
    private final int s;

    public DepthFirstDirectedPathsPractice(Digraph G, int s){
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        validateVertex(s);
        dfs(G, s);
    }

    public void dfs(Digraph G, int v){
        marked[v] = true;
        for (int w : G.adj(v)){
            if(!marked[w]){
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    public boolean hasPathTo(int v){
        validateVertex(v);
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v){
        validateVertex(v);
        if (!hasPathTo(v)){
            return null;
        }

        Stack<Integer> path = new Stack<>();
        for (int x = v; x != s; x = edgeTo[x]){
            path.push(x);
        }
        path.push(s);
        return path;
    }

    public void validateVertex(int v){
        int V = marked.length;
        if (v < 0 || v >= V){
            throw new IllegalArgumentException();
        }
    }
}
