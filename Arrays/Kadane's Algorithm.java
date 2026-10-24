class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int MaximumSum=arr[0];
        int CurrentSum=arr[0];
        for(int i=1;i<arr.length;i++){
            CurrentSum=Math.max(CurrentSum+arr[i],arr[i]);
            MaximumSum=Math.max(MaximumSum,CurrentSum);
        }
        return MaximumSum;
    }
}