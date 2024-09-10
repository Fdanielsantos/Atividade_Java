package funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Salário do funcionário: ");
        double salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salario);
        funcionario.calcularAumento();

        sc.close();
    }
}