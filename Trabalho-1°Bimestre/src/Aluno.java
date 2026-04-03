public class Aluno {
    private String nome, sexo, resultado;
    private int ra, idade;
    private double media;

    public Aluno(String nome, int ra, int idade, String sexo, double media) {
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
        this.sexo = sexo;
        this.media = media;
        this.resultado = calcularResultado();
    }

    private String calcularResultado() {
        return (media >= 6.0) ? "Aprovado" : "Reprovado";
    }

    public String getNome() { return nome; }
    public int getRa() { return ra; }
    public String getResultado() { return resultado; }

    @Override
    public String toString() {
        return nome + " | RA: " + ra + " | Idade: " + idade +
                " | Sexo: " + sexo + " | Média: " + media +
                " | " + resultado;
    }
}