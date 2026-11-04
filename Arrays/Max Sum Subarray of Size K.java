class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum = windowSum + arr[i];
        }
        int maxSum=windowSum;
        for(int j=k;j<arr.length;j++){
            windowSum= windowSum+arr[j]-arr[j-k];
            maxSum= Math.max(windowSum,maxSum);
        }
        return maxSum;
    }
}