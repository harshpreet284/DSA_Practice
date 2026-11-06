class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            if(arr[start]%2==0 && arr[end]%2!=0){
                start++;
                end--;
            }
            else if(arr[start]%2!=0 && arr[end]%2==0){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            else if(arr[start]%2==0){
                start++;
            }
            else{
                end--;
            }
        }
        
        Arrays.sort(arr,0,start);
        Arrays.sort(arr,start,n);
    }
}