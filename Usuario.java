package ProjetoP2;

import java.util.ArrayList;

public class Usuario {
    private String email;
    private String senha;

    private ArrayList<Midia> historico;
    private ArrayList<Midia> favoritos;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
        historico = new ArrayList<>();
        favoritos = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public boolean verificarSenha(String tentativa) {
        return senha.equals(tentativa);
    }

    public void adicionarFavorito(Midia m) {
        if (!favoritos.contains(m)) {
            favoritos.add(m);
            System.out.printf("'%s' adicionado aos favoritos.%n", m.getTitulo());
        } else {
            System.out.printf("'%s' já está nos favoritos.%n", m.getTitulo());
        }
    }

    public void removerFavorito(Midia m) {
        if (favoritos.remove(m)) {
            System.out.printf("'%s' removido dos favoritos.%n", m.getTitulo());
        } else {
            System.out.printf("'%s' não estava nos favoritos.%n", m.getTitulo());
        }
    }

    public void listarFavoritos() {
        if (favoritos.isEmpty()) {
            System.out.println("Nenhuma mídia nos favoritos.");
            return;
        }

        System.out.println("===== FAVORITOS =====");
        for (Midia m : favoritos) {
            m.exibirInfo();
            System.out.println("===============================");
            System.out.println();
        }
    }

    public void marcarComoAssistido(Midia m) {
        if (!historico.contains(m)) {
            historico.add(m);
            System.out.printf("'%s' adicionado ao histórico.%n", m.getTitulo());
        } else {
            System.out.printf("'%s' já está no histórico.%n", m.getTitulo());
        }
        
        m.incrementarVisualizacoes();
    }

    public void visualizarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma mídia assistida ainda.");
            return;
        }

        System.out.println("===== HISTÓRICO DE MÍDIAS ASSISTIDAS =====");
        for (Midia m : historico) {
            System.out.println(m.getTitulo());
        }
    }

    public void avaliarMidia(Midia m, double novaNota) {
        System.out.printf("'%s' recebeu nova avaliação: %.1f%n", m.getTitulo(), novaNota);
        m.setAvaliacao(novaNota);
    }
}