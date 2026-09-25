class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int t = arr[i];
                arr[i] = arr[count];
                arr[count] = t;
                count ++;
            }
        }
    }
}