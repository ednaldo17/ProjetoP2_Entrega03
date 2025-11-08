package ProjetoP2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Bem-vindo ao Catálogo de Mídias!");
        System.out.println("====================================");

        Catalogo cat = new Catalogo();

        Filme f1 = new Filme(
            1,
            "Vingadores: Ultimato",
            "Ação",
            "Robert Downey Jr., Chris Evans, Scarlett Johansson",
            2019,
            9.2,
            "Os Vingadores se unem para derrotar Thanos e reverter o estalar de dedos.",
            181,
            "Anthony e Joe Russo"
        );

        Filme f2 = new Filme(
            2,
            "O Rei Leão",
            "Animação", 
            "Donald Glover, Beyoncé, James Earl Jones",
            2019,
            8.5,
            "O jovem leão Simba deve aceitar seu destino como rei após a morte de seu pai.",
            118,
            "Jon Favreau"
        );

        Filme f3 = new Filme(
            3,
            "Batman: O Cavaleiro das Trevas",
            "Ação",
            "Christian Bale, Heath Ledger, Aaron Eckhart",
            2008,
            9.0,
            "Batman enfrenta o Coringa, um criminoso que deseja espalhar o caos em Gotham.",
            152,
            "Christopher Nolan"
        );

        Serie s1 = new Serie(
            4,
            "Game of Thrones",
            "Fantasia",
            "Emilia Clarke, Kit Harington, Peter Dinklage",
            2011,
            9.3,
            "Famílias nobres lutam pelo controle do Trono de Ferro em Westeros.",
            8,
            73
        );

        Serie s2 = new Serie(
            5,
            "Breaking Bad",
            "Drama",
            "Bryan Cranston, Aaron Paul, Anna Gunn",
            2008,
            9.5,
            "Um professor de química se torna produtor de metanfetamina para sustentar sua família.",
            5,
            62
        );

        Serie s3 = new Serie(
            6,
            "Loki",
            "Ficção Científica",
            "Tom Hiddleston, Owen Wilson, Sophia Di Martino",
            2021,
            8.3,
            "Loki se envolve em aventuras no tempo após roubar o Tesseract.",
            2,
            12
        );

        cat.adicionarMidia(f1);
        cat.adicionarMidia(f2);
        cat.adicionarMidia(f3);
        cat.adicionarMidia(s1);
        cat.adicionarMidia(s2);
        cat.adicionarMidia(s3);

        System.out.println("\n===============================");
        System.out.println("        CATÁLOGO COMPLETO");
        System.out.println("===============================");
        cat.listarMidias();

        System.out.println("BUSCANDO POR ID (Batman - ID 3)");
        cat.buscarPorId(3);

        System.out.println("===============================");

        System.out.println("\nBUSCANDO POR GÊNERO: 'Ação'");
        cat.buscarPorGenero("Ação");

        Usuario user1 = new Usuario("usuario@email.com", "12345");

        user1.adicionarFavorito(f1);
        user1.adicionarFavorito(f2);
        user1.adicionarFavorito(s1);
        user1.adicionarFavorito(s2);

        user1.marcarComoAssistido(f1);
        user1.marcarComoAssistido(f2);
        user1.marcarComoAssistido(s1);
        user1.marcarComoAssistido(s2);

        user1.avaliarMidia(f2, 9.0);
        user1.avaliarMidia(s3, 8.5);

        System.out.println();

        user1.visualizarHistorico();

        System.out.println();

        user1.listarFavoritos();

        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(user1);

        System.out.printf("Usuário cadastrado: %s%n", listaUsuarios.get(0).getEmail());

        System.out.println("\n===============================");

        System.out.println("\nRemovendo a mídia 'O Rei Leão' do catálogo...");
        cat.removerMidiaPorId(2);

        System.out.println("\n===== CATÁLOGO ATUALIZADO =====");
        cat.listarMidias();

        System.out.println("Execução finalizada com sucesso!");
        System.out.println("===============================");

        // ====================== POLIMORFISMO ======================
        System.out.println("\n===== DEMONSTRAÇÃO DE POLIMORFISMO =====");

        // Lista do tipo da superclasse contendo objetos das subclasses
        ArrayList<Midia> listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add(f1); // Filme
        listaPolimorfica.add(s1); // Série
        listaPolimorfica.add(f3); // Outro Filme
        listaPolimorfica.add(s3); // Outra Série

        // Chamando o mesmo método, mas com comportamento diferente
        for (Midia m : listaPolimorfica) {
            m.exibirInfo(); 
            System.out.println("===============================");
        }
    }
}
