
import java.util.Scanner;//importando a classe para ler dados.
public class CalculaArea {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double base,altura,area;
		System.out.println("Digite o valor da base");
		base= ler.nextDouble();
		System.out.println("Digite o valor da altura");
		altura=ler.nextDouble();
		area=(base*altura)/2;
		System.out.println("A area é:" + area);
				
		
		// TODO Auto-generated method stub

	}

}
