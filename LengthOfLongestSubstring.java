public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        char[] ar=new char[n];
        ar=s.toCharArray();
        int ml=0;
        for(int j=0;j<n;j++){
            int l=0;
            String sub="";
            for(int i=j;i<n;i++){
                if(sub.isEmpty()){
                    sub=sub+ar[i];
                    l++;
                }
                else if (!sub.contains(String.valueOf(ar[i]))){
                    sub=sub+ar[i];
                    l++;
                }
                else
                break;
            }
            if(ml<l)
            ml=l;
        }
        return ml;
    }
}
