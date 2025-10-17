import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 10;
		int a[], b[],i ;
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0; i<TAM; i ++) {
			System.out.println("digite o " +(i+1)+ "° valor do vetor A:");
			a[i]= ler.nextInt();
		}
		System.out.print("B = [ ");
		for (i= 9;i<TAM && i > -1; i--) {
			b[i]= a[i];
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
	}

}
