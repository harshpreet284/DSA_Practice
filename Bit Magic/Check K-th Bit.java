class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        int val = n>>k;
        if((val&1)!=0){
            return true;
        }
        else{
        return false;
    }
    }
}