import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner (System.in);

         System.out.println("Digite o primeiro parametro : ");
         int paramentroUm = scanner.nextInt();

         System.out.println("Digite o segundo paramentro  : ");
         int parametroDois = scanner.nextInt();

         try {
            contar(paramentroUm, parametroDois);
         }
         catch (ParametrosInvalidosException e) {
            System.out.println("Mensagem de error: " + e.getMessage());
         }

         static void contar(int paramentroUm, int parametroDois ) throws ParametroInvalidosException {

            if (paramentroUm > parametroDois) {
                throw new ParametrosInvalidosException("O segundo tem que ser maior que o primeiro");
            }
            for (int i = paramentroUm; i <= parametroDois; i++) {
                System.out.println("Imprimindo o numero" + i);
            }

            class ParametroInvalidosException extends Exception {
                public ParametrosInvalidosException (String message) { super (message); }
            }
            
                
            }
         }
    }
}
