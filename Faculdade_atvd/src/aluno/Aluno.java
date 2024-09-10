package aluno;

public class Aluno {
    private String nome;
    private double nota1, nota2, nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularNotaFinal() {
        return nota1 + nota2 + nota3;
    }

    public void verificarAprovacao() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 70) {
            System.out.println("Aluno aprovado com " + notaFinal + " pontos.");
        } else {
            System.out.println("Aluno reprovado. Faltaram " + (70 - notaFinal) + " pontos.");
        }
    }
}