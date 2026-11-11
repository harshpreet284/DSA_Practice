class Solution {
    public int countOnes(int[] arr) {
        // code here
        int n=arr.length;
        int s=0;
        int e=n-1;
        int index=-1;
        int ans=0;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==1){
                index=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
         ans=index+1;
        return ans;
    }
}