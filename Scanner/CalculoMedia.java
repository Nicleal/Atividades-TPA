package exTPA2;
import java.util.Scanner;


public class CalculoMedia {
	public static void main (String[]args ) {
		Scanner ler = new Scanner(System.in);
		double nota1,nota2,nota3,nota4,media;
		System.out.println("digite a sua primeira nota");
		nota1= ler.nextDouble();
		System.out.println("digite a sua segunda nota");
		nota2= ler.nextDouble();
		System.out.println("digite a sua terceira nota");
		nota3= ler.nextDouble();
		System.out.println("digite a sua quarta nota");
		nota4= ler.nextDouble();
		media=(nota1+nota2+nota3+nota4)/4;
		System.out.println("sua media é:" +media);
		
		
		
	}

}
