package listaCaderno;
import java.util.Scanner;
public class ConversorDia {
	
	public static void main(String[] args) {
		Scanner Ler = new Scanner (System.in);
		int d, meses, anos;

		System.out.println("Digite os dias:");
		d = Ler.nextInt();

		meses = d/30;
		anos = d/365;

		System.out.println("A quantidade de meses equivalente é de " + meses);
		System.out.println("A quantida de anos equivalente é de " + anos);

		Ler.close();
	}
}