public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new Queue();
        System.out.println(fila.print());

        //inserções na fila
        fila.enqueue("Alexandre");
        fila.enqueue("José");
        fila.enqueue("Maria");
        fila.enqueue("João");
        fila.enqueue("Joaquina");

        System.out.println(fila.print());

        //ver quem é o próximo a ser chamado
        String proximo = fila.peek();
        System.out.println("Próximo a ser chamado: " + proximo);

        //chamar o próximo (remoção da fila)
        String atendido = fila.dequeue();

        //atendimento
        System.out.println(atendido + ", favor comparecer a sala 02");

        //fila atual
        System.out.println(fila.print());
    }
}
