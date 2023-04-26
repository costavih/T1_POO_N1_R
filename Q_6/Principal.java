package Q_6;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	        System.out.print("Digite o salário-base do funcionário: ");
	        double salarioBase = input.nextDouble();
	        
	        double gratificacao = salarioBase * 0.05;
	        double imposto = salarioBase * 0.07;
	        double salarioLiquido = salarioBase + gratificacao - imposto;
	        
	        System.out.printf("O salário a receber é: R$ %.2f", salarioLiquido);
	    }
	}	

