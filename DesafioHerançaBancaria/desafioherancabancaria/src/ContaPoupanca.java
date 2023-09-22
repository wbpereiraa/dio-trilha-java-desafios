import java.text.DecimalFormat;

class ContaPoupanca extends ContaBancaria {
  private double taxaJuros;

public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
    super(numero, titular, saldo);
    this.taxaJuros = taxaJuros;
}

  public void exibirInformacoes() {
    super.exibirInformacoes();
    //TODO: Complementar as informações com a taxa de juros.
    DecimalFormat decimalFormat = new DecimalFormat("#.0");
    System.out.println("Taxa de Juros: " + decimalFormat.format(taxaJuros) + "%");

  }
}
