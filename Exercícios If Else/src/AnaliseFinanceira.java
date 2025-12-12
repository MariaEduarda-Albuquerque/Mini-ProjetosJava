import java.util.Scanner;
public class AnaliseFinanceira {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		double s, d, sobra;

		System.out.println("Digite o salário:");
		s = ler.nextDouble();

		System.out.println("Digite o valor de suas divídas:");
		d = ler.nextDouble();

		sobra = (s-d);

		if (sobra<0) {
				System.out.println("Falta" + sobra);
		} else  {
			System.out.println("Sobra" + sobra + "do salário.");
		}

		ler.close();
	}
}