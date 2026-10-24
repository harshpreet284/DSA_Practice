class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int c=1;
        int maxc=0;
        for(int i=1;i<arr.length;i++)
        {
            if((arr[i]^arr[i-1])==0){
                c++;
            }
            else{
                maxc=Math.max(maxc,c);
                c=1;
            }
        }
        return Math.max(maxc,c);
    }
}