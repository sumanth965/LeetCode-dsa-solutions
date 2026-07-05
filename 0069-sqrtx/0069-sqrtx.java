class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x; // handles 0 and 1
        }
        
        long left = 1, right = x / 2;
        long ans = 1;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            
            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                ans = mid;      // mid could be the answer, keep searching right
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return (int) ans;
    }
}