class Solution {
    int maxIndexDiff(int[] arr) {
        // code here
        int n=arr.length;
        int Lmin[] = new int [n];
        int Rmax[] = new int [n];
        
        Lmin[0] = arr[0];
        for(int i=1;i<n;i++){
            Lmin[i]= Math.min(Lmin[i-1],arr[i]);
        }
        Rmax[n-1] = arr[n-1];
        for(int j=n-2;j>=0;j--){
            Rmax[j] = Math.max(Rmax[j+1],arr[j]);
        }
        int ans=0;
        int i=0;
        int j=0;
        while(i<n && j<n){
            if(Lmin[i]<=Rmax[j]){
                ans = Math.max(ans,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}