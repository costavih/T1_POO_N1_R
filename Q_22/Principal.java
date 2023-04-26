package Q_22;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o valor do salário mínimo: ");
	        double salarioMinimo = input.nextDouble();

	        System.out.print("Digite a quantidade de quilowatts consumida: ");
	        double consumo = input.nextDouble();

	        double valorKw = salarioMinimo / 5;
	        double valorConta = consumo * valorKw;
	        double desconto = valorConta * 0.15;
	        double valorFinal = valorConta - desconto;

	        System.out.printf("Valor de cada quilowatt: R$ %.2f\n", valorKw);
	        System.out.printf("Valor a ser pago pela energia elétrica: R$ %.2f\n", valorConta);
	        System.out.printf("Valor do desconto de 15%%: R$ %.2f\n", desconto);
	        System.out.printf("Valor final a ser pago: R$ %.2f\n", valorFinal);
	        input.close();
	 }
	}

