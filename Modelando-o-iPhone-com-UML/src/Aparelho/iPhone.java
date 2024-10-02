package Aparelho;
// iPhone.java

import Interfaces.ReprodutorMusical;
import Interfaces.NavegadorInternet;
import Interfaces.AparelhoTelefonico;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String model;
    private int storage;

    public iPhone(String model, int storage) {
        this.model = model;
        this.storage = storage;
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica" + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o " + numero + "...");
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo chamada do " + numero + "...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    public String getModelo() {
        return model;
    }

    public int getArmazenamento() {
        return storage;
    }
}
