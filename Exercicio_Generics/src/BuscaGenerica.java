public class BuscaGenerica {
    // Busca Sequencial Genérica
    public static <T extends Comparable<T>> int buscaSequencial(T[] vetor, T valorBusca) {
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i].compareTo(valorBusca) == 0) {
                return i;
            }
        }
        return -1;
    }
    // Busca Binária Genérica
    public static <T extends Comparable<T>> int buscaBinaria(T[] vetor, T valorBusca) {
        int inicio = 0;
        int fim = vetor.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = vetor[meio].compareTo(valorBusca);
            if (comparacao == 0) {
                return meio;
            }
            if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Vetor de Inteiros
        Integer[] nums = {0, 11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        System.out.println("Busca Sequencial Inteiros:");
        System.out.println("77 -> " + buscaSequencial(nums, 77));
        System.out.println("81 -> " + buscaSequencial(nums, 81));

        System.out.println();

        System.out.println("Busca Binária Inteiros:");
        System.out.println("77 -> " + buscaBinaria(nums, 77));
        System.out.println("81 -> " + buscaBinaria(nums, 81));

        System.out.println("\n----------------------\n");

        // Vetor de Strings
        String[] nomes = {"ADAMASTOR", "ALEXANDRE", "ANA", "CARLOS", "DANIEL",
                "FERNANDO", "GUSTAVO", "JERDERSON", "MARIA", "ZULEIDE"};

        System.out.println("Busca Sequencial Strings:");
        System.out.println("ALEXANDRE -> " + buscaSequencial(nomes, "ALEXANDRE"));
        System.out.println("ZULEIDE -> " + buscaSequencial(nomes, "ZULEIDE"));
        System.out.println("INSTAGRAMILDA -> " + buscaSequencial(nomes, "INSTAGRAMILDA"));

        System.out.println();

        System.out.println("Busca Binária Strings:");
        System.out.println("ALEXANDRE -> " + buscaBinaria(nomes, "ALEXANDRE"));
        System.out.println("ZULEIDE -> " + buscaBinaria(nomes, "ZULEIDE"));
        System.out.println("INSTAGRAMILDA -> " + buscaBinaria(nomes, "INSTAGRAMILDA"));

    }
}