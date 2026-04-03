public class Funcionalidades {
    public static void ordenarPorNome(Aluno[] alunos, int qtd) {
        for (int i = 0; i < qtd - 1; i++) {
            for (int j = 0; j < qtd - i - 1; j++) {
                if (alunos[j].getNome().compareToIgnoreCase(alunos[j + 1].getNome()) > 0) {
                    Aluno temp = alunos[j];
                    alunos[j] = alunos[j + 1];
                    alunos[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenarPorRaDecrescente(Aluno[] alunos, int qtd) {
        for (int i = 0; i < qtd - 1; i++) {
            for (int j = 0; j < qtd - i - 1; j++) {
                if (alunos[j].getRa() < alunos[j + 1].getRa()) {
                    Aluno temp = alunos[j];
                    alunos[j] = alunos[j + 1];
                    alunos[j + 1] = temp;
                }
            }
        }
    }

    public static void listarTodos(Aluno[] alunos, int qtd) {
        for (int i = 0; i < qtd; i++) {
            System.out.println(alunos[i]);
        }
    }

    public static void listarAprovados(Aluno[] alunos, int qtd) {
        for (int i = 0; i < qtd; i++) {
            if (alunos[i].getResultado().equals("Aprovado")) {
                System.out.println(alunos[i]);
            }
        }
    }
}

