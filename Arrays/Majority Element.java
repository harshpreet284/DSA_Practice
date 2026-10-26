class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n=arr.length;
        int count =0;
        int candidate =-1;
        for(int i=0;i<n;i++){
            if(arr[i]==candidate){
                count ++;
            }
            else if(count == 0){
                candidate=arr[i];
                count =1;
            }
            else{
                count--;
            }
        }
        count =0;
        for(int i=0;i<n;i++){
            if(arr[i]==candidate){
                count++;
            }
        }
        if(count>n/2){
            return candidate;
        }
        else{
            return -1;
        }
    }
}