package lib;

public class TesteEx09 {
    public static void main(String[] args) {
        System.out.println("--- Teste Exercício 9: Remoção de Todas as Ocorrências ---");
        LinkedListEx09<Integer> lista = new LinkedListEx09<>();

        lista.insertTail(99);
        lista.insertTail(10);
        lista.insertTail(99);
        lista.insertTail(20);
        lista.insertTail(30);
        lista.insertTail(99);
        lista.insertTail(40);
        lista.insertTail(99);

        System.out.println("Lista antes da remoção: " + lista.print());
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Executando removeAll(99) para varrer as ocorrências...");
        lista.removeAll(99);
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Lista após a remoção:  " + lista.print());
    }
}
