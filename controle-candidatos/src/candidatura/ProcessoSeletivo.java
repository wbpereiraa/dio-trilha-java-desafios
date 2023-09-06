package candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {

	public static void main(String[] args) {
			//salario base maior que salario pretendido
			//case1(2000.0, 1900.0);
			
			//salario base igual que salario pretendido
			//case1(2000.0, 2000.0);
			
			//salario base igual que salario pretendido
			//case1(1900.0, 2000.0);
			
			String [] candidatosSelecionados = {"FELIPE","M�RCIA","JULIA","PAULO","AUGUSTO"};
			//primeiro um for para selecionar os candidatos
			for(String candidato: candidatosSelecionados) {
				entrandoEmContato(candidato);
		}
	}
	static void entrandoEmContato(String candidato) {		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
				atendeu= atender();
				continuarTentando = !atendeu;
				if(continuarTentando)
					tentativasRealizadas++;
				else
					System.out.println("CONTATO REALIZADO COM SUCESSO");
					
		}while(continuarTentando && tentativasRealizadas<3);
				
		if(atendeu)
				System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
				System.out.println("N�O CONSEGUIMOS CONTATO COM " + candidato +", N�MERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
	}				
			
	//m�todo auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

	static void imprimirSelecionados() {
		String[] candidatosSelecionados = { "FELIPE", "M�RCIA", "JULIA", "PAULO", "AUGUSTO" };

		// forma indexada
		// quando preciso do indice para complementar a l�gica
		System.out.println("Imprimindo com a ordem de sele��o pelo �ndice");
		for (int x = 0; x < candidatosSelecionados.length; x++) {
			System.out.println((x + 1) + "� Candidato � " + candidatosSelecionados[x]);
		}

		// forma abrevida
		// intera��o total sem precisar da posi��o ou indice
		System.out.println("Imprimindo todos sem a necessidade de exibir o �ndice");

		for (String candidato : candidatosSelecionados) {
			System.out.println(candidato);
		}

	}

	static void selecionarCandidatos() {
		double salarioBase = 2000.0;
		String[] candidatos = { "FELIPE", "M�RCIA", "JULIA", "PAULO", "AUGUSTO", "M�NICA", "FABR�CIO", "MIRELA",
				"DANIELA", "JORGE" };
		int totalSelecionados = 0;
		int proximoCandidato = 0;
		while (totalSelecionados < 5 && proximoCandidato < candidatos.length) {
			String candidato = candidatos[proximoCandidato++];
			double valorPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " est� pedindo " + valorPretendido);
			if (valorPretendido > salarioBase) {
				System.out.println("QUE PENA!! O candidato " + candidato + " N�O foi selecionado ");

			} else {
				System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
				totalSelecionados++;
			}

		}
		System.out.println("Total de selecionados: " + totalSelecionados);
		System.out.println("Total de consultados: " + proximoCandidato);
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void ligarCandidato(double salarioBase, double salarioPretendido) {

		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
