package exTPA2;
import java.util.Scanner;

public class CalculoSalario {
	public static void main (String[]args ) {
		Scanner ler = new Scanner(System.in);
		double valorhora,aulasdada,p,salariobruto,salarioliquido,desconto;
		
		System.out.println("digite o valor que você ganha por hora:");
		valorhora= ler.nextDouble();
		
		System.out.println("digite quantas aulas vc deu:");
		aulasdada= ler.nextDouble();
		
		System.out.println("digite o valor do percentual do inss");
		p= ler.nextDouble();
		
		salariobruto= (valorhora*aulasdada);
		
		desconto= ((salariobruto/100)*p);
		
		salarioliquido= (salariobruto-desconto);
		
		System.out.println("esse é o seu salario após o desconto:" +salarioliquido );
		
		
	}

}
