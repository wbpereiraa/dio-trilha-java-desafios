import java.util.Scanner;

public class OGrandeDeposito {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        while(true){
          double valor = scanner.nextDouble();

          if (valor > 0) {

            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            System.out.printf("Deposito realizado com sucesso! \nSaldo atual: R$ %.2f", valor);
            break;
          } else if (valor == 0) {
            //TODO: Imprimir a mensagem encerrando o programa.
            System.out.println("Encerrando o programa...");
            break;
          } else {
             //TODO: Imprimir a mensagem valor inválido.
             System.out.println("Valor invalido! Digite um valor maior que zero.");
             break;
          }
      }
      scanner.close();
    }
}
