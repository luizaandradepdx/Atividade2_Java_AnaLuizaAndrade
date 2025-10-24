import java.util.Scanner;

public class SalarioComDescontos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? ");
        double valorHora = entrada.nextDouble();

        System.out.print("Quantas horas você trabalhou no mês? ");
        double horasTrabalhadas = entrada.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;

        System.out.println("\n--- Demonstrativo de Pagamento ---");
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto Imposto de Renda (11%): R$ " + impostoRenda);
        System.out.println("Desconto INSS (8%): R$ " + inss);
        System.out.println("Desconto Sindicato (5%): R$ " + sindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        entrada.close();
    }
}
