class Solution {
    public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
        // code here
        int n=arr.length;
        int prefsumarr[]=new int [n];
        prefsumarr[0]=arr[0];
        for(int i=1;i<n;i++){
            prefsumarr[i]=prefsumarr[i-1]+arr[i];
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int q=0;q<queries.length;q++){
            int L=queries[q][0];
            int R=queries[q][1];
            if(L==0){
                 ans.add(prefsumarr[R]);
            }
            else{
                int sum=prefsumarr[R]-prefsumarr[L-1];
                 ans.add(sum);
            }
        }
        return ans;
    }
}