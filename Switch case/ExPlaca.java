import java.util.Scanner;

public class ExPlaca {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int p;
		
		System.out.println ("digite o ultimo digito da placa do seu carro ");
		p = ler.nextInt();
		switch (p) {
		
		case 1:
		case 2:
			System.out.println("você não pode circular de segunda-feira");
			break;
		case 3:
		case 4:
			System.out.println("você não pode circular de terça-feira");
			break;
		case 5:
		case 6:
			System.out.println("você não pode circular de quarta-feira");
			break;
		case 7:
		case 8:
			System.out.println("você não pode circular de quinta-feira");
			break;
		case 9:
		case 0:
			System.out.println("você não pode circular de sexta-feira");
			break;
		default:
				System.out.println("numero de placa inválido");
		
		}

	}

}
