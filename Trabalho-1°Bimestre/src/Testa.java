import java.util.Scanner;

public class Testa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[100];
        int qtd = 0;
        int opcao = 0;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Alunos");
            System.out.println("2 - Relatório por Nome (Crescente)");
            System.out.println("3 - Relatório por RA (Decrescente)");
            System.out.println("4 - Relatório de Aprovados");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");

            if (!sc.hasNextInt()) {
                System.out.println("Digite apenas números!");
                sc.nextLine();
                continue;
            }

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    if (qtd >= alunos.length) {
                        System.out.println("Limite atingido!");
                        break;
                    }

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("RA: ");
                    int ra = sc.nextInt();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Sexo: ");
                    String sexo = sc.nextLine();

                    System.out.print("Média: ");
                    double media = sc.nextDouble();
                    sc.nextLine();

                    alunos[qtd++] = new Aluno(nome, ra, idade, sexo, media);
                    System.out.println("Aluno cadastrado!");
                    break;

                case 2:
                    if (qtd == 0) {
                        System.out.println("Nenhum aluno cadastrado!");
                        break;
                    }

                    Funcionalidades.ordenarPorNome(alunos, qtd);
                    Funcionalidades.listarTodos(alunos, qtd);
                    break;

                case 3:
                    if (qtd == 0) {
                        System.out.println("Nenhum aluno cadastrado!");
                        break;
                    }

                    Funcionalidades.ordenarPorRaDecrescente(alunos, qtd);
                    Funcionalidades.listarTodos(alunos, qtd);
                    break;

                case 4:
                    if (qtd == 0) {
                        System.out.println("Nenhum aluno cadastrado!");
                        break;
                    }

                    Funcionalidades.ordenarPorNome(alunos, qtd);
                    Funcionalidades.listarAprovados(alunos, qtd);
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        sc.close();
    }
}
