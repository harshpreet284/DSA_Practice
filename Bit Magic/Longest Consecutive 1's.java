class Solution {
    public static int maxConsecutiveOnes(int n) {
        // code here
        int c=0;
        while(n!=0){
            n=(n&(n<<1));
            c++;
        }
        return c;
        
    }
}
