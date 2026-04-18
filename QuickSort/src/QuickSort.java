import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    //metodo público que facilta a chamada: o usuário só passa o vetor
    public static void QuickSort(Comparable[]vetor){
        //inicia a recursao passando o primeiro(0) e o ultimo indice
        QuickSort(vetor, 0, vetor.length -1);
    }

    //metodo privado recursivo que define os limites de atuação
    private static void QuickSort(Comparable[]vetor, int inicio, int fim){
        //Caso base: se o início for menor que o fim, ainda há elementos para ordenar
        if(inicio < fim){
            //reorganiza o vetor e encontra a posição correta do pivô
            int pivo = particionar(vetor, inicio, fim);

            //ordena a sub-lista a esquerda do pivô (elementos menores)
            QuickSort(vetor, inicio, pivo - 1);
            //ordena a sub-lista a direita do pivõ (elementos maiores)
            QuickSort(vetor,pivo + 1, fim);
        }
    }

    //metodo privado que organiza os elementos em torno do pivô
    private static int particionar(Comparable[] vetor, int inicio, int fim){
        //escolha o último elemento como pivô (padrão)
        Comparable pivo = vetor[fim];
        //"i" rastreia a posição do último elemento menor que o pivô encontrado
        int i = inicio - 1;

        //"j" percorre o vetor do inÌcio até penúltimo elemento
        for(int j = inicio; j < fim; j++){
            //compara o elemento atual com o pivô
            //compareTo < 0 significa que vetor[j] é menor que pivô
            if(vetor[j].compareTo(pivo) < 0){
                i++; //avança o índice do "limite dos menores"
                trocar(vetor, i,j); //joga o elemento menor para esquerda
            }
        }

        trocar(vetor, i+1, fim);

        return i + 1;
    }

    private static void trocar(Comparable[] vetor, int i, int j){
        Comparable temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void main(String[] args) throws IOException {
        Integer[] nums = {77, 44, 22, 33, 99, 55, 88, 0, 66, 11};

        String[] nomesDesordenados = {"Maria", "João", "Ana", "Carlos", "Beatriz"};

        QuickSort(nums);
        System.out.println("Números ordenados: " + Arrays.toString(nums));

        QuickSort(nomesDesordenados);
        System.out.println("Nomes ordenados: " + Arrays.toString(nomesDesordenados));

        Path caminho = Path.of("data/nomes-desord.txt");
        List<String> lista = Files.readAllLines(caminho);
        String[] nomes = lista.toArray(new String[0]);
        QuickSort(nomes);
        for(String nome: nomes){
            System.out.println(nome);
        }
    }
}


