class Solution {
    public static boolean isPowerofTwo(int n) {
        double ans =1;
        if(n==1){
            return true;
        }
        for(int i=1;i<=n/2;i++){
            ans= Math.pow(2,i);
            if(ans == n){
                return true;
            }
        }
        return false;
    }
}