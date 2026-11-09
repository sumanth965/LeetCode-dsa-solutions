class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String words:strs){
            char[] ch=words.toCharArray();
            Arrays.sort(ch);
            String sortedWord=new String(ch);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(words);
        }return new ArrayList<>(map.values());
    }
}