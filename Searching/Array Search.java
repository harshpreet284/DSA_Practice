class Solution {
    public int search(int arr[], int x) {
        // code here
        // int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                // pos=i;
                // return pos;
                return i;
            }
        }
        return -1;
    }
}