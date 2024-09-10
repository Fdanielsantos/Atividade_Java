package funcionario;

public class Funcionario {
   
	private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void calcularAumento() {
        double salarioAntigo = salario;
        if (salario <= 1000) {
            salario *= 1.15;
        } else if (salario <= 1500) {
            salario *= 1.10;
        } else if (salario <= 2000) {
            salario *= 1.05;
        }
        System.out.println("Salário antigo: R$" + salarioAntigo + ", Salário novo: R$" + salario);
    }
}
