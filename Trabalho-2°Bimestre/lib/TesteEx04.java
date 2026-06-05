package lib;

public class TesteEx04 {
    public static void main(String[] args) {
        System.out.println("--- Teste Exercício 4: Pilha com Capacidade Máxima ---");

        StackEx04<String> historicoUndo = new StackEx04<>(5);

        historicoUndo.push("Digitar texto inicial");
        historicoUndo.push("Aplicar Negrito");
        historicoUndo.push("Mudar de cor");
        historicoUndo.push("Colar imagem.png");
        historicoUndo.push("Apagar parágrafo");

        System.out.println("Pilha de Undo cheia (5 ações): " + historicoUndo.print());

        System.out.println("Tentando empilhar a 6ª ação (deve estourar o erro de limite)...");
        historicoUndo.push("Inserir tabela");
    }
}
