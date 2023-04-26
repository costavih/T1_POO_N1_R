package Q_24;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
					
	   Scanner input = new Scanner(System.in);
        System.out.print("Digite a hora (formato HH.MM): ");
        double hora = input.nextDouble();
        
        int horas = (int) hora;
        int minutos = (int) ((hora - horas) * 100);
        
        int horaEmMinutos = horas * 60 + minutos;
        
        System.out.println("A hora digitada em minutos é: " + horaEmMinutos);
    }

		    }

	


