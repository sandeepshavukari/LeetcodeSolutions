public class WaterandJugProblem {
    public boolean canMeasureWater(int x, int y, int target) {
        if(x+y <target) return false;
        int k=gcd(x,y);
        if(target%k==0) return true;
        return false;
    }
    public int gcd(int a,int b){
         if(b==0) return a;
        return gcd(b,a%b);
    }
}