import java.util.Scanner;
 
public class ExVetores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
 
        int A[], B[], C[];
        int i, j, contC;
        contC = 0;
        A = new int[10];
        B = new int[10];
        C = new int[10];
 
        for(i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "° valor do vetor A:");
            A[i] = ler.nextInt();
        }
 
 
        for(i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "° valor do vetor B:");
            B[i] = ler.nextInt();
        }
 
        
 
        for(i = 0; i < 10; i++) {
            boolean existe = false;
 
           
            for(j = 0; j < 10; j++) {
                if (A[i] == B[j]) {
                    existe = true;
                    break;
                }
            }

            if(!existe) {
                C[contC] = A[i];
                contC++;
            }
        }
 
        System.out.println("\nVetor C (elementos de A que não estão em B):");
        if(contC == 0) {
            System.out.println("Nenhum elemento — todos estavam em B.");
        } else {
            for(i = 0; i < contC; i++) {
                System.out.print(C[i] + " ");
            }
        }
 
        ler.close();
    }
}
