

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String cleaned = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = cleaned.split("\\s+");
        Set<String> bannedSet = new HashSet<>();
        for (String b:banned) {
            bannedSet.add(b);
        }
        Map<String,Integer> count = new HashMap<>();
        String result ="";
        int maxCount=0;
        for (String word:words) {
            if (word.isEmpty() || bannedSet.contains(word)){
                continue; 
            }
            count.put(word,count.getOrDefault(word,0)+1);
            if(count.get(word)> maxCount){
                maxCount=count.get(word);
                result=word;
            }
        }
        return result;
    }
}