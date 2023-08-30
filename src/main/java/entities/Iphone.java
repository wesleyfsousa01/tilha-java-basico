package entities;

public class Iphone implements  Telefone, Navegador, Reprodutor{

    private String modelo;

    public Iphone( String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void exibirPagina() {

        System.out.println("Exibindo pagina Web");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova guia adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    @Override
    public void tocar() {
        System.out.println("tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada em andamento...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Inicializando Correio de Voz");
    }
}
