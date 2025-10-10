package U1.SumaRecursiva;

public class Main {
    public static void main(String[] args){
        int num=4;
        if(num<0) return;
        for (int i = num;i>=0;i--){
            System.out.println(i);
        }
        System.out.println("la suma es "+Suma(num));
    }

    static int Suma(int num){
        if(num<=1) return num;
        return num + Suma(num-1);
    }
}
