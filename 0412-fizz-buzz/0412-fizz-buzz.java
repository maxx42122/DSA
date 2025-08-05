class Solution {
    public List<String> fizzBuzz(int n) {
    List<String> list = new ArrayList();

        String str1="Fizz";
        String str2="Buzz";
       String str3="FizzBuzz";

        for(int i=1;i<=n;i++){

             if(i%3==0 && i%5==0){
                list.add(str3);
            }else  if(i%3==0){
                list.add(str1);
            }else if(i%5==0){
                list.add(str2);
            }else{
                list.add( Integer.toString(i));
            }
        }
        return list;
                
            }
}