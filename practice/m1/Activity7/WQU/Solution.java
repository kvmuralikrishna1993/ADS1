import java.util.Scanner;
class WQU {
    private int[] id;
    private int[] sz;    // access to component id (site indexed)
    private int count;    // number of components
    public WQU(int N) {  // Initialize component id array.
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }
    public int count() { 
        return count;
    }
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }
            return p;
    }
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if   (sz[pRoot] < sz[qRoot]) {
            id[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        } else {
            id[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
        count--;
        System.out.println("Array"+"                         "+"Size");
        for (int i = 0; i < id.length; i++) {  
            System.out.print(id[i]+" ");
        }
        System.out.print("           ");
        for (int i = 0; i < id.length; i++) {  
            System.out.print(sz[i]+" ");
        }

        System.out.print("     "+"("+p+","+q+")");
        System.out.println();
    }
}
public class Solution {
    Solution() {
    }
    public static void main(String[] args) {
        String line = "10 9-0 3-4 5-8 7-2 2-1 5-7 0-3 4-2";
        String tokens[] =line.split(" ");
        WQU uf = new WQU(Integer.parseInt(tokens[0]));
        for (int i = 1; i < tokens.length; i++) {
            int p = Integer.parseInt(tokens[i].split("-")[0]);
            int q = Integer.parseInt(tokens[i].split("-")[1]);
            if (!uf.connected(p,q)) {
                uf.union(p,q);
            }
        }
    }
}
