//Faça um programa que peça as 4 notas bimestrais de um aluno e imprima a média

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada
        System.out.print("Digite a primeira nota: ");
        float n1 = input.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float n2 = input.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float n3 = input.nextFloat();

        System.out.print("Digite a quarta nota: ");
        float n4 = input.nextFloat();

        // Processamento
        float media = (n1 + n2 + n3 + n4) / 4;

        // Saída
        System.out.println("A média é: " + media);

        input.close();
    }
}
