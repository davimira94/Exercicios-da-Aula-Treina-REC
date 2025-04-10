//Faça um programa que converta metros para centímetros (1m = 100cm).

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o valor em metros: ");
        double metros = input.nextDouble();

        // Processamento
        double centimetros = metros * 100;

        // Saída
        System.out.println(metros + " metros = " + centimetros + " centímetros");

        input.close();
    }
}
