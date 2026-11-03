class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int totalSum=0;
        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum=totalSum+arr[i];
        }
        for(int j=0;j<arr.length;j++){
           int suffSum=totalSum-prefSum-arr[j];
            if(prefSum==suffSum){
                return j;
            }
            prefSum = prefSum+arr[j];
        }
        return -1;
    }
}