import java.util.Scanner;

public class ExPotencia {
	public static void main (String[] args) {
		
		Scanner ler = new Scanner (System.in);
		System.out.println("informe a base:");
		int b = ler.nextInt();
		System.out.println("informe o expoente:");
		int e = ler.nextInt();
		int i = e;
		int p = b;
		
		do {
			p= p*b;
			System.out.println(p);
			i--;
			
			
			
		}while(i > 1 );
	}

}
