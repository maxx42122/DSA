class Solution {
    public String sortVowels(String s) {
        char arr[]=s.toCharArray();
        List<Character> ls=new ArrayList<>();
        for(char c:arr){
            if(c=='A' || c=='E' ||c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i'|| c=='o' || c=='u'){
                ls.add(c);

            }
        }
      //  System.out.println(ls);
        Collections.sort(ls);
      
        // for(char ch:arr){
        //     System.out.println(ch);
        // }
        int k=0;
         for(int c=0;c<arr.length;c++){
            if(arr[c]=='A' || arr[c]=='E' ||arr[c]=='I' || arr[c]=='O' || arr[c]=='U' || arr[c]=='a' || arr[c]=='e' || arr[c]=='i' ||arr[c]=='o' || arr[c]=='u'){
              //  System.out.println(ls.get(k));
                arr[c]=ls.get(k++);
              


            }
        }
    
        return new String(arr);

        
    }
}