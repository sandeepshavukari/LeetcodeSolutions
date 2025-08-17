import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortPermutation {
    public int sortPermutation(int[] a) {
        int b = a.length;
        int[] c = a.clone();
        Arrays.sort(c);
        if (Arrays.equals(a, c)) return 0;
        int d = b-1;
        for (int e=d;e>=0;e--) {
            UF f =new UF(b);
            for (int g=0;g<b;g++) {
                for (int h=g+1;h <b;h++) {
                    if ((a[g]&a[h])==e) {
                        f.u(g,h);
                    }
                }
            }
            boolean i =true;
            Map<Integer,List<Integer>> j =new HashMap<>();
            Map<Integer,List<Integer>> k =new HashMap<>();
            for (int l=0;l<b;l++) {
                int m=f.f(l);
                j.computeIfAbsent(m,n->new ArrayList<>()).add(a[l]);
                k.computeIfAbsent(m, n->new ArrayList<>()).add(c[l]);
            }
            for (int n:j.keySet()){
                List<Integer> o =j.get(n);
                List<Integer> p=k.get(n);
                Collections.sort(o);
                Collections.sort(p);
                if (!o.equals(p)) {
                    i = false;
                    break;
                }
            }
            if (i) return e;
        }
        return 0;
    }
}

class UF {
    int[] a,b;
    UF(int c) {
        a =new int[c];
        b =new int[c];
        for (int d=0;d<c;d++)a[d]=d;
    }
    int f(int e) {
        if (a[e]!=e)a[e]=f(a[e]);
        return a[e];
    }
    void u(int e, int f) {
        int g = this.f(e), h = this.f(f);
        if (g == h) return;
        if (b[g] < b[h]) a[g] = h;
        else if (b[h] < b[g]) a[h] = g;
        else {
            a[h] = g;
            b[g]++;
        }
    }
}
