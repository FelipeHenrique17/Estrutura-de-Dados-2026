package lib;

import java.util.ArrayList;

public class TesteEx10 {
    public static void main(String[] args) {
        System.out.println("--- Teste Exercício 10: Transformação de Lista Encadeada em ArrayList ---");
        LinkedListEx10<String> listaEncadeada = new LinkedListEx10<>();

        listaEncadeada.insertTail("Java");
        listaEncadeada.insertTail("Python");
        listaEncadeada.insertTail("C++");
        listaEncadeada.insertTail("JavaScript");

        System.out.println("Lista Encadeada original: " + listaEncadeada.print());
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Convertendo a estrutura para ArrayList nativo...");
        ArrayList<String> arrayResultante = listaEncadeada.toArrayList();
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("ArrayList resultante impresso: " + arrayResultante);
    }
}
