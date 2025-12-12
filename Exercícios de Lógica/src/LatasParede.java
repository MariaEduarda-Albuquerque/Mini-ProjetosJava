import java.util.Scanner;
public class LatasParede {
	public static void main (String[] args) {
    Scanner ler = new Scanner (System.in);
    double c, l, ap, al, ln;
    al = 3.8;

    System.out.println("Digite o comprimento da parede:");
    c = ler.nextDouble ();

    System.out.println("Digite a largura da parede:");
    l = ler.nextDouble ();

    ap=c*l;
    ln=ap/al;

    System.out.println("O número de latas necessárias ser: " +ln+ "");

    ler.close();
    }
}