package listaCaderno;
import java.util.Scanner;

public class CalculadoraIpva {
	public static void main (String arg[]) {
      Scanner ler = new Scanner(System.in);
      double ipva,v;

      System.out.println("Digite o valor do seu veiculo:");
      v= ler.nextDouble();

      ipva= v/100*4;
      System.out.println("Seu ipva é de:" + ipva);
        
      ler.close();
      }    
}
