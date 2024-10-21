class IsIsomarphic {
    public boolean isIsomorphic(String s, String t) {
       
       int s_arr[]= new int [128];
       int t_arr[]= new int[128];

       for(int i=0;i<s.length();i++)
       {
        if(s_arr[s.charAt(i)] != t_arr[t.charAt(i)]) return false;
        else
        {
            s_arr[s.charAt(i)]=i+1;
            t_arr[t.charAt(i)]=i+1;
        }
       }
       return true;
    }
}
