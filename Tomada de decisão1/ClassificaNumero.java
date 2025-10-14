package exTPA3;
import java.util.Scanner;

public class ClassificaNumero {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		double n;
		
		System.out.println("digite o numero que você deseja saber a classificação:");
		n= ler.nextDouble();
		
		if(n==0) {
			System.out.println("seu numero é neutro!");
		}else if (n<=-1) {
			System.out.println("seu numero é negativo!");
		}else {
			System.out.println("seu numero é positivo");
		}
		
		
		
		
	}

}
