package computerscience.algorithms.datastructures.graphs.order;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;

/**
 * @author Eduardo
 */
public class DepthFirstOrderPractice {
    private boolean[] marked;
    private int[] pre;
    private int[] post;
    private Queue<Integer> preorder;
    private Queue<Integer> postorder;
    private int preCounter;
    private int postCounter;

    public DepthFirstOrderPractice(Digraph G){
        pre = new int[G.V()];
        post = new int[G.V()];
        postorder = new Queue<>();
        preorder = new Queue<>();
        marked = new boolean[G.V()];
        for(int v = 0; v < G.V(); v++){
            if (!marked[v]){
                dfs(G, v);
            }
        }
    }

    private void dfs(Digraph G, int v){
        marked[v] = true;
        pre[v] = preCounter++;
        preorder.enqueue(v);
        for(int w : G.adj(v)){
            if(!marked[w]){
                dfs(G, w);
            }
        }
        postorder.enqueue(v);
        post[v] = postCounter++;
    }

    public int pre(int v){
        validateVertex(v);
        return pre[v];
    }

    public int post(int v){
        validateVertex(v);
        return post[v];
    }

    public Iterable<Integer> post(){
        return postorder;
    }

    public Iterable<Integer> pre(){
        return preorder;
    }

    public Iterable<Integer> reversePost(){
        Stack<Integer> reverse = new Stack<>();
        for (int v : postorder){
            reverse.push(v);
        }
        return reverse;
    }

    private void validateVertex(int v) {
        int V = marked.length;
        if (v < 0 || v >= V) {
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V - 1));
        }
    }
}
