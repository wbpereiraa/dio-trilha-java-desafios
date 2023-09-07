import java.util.Scanner;

public class Contador extends ParametrosInvalidosException {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o 1º numero: ");
		int numeroUm = entrada.nextInt();
		System.out.println("Digite o 2º numero: ");
		int numeroDois = entrada.nextInt();
		
		try {
			contar(numeroUm, numeroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro!");
			
		}
		entrada.close();
	}
	static void contar(int numeroUm, int numeroDois ) throws ParametrosInvalidosException {
			if(numeroUm > numeroDois) {
				throw new ParametrosInvalidosException();
		}
		
		int contagem = numeroDois - numeroUm;
		for(int i = 1; i <= contagem; i++) {
			System.out.println(i);
		}
    }
}
