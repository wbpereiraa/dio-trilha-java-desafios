import java.util.Scanner;
public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        //double valorFinal = valorInicial;

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);

        System.out.printf("Valor final do investimento: R$ %.2f",valorFinal);
        
        scanner.close();
    }
}
