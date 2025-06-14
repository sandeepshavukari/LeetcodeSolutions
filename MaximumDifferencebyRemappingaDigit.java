public class MaximumDifferencebyRemappingaDigit {
    int[] toArr(int n) {
        String s = Integer.toString(n);
        int[] a = new int[s.length()];
        for (int i = 0; i < s.length(); i++) a[i] = s.charAt(i) - '0';
        return a;
    }

    public int minMaxDifference(int n) {
        int[] a = toArr(n);
        int[] mx = new int[a.length];
        int[] mn = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            mx[i] = a[i];
            mn[i] = a[i];
        }

        int x = -1;
        if (mx[0] != 9) x = mx[0];
        for (int d : mx) if (x == -1 && d != 9) x = d;
        for (int i = 0; i < mx.length; i++) if (mx[i] == x) mx[i] = 9;

        x = mn[0];
        for (int i = 0; i < mn.length; i++) if (mn[i] == x) mn[i] = 0;

        int hi = 0, lo = 0;
        for (int i : mx) hi = hi * 10 + i;
        for (int i : mn) lo = lo * 10 + i;
        return hi - lo;
    }
}
