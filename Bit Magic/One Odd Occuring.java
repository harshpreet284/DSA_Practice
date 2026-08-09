class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int n = arr.length;
        int res = 0;
        for(int i =0;i<n;i++){
            res =res ^ arr[i];
        }
        return res;
    }
}