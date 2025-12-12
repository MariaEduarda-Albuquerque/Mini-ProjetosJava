import java.util.Scanner;
public class CalculadoraRodizio {
  public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int n;

	System.out.println("Digite o último número da placa do veículo:");
	n = ler.nextInt();

	switch(n) {
	case 1:
	case 2:
		System.out.println("Segunda-feira");
		break;
	case 3:
	case 4:
		System.out.println("Ter�a-feira");
		break;
	case 5:
	case 6:
		System.out.println("Quarta-feira");
		break;
	case 7:
	case 8:
		System.out.println("Quinta-feira");
		break;
	case 9:
	case 0:
		System.out.println("Sexta-feira");
		break;
	default:
		System.out.println("Número invalído");
	}
}
}
