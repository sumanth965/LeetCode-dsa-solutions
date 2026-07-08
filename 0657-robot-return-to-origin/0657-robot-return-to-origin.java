class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        char ch[]=moves.toCharArray();
        for(int i=0;i<moves.length();i++){
            switch(ch[i]){
                case 'U':y++;
                         break;
                case 'D':y--;
                         break;
                case 'L':x--;
                         break;
                case 'R':x++;
                         break;
            }

        }return x==0 && y==0;
    }
}