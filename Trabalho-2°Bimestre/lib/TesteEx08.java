package lib;

public class TesteEx08 {
    public static void main(String[] args) {
        System.out.println("--- Teste Exercício 8: Contagem de Ocorrências ---");
        LinkedListEx08<Integer> listaNumeros = new LinkedListEx08<>();

        listaNumeros.insertTail(10);
        listaNumeros.insertTail(20);
        listaNumeros.insertTail(10);
        listaNumeros.insertTail(30);
        listaNumeros.insertTail(10);
        listaNumeros.insertTail(20);

        System.out.println("Lista armazenada: " + listaNumeros.print());
        System.out.println("-------------------------------------------------------");

        int qtdDez = listaNumeros.countOccurrences(10);
        int qtdVinte = listaNumeros.countOccurrences(20);
        int qtdTrinta = listaNumeros.countOccurrences(30);
        int qtdCinquenta = listaNumeros.countOccurrences(50);

        System.out.println("Quantidade de vezes que o número 10 aparece: " + qtdDez);
        System.out.println("Quantidade de vezes que o número 20 aparece: " + qtdVinte);
        System.out.println("Quantidade de vezes que o número 30 aparece: " + qtdTrinta);
        System.out.println("Quantidade de vezes que o número 50 aparece: " + qtdCinquenta);
    }
}
