package aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        double nota1 = lerNota(sc, "Nota do 1º trimestre (0-30): ", 30);
        double nota2 = lerNota(sc, "Nota do 2º trimestre (0-35): ", 35);
        double nota3 = lerNota(sc, "Nota do 3º trimestre (0-35): ", 35);

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
        aluno.verificarAprovacao();

        sc.close();
    }

    public static double lerNota(Scanner sc, String msg, double max) {
        double nota;
        do {
            System.out.print(msg);
            nota = sc.nextDouble();
        } while (nota < 0 || nota > max);
        return nota;
    }
}
