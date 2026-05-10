import java.util.ArrayList;

public class Pilha1 {
    public static void main(String[] args){
        String frase = "Socorram-me, subi no ônibus em Marrocos";

        ArrayList<Character> vetor = new ArrayList<>();

        //percorre a frase e coloca cada uma das letras dentro da lista
        for (int i = 0; i < frase.length(); i++){
            vetor.add(frase.charAt(i));
        }
        System.out.println(vetor);

        //descaracterizando a pilha
        vetor.add(0, 'X');
        vetor.add(11, 'W');
        vetor.remove(23);

        System.out.println(vetor);
    }
}
