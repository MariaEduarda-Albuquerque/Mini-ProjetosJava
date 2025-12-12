package tomadadeDecis�o2;
import java.util.Scanner;
public class NomeIdade {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		String nome, nomevelho, nomenovo;
		int id, idadenovo, idadevelho;

		System.out.println("Digite o nome do primeiro usuário: ");
		nome = ler.next();

		System.out.println("Digite a idade do primeiro usuário: ");
		id = ler.nextInt();

		nomevelho= nome;
		idadevelho= id;

		nomenovo= nome;
		idadenovo= id;
		
		System.out.println("Digite o nome do segundo usuário: ");
		nome = ler.next();

		System.out.println("Digite a idade do segundo usuário: ");
		id = ler.nextInt();

		if (id>idadevelho) {
			nomevelho= nome;
			idadevelho= id;
		}else {
			nomenovo= nome;
			idadenovo= id;
		}

		 System.out.println("Digite o nome do terceiro usuário: ");
		 nome = ler.next();

		 System.out.println("Digite a idade do terceiro usuário :");
		 id = ler.nextInt();

	     if (id>idadevelho){
		  nomevelho= nome;
		  idadevelho= id;
		}else if (id<idadenovo) {
			nomenovo= nome;
			idadenovo= id;
		}

	    System.out.println("Digite o nome do quarto usuário: ");
		nome = ler.next();

		System.out.println("Digite a idade do quarto usuário: ");
		id = ler.nextInt();   

		if (id>idadevelho){
		  nomevelho= nome;
	      idadevelho= id;
		}else if (id<idadenovo) {
			  nomenovo= nome;
			  idadenovo= id;
	    }

		 System.out.println("Digite o nome do quinto usuário: ");
		 nome = ler.next();

		 System.out.println("Digite a idade do quinto usuário: ");
		 id = ler.nextInt();   

		 if (id>idadevelho){
			  nomevelho= nome;
		      idadevelho= id;
		}else {
			nomenovo= nome;
			idadenovo= id;
		}

		 System.out.println("O usuário mais velho é: " + nomevelho + ".");
		 System.out.println("Sua idade é: " + idadevelho + "Anos.");
		 
		 System.out.println("O usuário mais novo é: " + nomenovo + ".");
		 System.out.println("Sua idade é: " + idadenovo + "Anos.");

		 ler.close();
	}
}