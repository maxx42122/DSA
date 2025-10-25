class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null)return "";
        
        String pref=strs[0];
        // String s="lma";
        // String t="lmx";
        // System.out.println(s.indexOf(t));


        for(int i=1;i<strs.length;i++){

            while(strs[i].indexOf(pref)!=0){
                pref=pref.substring(0,pref.length()-1);

                if(pref.isEmpty())return "";
            }
        }
        return pref;

        
    }
}