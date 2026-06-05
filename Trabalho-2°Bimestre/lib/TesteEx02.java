package lib;

public class TesteEx02 {
    public static void main(String[] args) {
        System.out.println("--- Teste Exercício 2: Pilha com Histórico de Remoções ---");
        StackEx02<String> abas = new StackEx02<>();

        abas.push("home.html");
        abas.push("produtos.html");
        abas.push("carrinho.html");
        System.out.println("Pilha de navegação: " + abas.print());

        System.out.println("Usuário clicou em Voltar: " + abas.pop());
        System.out.println("Usuário clicou em Voltar: " + abas.pop());

        System.out.println("Pilha atual: " + abas.print());
        System.out.println("Histórico de páginas fechadas: " + abas.getHistory());
    }
}
