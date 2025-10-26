class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs==null || strs.length==0)return new ArrayList();

       Map <String,List>map=new HashMap<>();
       for(String s:strs){
        String key=getstring(s);
        System.out.println(key);
        if(map.containsKey(key)){
            map.get(key).add(s);

        }else{
            List <String>list=new ArrayList();
            list.add(s);
            map.put(key,list);
        }
       }
       return new ArrayList(map.values());

              
    }

    private String getstring(String s){

        int arr[]=new int [26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
            
        }
        StringBuilder sb=new StringBuilder();
        char c='a';
        for(int i=0;i<26;i++){
            sb.append(c);
            sb.append(arr[i]);
            c++;
        }
        return sb.toString();
    }
}