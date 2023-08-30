package teste;

import entities.Iphone;

public class IPhoneTeste {

    public static void main(String[] args) {
        Iphone iphone= new Iphone("Iphone 2G");

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Maroon 5 - Makes Me Wonder");

        iphone.ligar("(61) 99988-7766");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
