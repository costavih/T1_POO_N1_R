package Q_12;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        double base = input.nextDouble();

	        System.out.print("Digite o segundo número: ");
	        double expoente = input.nextDouble();

	        double resultado = Math.pow(base, expoente);
	        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
	        input.close();
	 }
	}

