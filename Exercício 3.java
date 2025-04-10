//Faça um programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        // Processamento
        int soma = num1 + num2;

        // Saída
        System.out.println("A soma é: " + soma);

        input.close();
    }
}
