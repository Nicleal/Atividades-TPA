import java.util.Scanner;

public class ExMes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int m;
		
		System.out.println("informe o numero do mês que deseja saber a quantidade de dias");
		m = ler.nextInt();
		switch (m) {
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("esse mês possui 31 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("esse mês possui 30 dias ");
			break;
		case 2:
			System.out.println("esse mês possui 28 dias");
			break;
		default:
			System.out.println("não existe um mês que corresponde a esse numero");
		}

	}

}
