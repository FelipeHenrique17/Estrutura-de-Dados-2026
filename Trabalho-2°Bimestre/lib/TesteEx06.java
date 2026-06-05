package lib;

public class TesteEx06 {
    public static void main(String[] args) {
        System.out.println("--- Teste Exercício 6: Histórico de Remoções na Lista Encadeada ---");

        LinkedListEx06<String> lista = new LinkedListEx06<>();

        lista.insertTail("Fazer exercícios");
        lista.insertTail("Revisar");
        lista.insertTail("Descansar");
        lista.insertHead("Estudar");

        System.out.println("Lista após inserções: " + lista.print());
        System.out.println("--------------------------------------------------");

        System.out.println("Removendo do início: " + lista.removeHead());
        System.out.println("Removendo do fim: " + lista.removeTail());

        System.out.println("--------------------------------------------------");
        System.out.println("Lista atual restante: " + lista.print());

        System.out.println("Histórico final de elementos excluídos: " + lista.printHistory());
    }
}
