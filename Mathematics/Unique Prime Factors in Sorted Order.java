class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        if(n%2 == 0){
            res.add(2);
            while (n%2 == 0){
                n = n/2;
            }
        }
        for(int i=3; i*i<=n; i= i+2){
            if(n%i == 0){
                res.add(i);
                while(n%i==0){
                    n=n/i;
                }
            }
        }
        if(n>2){
            res.add(n);
        }
        return res;
    }
}