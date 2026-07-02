class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result=new ArrayList<>();
        result.add(words[0]);
        for(int i=1;i<words.length;i++){
            char[] str1=words[i-1].toCharArray();
            char[] str2=words[i].toCharArray();
            
            Arrays.sort(str1);
            Arrays.sort(str2);

            if(!Arrays.equals(str1,str2)){
                    result.add(words[i]);
            }
        }return result;
        
    }
}