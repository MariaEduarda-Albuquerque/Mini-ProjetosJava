package listaCaderno; 
import java.util.Scanner;
public class PercentualAluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, m, h,qm,qh;

		System.out.println("Digite o total de aluno na sala:");
		a = ler.nextDouble();

		System.out.println("Digite o total de mulheres na sala:");
		m = ler.nextDouble();

		System.out.println("Digite o total de homens na sala:");
        h = ler.nextDouble();

        qm = m/a*100;
        qh = h/a*100;

        System.out.println("A porcentagem de homens é de " + qh);
        System.out.println("A porcentagem de mulheres é de " + qm);
        ler.close();
	}
}
