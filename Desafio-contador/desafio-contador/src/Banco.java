import java.util.Scanner;

public class Banco {
     public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
          System.out.println("Menu: ");\
          System.out.println("1.Depositar: ");
          System.out.println("2.Sacar: ");
          System.out.println("3.Consultar saldo: ");
          System.out.println("0.Encerrar. ");
          System.out.println("Escolha uma opcao: ");

        int opcao = scanner.nextInt();

          switch (opcao) {
            case 1: //depositado
              System.out.println("Informe o valor a depositar: ");
              double valorDeposito = scanner.nextDouble();
              saldo += valorDeposito;
              System.out.println("Deposito realizado com sucesso! ");
              }
              break;
                case 2: //saque
              System.out.println("Informe o valor a sacar: ");
              double valorSaque = scanner.nextDouble();
              if (valorSaque <= saldo) {
                saldo -=valorSaque;
              System.out.println("Saque realizado com sucesso! ");

              } else {
               System.out.println("Saldo insuficiente. ");

              }
              break;
                case 3: //Consultar Saldo
                System.out.println("Saldo atual: " + saldo);
                break;
                
                case 0: //Encerrar programa
                    System.out.println("Programa encerrado.");
                break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
} 
    }
}
