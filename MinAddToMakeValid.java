public class MinAddToMakeValid{
  public int minAddToMakeValid(String s) {
        int opb = 0;
        int clb = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                opb++;
            } else {
                if (opb > 0) {
                    opb--;
                } else {
                    clb++;
                }
            }
        }
          return opb + clb;
    }
}
