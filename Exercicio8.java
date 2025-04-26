import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada
        System.out.print("Quanto você ganha por hora? ");
        double valorHora = input.nextDouble();

        System.out.print("Quantas horas você trabalhou no mês? ");
        int horas = input.nextInt();

        // Processamento
        double salario = valorHora * horas;

        // Saída
        System.out.println("Seu salário é: R$ " + salario);

        input.close();
    }
}
