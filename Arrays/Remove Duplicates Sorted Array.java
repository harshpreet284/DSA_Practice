class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                ans.add(arr[j]);
                arr[i]=arr[j];
            }
        }
        return ans;
    }
}