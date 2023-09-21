import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();

    //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
    
    ContaBancaria contabancaria = new ContaBancaria();
    contabancaria.numero = numeroConta;
    contabancaria.titular = nomeTitular;
    contabancaria.saldo = saldo;
    
    System.out.println("Informacoes:");
    //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
    System.out.println("Numero da conta: " + contabancaria.numero);
    System.out.println("Nome do titular: " + contabancaria.titular);
    System.out.println("Saldo: " + contabancaria.saldo);

    scanner.close();
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public void Bancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }
}
