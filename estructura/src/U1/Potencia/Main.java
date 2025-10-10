package U1.Potencia;

public class Main {
    public static void main(String[] args){
        int num=3,pot=2;
        System.out.println(Potencia(num,pot));
    }
    static int Potencia(int num,int pot){
        if(pot==0)return 1;
        return num * Potencia(num,pot-1);
    }
}
