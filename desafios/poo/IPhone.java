public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaSelecionada;
    private String numeroDoContato;
    private String urlDaPaginaWeb;

    @Override
    public void tocarMusica() {
        System.out.println("Tocando a música: " + musicaSelecionada);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada: " + musicaSelecionada);
    }

    @Override
    public void selecionarMusica(String nomeDaMusica) {
        this.musicaSelecionada = nomeDaMusica;
        System.out.println("Música selecionada: " + musicaSelecionada);
    }

    @Override
    public void fazerLigacao(String numeroDoContato) {
        this.numeroDoContato = numeroDoContato;
        System.out.println("Ligando para o número: " + numeroDoContato);
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo a chamada do número: " + numeroDoContato);
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPaginaWeb(String urlDaPaginaWeb) {
        this.urlDaPaginaWeb = urlDaPaginaWeb;
        System.out.println("Exibindo a página: " + urlDaPaginaWeb);
    }

    @Override
    public void adicionarNovaAbaDeNavegacao(String urlDaPaginaWeb) {
        System.out.println("Adicionando nova aba com a URL: " + urlDaPaginaWeb);
    }

    @Override
    public void atualizarPaginaWeb() {
        System.out.println("Atualizando a página: " + urlDaPaginaWeb);
    }
}
