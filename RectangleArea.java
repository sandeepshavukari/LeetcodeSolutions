public class RectangleArea {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int ar= (ax2-ax1)*(ay2-ay1);
        int ar1= (bx2-bx1)*(by2-by1);
        int olpx1=Math.max(ax1,bx1);
        int olpy1=Math.max(ay1,by1);
        int olpx2=Math.min(ax2,bx2);
        int olpy2=Math.min(ay2,by2);
        int olp=0;
        if(olpx2>olpx1&&olpy2>olpy1)
        olp=(olpx2-olpx1)*(olpy2-olpy1);
        olp=ar+ar1-olp;
        return olp;
    }
}