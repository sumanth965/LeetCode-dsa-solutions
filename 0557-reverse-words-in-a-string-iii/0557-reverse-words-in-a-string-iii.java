class Solution {
    public String reverseWords(String s) {
      String str[]=s.split(" "); 
      String result[]=new String[str.length]; 
      for(int i=0;i<str.length;i++){
        String str2=str[i];
        String rev=new StringBuilder(str2).reverse().toString();
        result[i]=rev;
      }
      String ans=String.join(" ",result);
      return ans;
    }
}