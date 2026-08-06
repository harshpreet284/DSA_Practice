import java.util.*;

public class Solution {
    
    static void isPrime(int n){
        if(n==1){
            System.out.print("False");
            return;
        }
        if(n==2 || n==3){
            System.out.print("True");
            return;
        }
        if(n%2==0 || n%3==0){
            System.out.print("False");
            return;
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                System.out.print("False");
                return;
            }
        }
        System.out.print("True");
        return;
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        isPrime(n);
    }
}