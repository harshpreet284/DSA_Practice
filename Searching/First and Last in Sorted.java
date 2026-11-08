class Solution {
    
    static int findFirst(int arr[], int x){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int first=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==x){
                e=mid-1;
                first=mid;
            }
            else if(arr[mid]>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return first;
    }
    
     static int findLast(int arr[], int x){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int last=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==x){
                s=mid+1;
                last=mid;
            }
            else if(arr[mid]>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return last;
    }
    
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first=findFirst(arr,x);
        int last=findLast(arr,x);
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(first);
        ans.add(last);
        return ans;
    }
}