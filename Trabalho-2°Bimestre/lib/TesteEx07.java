package lib;

public class TesteEx07 {
    public static void main(String[] args) {
        System.out.println("--- Teste Exercício 7: Reversão de Lista Encadeada (In Loco) ---");

        DoublyLinkedListEx07<String> listaCarros = new DoublyLinkedListEx07<>();

        listaCarros.insertTail("Fusca");
        listaCarros.insertTail("Opala");
        listaCarros.insertTail("Chevette");
        listaCarros.insertTail("Maverick");

        System.out.println("Antes de inverter: " + listaCarros.print());
        System.out.println("-------------------------------------------------------");

        System.out.println("Invertendo a lista...");
        listaCarros.reverse();
        System.out.println("-------------------------------------------------------");

        System.out.println("Depois de inverter: " + listaCarros.print());
    }
}
