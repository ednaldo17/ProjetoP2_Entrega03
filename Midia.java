public class Midia {
    private int id;
    private String titulo;
    private String genero;
    private String elenco;
    private int anoLancamento;
    private double avaliacao;
    private String sinopse;
    private int visualizacoes;

    public Midia(int id, String titulo, String genero, String elenco, int anoLancamento, double avaliacao, String sinopse) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.elenco = elenco;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
        this.sinopse = sinopse;
        this.visualizacoes = 0;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getElenco() {
        return elenco;
    }
    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }
    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public void incrementarVisualizacoes() {
        this.visualizacoes++;
    }

    public void exibirInfo() {
        System.out.printf("%s (%d):%n", titulo, anoLancamento);
        System.out.printf("Avaliação: %.1f | Gênero: %s%n", avaliacao, genero);
        System.out.printf("Elenco: %s%n", elenco);
        System.out.printf("Sinopse: %s%n%n", sinopse);
        System.out.printf("Visualizações: %d%n", visualizacoes);
    }

    public void avaliar(double novaNota) {
        this.avaliacao = novaNota;
    }

}   

