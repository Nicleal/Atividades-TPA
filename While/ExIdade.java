import java.util.Scanner;

public class ExIdade {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int idd,menor=0,maior=0;
		int i=1;
		
		while (i<=5) {
			System.out.println("Digite a idade da " + i + "ª pessoa: ");
			idd = in.nextInt();
			if (idd <=18) {
				menor += 1;
			} else {
				maior += 1;
			} i++;
		} 
		System.out.println("tem " + menor + " menor de idade, e tem " + maior + " adultos");
	}
}
