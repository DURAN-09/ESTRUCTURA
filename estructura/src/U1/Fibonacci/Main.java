package U1.Fibonacci;

public class Main {

    public static void main(String[] args){
        int nNum=10;
        for(int i = 0;i<nNum;i++){
            System.out.println(fibonacci(i));
        }
    }

    static int fibonacci(int n){
        if ( n<= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
