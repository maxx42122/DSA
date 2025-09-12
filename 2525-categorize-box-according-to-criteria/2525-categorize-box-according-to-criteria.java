class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {

            boolean b=bulky( length,  width, height);
            boolean h=heavy(mass);
            System.out.println(b);
            System.out.println(h);

            if(b && h){
                return "Both";
            }else if(!b && !h){
                 return "Neither";

            }else if(b&& !h){
                 return "Bulky";
            }else if(!b && h){
                     return "Heavy";
            }
            return null;
   
    }


         boolean bulky(int length, int width, int height){
            long v=(long)length*width*height;
             

            if( length>=10000 || width>=10000 ||  height>=10000 ||v>=1000000000 ){
                return true;
            }
            return false;

        }
        boolean heavy(int mass){
        
            if(  mass>=100  ){
                return true;
            }
            return false;

        }
        
}