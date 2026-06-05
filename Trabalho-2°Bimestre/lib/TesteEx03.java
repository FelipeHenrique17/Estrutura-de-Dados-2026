package lib;

public class TesteEx03 {
    public static void main(String[] args) {
        System.out.println("--- Teste Exercício 3: Deque com Capacidade Limitada ---");

        DequeEx03<Integer> cache = new DequeEx03<>(5);

        cache.insertBack(10);
        cache.insertBack(20);
        cache.insertBack(30);
        cache.insertBack(40);
        cache.insertBack(50);

        System.out.println("Deque cheio (5 elementos): " + cache.print());

        System.out.println("Tentando inserir o 6º elemento (deve estourar o erro)...");
        cache.insertBack(60);

    }
}