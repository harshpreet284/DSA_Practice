
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int s=0;
        int e=0;
        int curr=0;
        ArrayList<Integer>ans= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            curr=curr+arr[i];
            if(curr>=target){
                e=i;
                while(curr>target && s<e){
                    curr=curr-arr[s];
                    ++s;
                }
                if(curr == target){
                    ans.add(s+1);
                    ans.add(e+1);
                    return ans;
                }
            }
        }
        ans.add(-1);
        return ans;
    }
}