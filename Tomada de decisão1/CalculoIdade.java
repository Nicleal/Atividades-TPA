package exTPA3;
import java.util.Scanner;

public class CalculoIdade {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		double anoNasc,anoAtual,idade;
		System.out.println("digite seu ano de nascimento:");
		anoNasc=ler.nextDouble();
		System.out.println("digite o ano atual:");
		anoAtual=ler.nextDouble();
		
		idade= (anoAtual-anoNasc);
		System.out.println("essa é sua idade:" +idade);
		
		if(idade>=18) {
			System.out.println("maior de idade!");
			
		}else {
			System.out.println("menor de idade!");
		}
		
	
		
	}

}
