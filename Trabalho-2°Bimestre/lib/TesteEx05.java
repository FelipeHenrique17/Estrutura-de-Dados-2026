package lib;

public class TesteEx05 {
    public static void main(String[] args) {
        System.out.println("--- Teste Exercício 5: Deque com Elementos Únicos ---");

        DequeEx05<String> carrinho = new DequeEx05<>();

        carrinho.insertBack("Notebook Gamer");
        carrinho.insertBack("Mouse Sem Fio");
        carrinho.insertFront("Monitor 29 polegadas");

        System.out.println("Carrinho atual: " + carrinho.print());

        System.out.println("Tentando adicionar 'Mouse Sem Fio' novamente (deve estourar o erro)...");
        carrinho.insertBack("Mouse Sem Fio");
    }
}