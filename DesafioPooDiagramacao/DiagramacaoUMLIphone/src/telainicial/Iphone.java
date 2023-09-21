package telainicial;

import aparelho.AparelhoTelefonico;
import navegador.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
        
                @Override
                public void tocarMusica() {
                    System.out.println("Tocando música");
                }

                @Override
                public void pausarMusica() {
                    System.out.println("Pausando música");
                }

                @Override
                public void selecionarMusica() {
                    System.out.println("Selecionando música");
                }

                @Override
                public void ligar() {
                    System.out.println("Fazendo ligação");
                }

                @Override
                public void atenderChamada() {
                    System.out.println("Atendendo chamada");
                }

                @Override
                public void chamarCorreioVoz() {
                    System.out.println("Chamando correio de voz");
                }

                @Override
                public void exibirPagina() {
                    System.out.println("Exibindo página");
                }

                @Override
                public void adicionarNovaAba() {
                    System.out.println("Adicionando nova aba");
                }

                @Override
                public void atualizarPagina() {
                    System.out.println("Atualizando página");
                }
}
