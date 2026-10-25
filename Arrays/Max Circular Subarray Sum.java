class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int maxSum=arr[0];
        int currMaxSum=0;
        int minSum=arr[0];
        int currMinSum=0;
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            
            currMaxSum= Math.max(currMaxSum+arr[i],arr[i]);
            maxSum = Math.max(maxSum,currMaxSum);
            
            currMinSum = Math.min(currMinSum+arr[i],arr[i]);
            minSum = Math.min(minSum,currMinSum);
            
            totalSum = totalSum+arr[i];
        }
        int normalSum=maxSum;
         int CircularSum = totalSum-minSum;
        if(minSum==totalSum){
            return normalSum;
        }
        return Math.max(normalSum,CircularSum);
    }
}