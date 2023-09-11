import java.util.Scanner;
public class CondicionalmenteRico {
    public static void main(String[] args) throws Exception {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    //scanner.nextLine();
    int valorSaque = scanner.nextInt();
    //scanner.nextLine();
    
    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    int saldoDisponivel = saldoTotal-valorSaque;
    
    if(saldoTotal >= valorSaque){
      System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoDisponivel);
    }else if(saldoTotal < valorSaque){
      System.out.println("Saldo insuficiente. Saque nao realizado!");
    }
    scanner.close();
  }
}

