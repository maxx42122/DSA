class Solution {
    public boolean isAnagram(String s, String t) {
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String s1=new String(arr1);
        String s2=new String(arr2);
        System.out.println(s1);
        System.out.println(s2);

        if(s1.compareTo(s2)==0){
          
            return true;
        }
        return false;
    }
}