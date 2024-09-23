public class Sqrt(x) {
    public int mySqrt(int x) {
        int k=1;
        if(x==0)
        return 0;
        
        for( long i=1;i<=x/2;i++){
            if(i*i == x){
                k=(int)i;
                break;
            }
            else if(i*i <x && (i+1)*(i+1) >x){
                k=(int)i;
                break;
            }
            
        }
        return k;
    }
}
