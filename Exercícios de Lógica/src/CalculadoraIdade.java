package listaCaderno;
import java.util.Scanner;

public class CalculadoraIdade {
	public static void main (String args [] ) {
		Scanner ler = new Scanner(System.in);
		double an, aa, idade;
		
		System.out.println("Digite o ano de nascimento do usuário:");
		an=ler.nextDouble();
	
		System.out.print("Digite o ano atual:");
		aa=ler.nextDouble();
		idade = (aa-an);
		
		System.out.println("A idade será: "+ idade);
		ler.close();
	}
}
