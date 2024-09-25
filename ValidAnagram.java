import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char c[]= s.toCharArray();
        char u[]=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(u);
        return Arrays.equals(c,u);
    }
} 
}
