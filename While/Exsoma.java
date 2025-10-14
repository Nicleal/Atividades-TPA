import java.util.Scanner;

public class Exsoma {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i = 1;
		int soma = 0;
		
		while (i<=100){
			soma += i;
			System.out.println(soma);
			i++;
		}
	}
	
}
