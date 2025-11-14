
public class ExVetores {

    public static void main(String[] args) {

        int[] a = {2, 3, 5, 7, 9, 1, 4, 6, 8, 0};
        
         
        for (int i = 0; i < a.length; i++) {
            int elementoAtu = a[i];
            
            System.out.println("Elemento A[" + i + "] = " + elementoAtu + ".");
            System.out.print("Relação de 0 até " + elementoAtu + ": ");

            
            for (int contador = 0; contador <= elementoAtu; contador++) {
                System.out.print(contador);
            
                if (contador < elementoAtu) {
                    System.out.print(", ");
                }
            }
            
            System.out.println("\n"); 
        }
    }
}
