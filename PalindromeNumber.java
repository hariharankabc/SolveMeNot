class Solution {
//9.problems/palindrome-number/
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y = 0, temp = x;
        while(x!=0){
            y = (y*10) + (x%10);
            x = x/10;
        }
        if(y==temp)
            return true;
        return false;
    }
}
