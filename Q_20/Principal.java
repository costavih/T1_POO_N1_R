package Q_20;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        System.out.print("Digite a medida do ângulo (em graus): ");
        double angulo = input.nextDouble();
        System.out.print("Digite a altura da parede (em metros): ");
        double alturaParede = input.nextDouble();
        
       
        double anguloRad = Math.toRadians(angulo);
        
       
        double medidaEscada = alturaParede / Math.tan(anguloRad);
        
       
        System.out.printf("A medida da escada é %.2f metros", medidaEscada);	
        input.close();
    }
}

