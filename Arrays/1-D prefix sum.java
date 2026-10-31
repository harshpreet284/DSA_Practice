class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        int sum=0;
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            ans.add(sum);
        }
        return ans;
    }
}