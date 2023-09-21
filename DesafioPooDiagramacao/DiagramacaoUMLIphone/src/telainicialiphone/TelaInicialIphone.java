package telainicialiphone;

import aparelho.AparelhoTelefonico;
import navegador.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;
import telainicial.Iphone;

public class TelaInicialIphone  {

    public static void main(String[] args) {
        
        ReprodutorMusical reprodutormusical = new Iphone();

        reprodutormusical.tocarMusica();
        reprodutormusical.pausarMusica();
        reprodutormusical.selecionarMusica();

        System.out.println();

        AparelhoTelefonico aparelhotelefonico = new Iphone();
        
        aparelhotelefonico.ligar();
        aparelhotelefonico.atenderChamada();
        aparelhotelefonico.chamarCorreioVoz();

        System.out.println();

        NavegadorInternet navegadorinternet = new Iphone();

        navegadorinternet.adicionarNovaAba();
        navegadorinternet.atualizarPagina();
        navegadorinternet.exibirPagina();
        
    }
}
