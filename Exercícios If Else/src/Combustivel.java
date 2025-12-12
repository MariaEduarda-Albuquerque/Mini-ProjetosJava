import java.util.Scanner;
public class Combustivel {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		Double t,dp,consumo;

		System.out.println("Digite a capacidade do tanque do carro: ");
		t = ler.nextDouble();

		System.out.println("Digite qual foi a distancia percorrida em km: ");
		dp = ler.nextDouble();

		consumo = (dp/t);

		System.out.println("O gasto medio do veiculo em km por litro foi de: " + consumo);

		if (consumo>10/1) {
			System.out.println("Carro econômico");
		}else {
			System.out.println("Carro não econômico");
		}

		ler.close();
	}
}
