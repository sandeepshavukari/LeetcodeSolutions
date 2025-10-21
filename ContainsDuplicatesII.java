public class ContainsDuplicatesII {
    public boolean containsNearbyDuplicate(int[] ar, int k) {
        // for(int i=0;i<ar.length-1;i++)
        // {
        //     for(int j=i+1;j<ar.length;j++)
        //     {
        //         if((ar[i]==ar[j]&&Math.abs(i-j)<=k)){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        
        HashSet<Integer> h= new HashSet<>();
        for(int i=0;i<ar.length;i++)
        {
            if(h.contains(ar[i]))
            return true;
            h.add(ar[i]);
            if(h.size()>k)
            h.remove(ar[i-k]);   
        }
        return false;
    }
}
