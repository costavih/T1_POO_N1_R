package Q_18;
import java.util.Scanner;
public class Principal {
	  public static void main(String[] args) {												
	Scanner input = new Scanner(System.in);
     System.out.print("Digite o peso do saco de ração (em kg): ");
     double pesoRacao = input.nextDouble();
     System.out.print("Digite a quantidade de ração fornecida para cada gato (em gramas): ");
     int qtdRacaoGato = input.nextInt();
     
    
     double qtdRacaoDia = (2 * qtdRacaoGato) / 1000.0;
     
  
     double qtdRacaoTotal = qtdRacaoDia * 5;
     
    
     double qtdRacaoRestante = pesoRacao - qtdRacaoTotal;
     
   
     System.out.printf("Restarão %.2f kg de ração no saco após cinco dias.", qtdRacaoRestante);
 }
}
	

