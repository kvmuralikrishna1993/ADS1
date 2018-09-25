import java.util.Scanner;
class UF {
    private int[] id;     // access to component id (site indexed)
    private int count;    // number of components
    public UF(int N) {  // Initialize component id array.
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public int count() { 
        return count;
    }
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
    private int find(int p) {
        return id[p];
    }
    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);
        if (pID == qID) {
        return;   
        }
        System.out.println("Array"+"                         ");
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) {
                id[i] = qID;
                count--;   
            }
        System.out.print(id[i]+" ");
        }
        System.out.print("      "+"("+p+","+q+")");
        System.out.println();
    }
}
public class Solution {
    Solution() {
    }
    public static void main(String[] args) {
        String line = "10 9-0 3-4 5-8 7-2 2-1 5-7 0-3 4-2";
        String tokens[] =line.split(" ");
        UF uf = new UF(Integer.parseInt(tokens[0]));
        for (int i = 1; i < tokens.length; i++) {
            int p = Integer.parseInt(tokens[i].split("-")[0]);
            int q = Integer.parseInt(tokens[i].split("-")[1]);
            if (!uf.connected(p,q)) {
                uf.union(p,q);
            }
        }
    }
}
