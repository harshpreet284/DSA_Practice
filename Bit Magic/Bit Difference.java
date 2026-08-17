class Solution {
    public static int countBitsFlip(int a, int b) {
        // code here
        int xorval = a^b;
        int n=xorval;
        int c=0;
        while(n>0){
           
            if((n&1)!=0){
                c++;
            }
            n=n>>1;
        }
        return c;
    }
}
