package lib;

public class TesteEx01 {
    public static void main(String[] args) {
        System.out.println("--- Teste Exercício 1: Fila com Contador de Operações ---");
        QueueEx01<String> fila = new QueueEx01<>();

        fila.enqueue("Documento_Diretoria.pdf");
        fila.enqueue("Relatorio_Financeiro.xlsx");
        fila.enqueue("Contrato_Final.docx");

        System.out.println("Fila de Impressão: " + fila.print());
        System.out.println("Imprimindo: " + fila.dequeue());
        System.out.println("Fila Atual: " + fila.print());

        System.out.println("Total de operações (Inserções + Remoções): " + fila.getOperationCount());
    }
}
