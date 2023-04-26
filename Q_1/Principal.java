package Q_1;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
      
      
      System.out.print("Digite o primeiro número: ");
      int num1 = input.nextInt();
      System.out.print("Digite o segundo número: ");
      int num2 = input.nextInt();
      System.out.print("Digite o terceiro número: ");
      int num3 = input.nextInt();
      System.out.print("Digite o quarto número: ");
      int num4 = input.nextInt();
      
      
      int soma = num1 + num2 + num3 + num4;
      
    
      System.out.printf("A soma dos quatro números é %d", soma);
 input.close();
	}
}

