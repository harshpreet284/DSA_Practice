class Solution {
    static int sumOfDigits(int n) {
        if(n==0){
            return 0;
        }
        int r=n%10;
        return r + sumOfDigits(n/10);
    }
}