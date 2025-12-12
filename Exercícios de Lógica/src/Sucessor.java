package listaCaderno;
import java.util.Scanner;
  public class Sucessor {
  public static void main (String arg[]) {
     Scanner ler= new Scanner (System.in);
     int v, antecessor, sucessor;

     System.out.println("Digite o número: ");
     v = ler.nextInt();

     antecessor = v-1;
     sucessor = v+1;

     System.out.println("O sucessor do seu nÚmero é: " + sucessor);
     System.out.println("O antecessor do seu número é: " + antecessor);

     ler.close();
    } 
}
  