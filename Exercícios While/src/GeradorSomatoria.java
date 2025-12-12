import java.util.Scanner;
public class GeradorSomatoria {
	public static void main (String [] args) {
		int i = 1;
		int r = 0;

		while (i<=100) {
			r += i;
			i++;
			System.out.println("A somatória de 1 a 100 é: " + r);
		}
	}
}
