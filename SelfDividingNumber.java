import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
     public List<Integer> selfDividingNumbers(int l, int ri) {
        List<Integer> li= new ArrayList<>();
        // int n=l;
        for( int n=l;n<=ri;n++)
        {
            int a=n;
            while(a>=1)
            {
                int r=a%10;
                if(r==0||n%r!=0)
                break;
                a/=10;
            }
            if(a==0)
            li.add(n);
            // n++;
        }
        return li;
    }
}
