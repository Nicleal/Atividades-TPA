import java.util.Scanner;

public class ExPeso {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idd, i;
		double alt,peso;
		for(i=1; i<=25; i++) {
			System.out.println("digite a idade da " + i);
			idd = ler.nextInt();
			System.out.println("digite a altura da " + i);
			alt = ler.nextDouble();
			System.out.println("digite o peso da " + i);
			peso = ler.nextDouble();
		}
	
		
		
	}
}
