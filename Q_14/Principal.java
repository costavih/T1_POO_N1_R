package Q_14;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {	
	Scanner input = new Scanner(System.in);
      
     
      System.out.print("Digite o ano de nascimento: ");
      int anoNascimento = input.nextInt();
      System.out.print("Digite o ano atual: ");
      int anoAtual = input.nextInt();
      
     
      int idade = anoAtual - anoNascimento;
      
     
      int idadeEm2005 = 2005 - anoNascimento;
      
     
      System.out.printf("Idade: %d anos\n", idade);
      System.out.printf("Idade em 2005: %d anos", idadeEm2005);
  }
}
