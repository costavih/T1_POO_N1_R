	package Q_19;
	import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a altura de cada degrau em metros: ");
        double alturaDegrau = input.nextDouble();

        System.out.print("Digite a altura que deseja alcançar em metros: ");
        double alturaObjetivo = input.nextDouble();

        int numDegraus = (int) Math.ceil(alturaObjetivo / alturaDegrau);
        System.out.println("Você precisará subir " + numDegraus + " degraus.");
        input.close();
	}
}

