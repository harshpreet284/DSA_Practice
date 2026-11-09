class Solution {
    
    static int findFirst(int arr[], int target){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==target){
                ans=mid;
                e=mid-1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    
     static int findLast(int arr[], int target){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==target){
                ans=mid;
                s=mid+1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    
    
    
    int countFreq(int[] arr, int target) {
        // code here
        int first=findFirst(arr,target);
        int last=findLast(arr,target);
        if(first==-1 && last==-1){
            return 0;
        }
        int totalOccurance=last-first+1;
        return totalOccurance;
    }
}