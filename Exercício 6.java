//Faça um programa que peça o raio de um círculo, calcule e imprima sua área. A área de um círculo é dada por , onde é o raio do círculo. Considere𝐴𝐶 = 2 × π × 𝑅2 𝑅,  π = 3,14

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o raio do círculo: ");
        double raio = input.nextDouble();

        // Processamento
        double area = 3.14 * raio * raio;

        // Saída
        System.out.println("A área do círculo é: " + area);

        input.close();
    }
}
