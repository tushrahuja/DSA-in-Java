class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        int rev = 0;
        while(x > 0){
            int last = x % 10;
            rev = rev * 10 + last;
            x /= 10;
        }
        if(rev == copy){
            return true;
        }
        return false;
    }
}