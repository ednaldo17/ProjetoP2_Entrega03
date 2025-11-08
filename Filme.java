public class Filme extends Midia {
    private int duracao;
    private String diretor;

    public Filme(int id, String titulo, String genero, String elenco, int anoLancamento, double avaliacao, String sinopse, int duracao, String diretor) {
        super(id, titulo, genero, elenco, anoLancamento, avaliacao, sinopse);
        this.duracao = duracao;
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("Duração: %d minutos%n", duracao);
        System.out.printf("Diretor: %s%n", diretor);
    }
}   

