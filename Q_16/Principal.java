package Q_16;
import java.util.Scanner; 
public class Principal {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
    
    System.out.print("Digite o número de horas trabalhadas: ");
    int horasTrabalhadas = input.nextInt();
    System.out.print("Digite o valor do salário mínimo: ");
    double salarioMinimo = input.nextDouble();

    double valorHora = salarioMinimo / 2;
    double salarioBruto = horasTrabalhadas * valorHora;
    double imposto = salarioBruto * 0.03;
    
  
    double salarioLiquido = salarioBruto - imposto;
    
    
    System.out.printf("Salário líquido a receber: R$ %.2f", salarioLiquido);
    }
}