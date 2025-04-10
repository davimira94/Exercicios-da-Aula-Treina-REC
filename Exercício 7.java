// Faça um programa que calcule a área de um quadrado, em seguida imprima o dobro desta área para o usuário. A área de um quadrado é dada por , onde𝐴𝑄 = 𝐿2 𝐿 é o comprimento do lado do quadrado.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o lado do quadrado: ");
        double lado = input.nextDouble();

        // Processamento
        double area = lado * lado;
        double dobro = area * 2;

        // Saída
        System.out.println("Área: " + area);
        System.out.println("Dobro da área: " + dobro);

        input.close();
    }
}
