class Solution {
    public boolean checkRecord(String s) {
        int Count_A=0;
        int Count_L=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'){
                Count_A++;
                Count_L=0;
            }
            else if(ch=='L'){
                Count_L++;
            }else{
                Count_L=0;
            }
            if(Count_A>=2){
                return false;
            }else if(Count_L>=3){
                 return false;
            }
        }return true;
        
    }
}