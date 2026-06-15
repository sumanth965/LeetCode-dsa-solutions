class Solution {
    public int findClosest(int x, int y, int z) {
        int person_X = Math.abs(x-z);
        int person_Y = Math.abs(y-z);
        if(person_X < person_Y){
            return 1;
        }else if(person_X > person_Y){
            return 2;
        }else {
            return 0;
        }
    }
}