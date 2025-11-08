public class Serie extends Midia{
    private int temporadas;
    private int episodiosTotais;

    public Serie(int id, String titulo, String genero, String elenco, int anoLancamento, double avaliacao, String sinopse, int temporadas, int episodiosTotais) {
        super(id, titulo, genero, elenco, anoLancamento, avaliacao, sinopse);
        this.temporadas = temporadas;
        this.episodiosTotais = episodiosTotais;
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosTotais() {
        return episodiosTotais;
    }
    public void setEpisodiosTotais(int episodiosTotais) {
        this.episodiosTotais = episodiosTotais;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("Temporadas: %d | Episódios Totais: %d%n", temporadas, episodiosTotais);
    }
}

