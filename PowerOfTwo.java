public class PowerOfTwo {
// 231.problems/power-of-two/
    public boolean isPowerOfTwo(int n) {
        if(n < 1) return false;
        if(n == 1) return true;
        while((n & 1) != 1){
            n >>= 1;
        }
        if(n > 1) return false;
        else return true;
    }
}
