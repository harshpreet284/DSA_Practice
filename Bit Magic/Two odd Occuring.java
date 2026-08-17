class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        // code here
        int n= arr.length;
        int xorval=0;
        for(int i=0;i<n;i++){
            xorval = xorval^arr[i];
        }
        int num1=0,num2=0;
        int RSB= xorval & -xorval;
        for(int i=0;i<n;i++){
            int num = arr[i];
            if((RSB & num)==0){
                num1= num1^num;
            }
            else{
                num2=num2^num;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(num1>num2){
            ans.add(num1);
            ans.add(num2);
        }
        else{
            ans.add(num2);
            ans.add(num1);
        }
        return ans;
    }
}
