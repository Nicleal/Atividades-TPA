import java.util.Scanner;

public class ExFatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("digite o numero que deseja saber o fatorial:");
		int n = ler.nextInt();
		int i = n - 1;
		int f = n;
		
		do {
			f = f * i;
			System.out.println(f);
			i--;
			
		}while (i>0);
		System.out.println(n + "!=" + f);
	
	}

}
