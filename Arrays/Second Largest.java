class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int largest= -1;
        int slargest = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        for(int j=0;j<n;j++){
            if((arr[j]>slargest) && (arr[j] != largest )){
                slargest = arr[j];
            }
        }
        if(slargest == largest){
            return -1;
        }
        return slargest;
    }
}