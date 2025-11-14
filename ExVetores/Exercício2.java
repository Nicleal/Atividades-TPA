import java.util.Scanner;

public class ExVetores {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		final int TAM=5;

		int a[], i, j;

		a=new int[TAM];

		for(i=0; i<TAM; i++) {

		  System.out.println("Digite o "+(i+1)+" valor do Vetor A ");

		  a[i]=ler.nextInt();

		}
 
		for(i=0; i<TAM; i++) {

			System.out.println("\nTabuada do" +a[i]+ ":");

			for(j=1; j<=10; j++) {

			 System.out.println(a[i] + "x" + j + "=" + (a[i] * j));

		}

	}

		ler.close();

}

}
 
