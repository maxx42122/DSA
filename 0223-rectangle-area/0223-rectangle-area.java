class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int area1=Math.abs(ax2-ax1)*(ay2-ay1);
        int area2=Math.abs(bx2-bx1)*(by2-by1);
        
     
       int br=Math.max(Math.min(ax2,bx2)-Math.max(ax1,bx1),0);
       int hr=Math.max(Math.min(ay2,by2)-Math.max(ay1,by1),0);
         int area3=br*hr;
        
        return area1+area2-area3;
        
    }
}