import java.util.Scanner;

class GFG {
    
    static int sum(int n){
        if(n==0){
            return 0;
        }
        
        return sum(n-1)+n;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        System.out.print(sum(n));
    }
}