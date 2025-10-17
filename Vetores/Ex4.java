import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 10;
		int a[], b,i;
		b = 0;
		a = new int[TAM];
		
		for (i=0; i<TAM; i ++) {
			System.out.println("digite o " +(i+1)+ "° valor do vetor A:");
			a[i]= ler.nextInt();
			
			b += a[i];// b recebe a, até que o laço pare
			
		}
		
		//apresentação da média
		System.out.println("Média dos valores: [" + b/TAM + "]");

	}

}
