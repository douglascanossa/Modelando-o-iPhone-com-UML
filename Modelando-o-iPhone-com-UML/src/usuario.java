
// Usuario.java
import Aparelho.iPhone;

public class usuario {
    public static void main(String[] args) {
        iPhone meuTelefone = new iPhone("iPhone 7", 128);

        // Testando as funcionalidades
        meuTelefone.selecionarMusica(" Chão de Giz");
        meuTelefone.tocar();
        meuTelefone.pausar();
        meuTelefone.ligar("11-999999999");
        meuTelefone.atender("11-888888888");
        meuTelefone.exibirPagina("https://www.dio.me/");
        meuTelefone.atualizarPagina();
        meuTelefone.adicionarNovaAba();

    }
}
