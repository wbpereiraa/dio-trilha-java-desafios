import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        System.out.println("SEJA BEM VINDO AO BANCO DIGITAL DIO! \n");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número da agência: ");
        String agencia = entrada.next();

        System.out.print("Digite o número da conta: ");
        int conta = entrada.nextInt();

        System.out.print("Digite o nome do titular: ");
        String titular = entrada.next();

        System.out.print("Digite o valor do depósito inicial: R$");
        double valorDepositoInicial = entrada.nextDouble();
        
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo é de R$%.2f e já está disponível para saque.\n", titular, agencia, conta, valorDepositoInicial);

        System.out.println("\nBANCO DIO AGRADECE PELA CONFIANÇA!");
        entrada.close();
    }
}
