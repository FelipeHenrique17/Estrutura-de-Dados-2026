public class Pilha3 {
    public static void main(String[] args){
        String frase = "Socorram-me, subi no ônibus em Marrocos";

        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < frase.length(); i++) {
            pilha.push(frase.charAt(i));
        }

        System.out.println(pilha.print());

        String reverso = "";
        while (!pilha.isEmpty()) {
            reverso += pilha.pop();
        }

        System.out.println(reverso);

        System.out.println("Original: " + frase);
        System.out.println("Invertida: " + reverso);
    }
}