import java.util.*;

public class ExTabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=1;
		int t, r;
		System.out.println("Digito o número da tabuada que você precisa:");
		t = in.nextInt();
	
		while(i<=10) {
			r = (t*i);
			System.out.println(t +"x"+ i +"="+r);
			i++;
	  }
	
   }
	
}
