import java.util.Scanner;

public class SalarioSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? ");
        double valorHora = entrada.nextDouble();

        System.out.print("Quantas horas você trabalhou no mês? ");
        double horasTrabalhadas = entrada.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("Seu salário no mês é: R$ " + salario);

        entrada.close();
    }
}
