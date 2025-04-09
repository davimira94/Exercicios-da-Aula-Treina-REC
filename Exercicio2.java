//Faça um programa que peça um número e então mostre a mensagem:
//O número informado foi [número]

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Entrada
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        // Saída
        System.out.println("O número informado foi " + numero);

        input.close();
    }
}
