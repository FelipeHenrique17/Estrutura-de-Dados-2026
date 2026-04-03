public class Fatorial {
    // Implementação ITERATIVA
    public static long fatorial(int n){
        long res = 1;
        for(int i = n; i > 1; i--){
            res = res * i;
        }
        return res;
    }
    // Implementação RECURSIVA
    public static long fatorialRec(int n){
        if(n <= 1){
            return 1; //condição de saída
        }
        return n * fatorialRec(n - 1);
    }

    public static void main(String[] args){
        System.out.println("Fatorial de 5: " + fatorial(5));
        System.out.println("Fatorial (recurivo) de 5: " + fatorialRec(5));
    }
}