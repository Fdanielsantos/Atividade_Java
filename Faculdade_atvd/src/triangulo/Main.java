package triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os lados do triângulo X:");
        double xA = sc.nextDouble();
        double xB = sc.nextDouble();
        double xC = sc.nextDouble();
        Triangulo x = new Triangulo(xA, xB, xC);

        System.out.println("Digite os lados do triângulo Y:");
        double yA = sc.nextDouble();
        double yB = sc.nextDouble();
        double yC = sc.nextDouble();
        Triangulo y = new Triangulo(yA, yB, yC);

        double areaX = x.calcularArea();
        double areaY = y.calcularArea();

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Triângulo X tem a maior área.");
        } else {
            System.out.println("Triângulo Y tem a maior área.");
        }

        sc.close();
    }
}