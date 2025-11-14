import java.util.Scanner;
 
public class ExVetores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
 
        int[] A = new int[20];
        int[] B = new int[20];
        int pos = 0;
      
        System.out.println("Digite 20 números:");
        for (int i = 0; i < 20; i++) {
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 == 0) {
                B[pos] = A[i];
                pos++;
            }
        }
 
        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 != 0) {
                B[pos] = A[i];
                pos++;
            }
        }
 
        for (int i = 0; i < 20; i++) {
            System.out.print(B[i]);
        }
 
        ler.close();
    }
}
 
