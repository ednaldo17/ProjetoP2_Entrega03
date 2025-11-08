package ProjetoP2;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Midia> listaMidias;

    public Catalogo() {
        listaMidias = new ArrayList<>();
    }

    public void adicionarMidia(Midia m) {
        listaMidias.add(m);
        System.out.println("Mídia adicionada: " + m.getTitulo());
    }

    public void listarMidias() {
        if (listaMidias.isEmpty()) {
            System.out.println("Nenhuma mídia cadastrada.");
            return;
        }

        for (Midia m : listaMidias) {
            m.exibirInfo();
            System.out.println("===============================");
        }
    }

    public Midia buscarPorId(int id) {
        for (Midia m : listaMidias) {
            if (m.getId() == id) {
                m.exibirInfo();
                return m;
            }
        }
        System.out.println("Nenhuma mídia encontrada com o ID: " + id);
        return null;
    }

    public void buscarPorGenero(String genero) {
        boolean encontrou = false;

        for (Midia m : listaMidias) {
            if (m.getGenero().equalsIgnoreCase(genero)) {
                m.exibirInfo();
                System.out.println("===============================");
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma mídia encontrada com o gênero: " + genero);
        }
    }

    public void listarMaisAssistidas() {
        boolean encontrou = false;

        System.out.println("===== MAIS ASSISTIDAS =====");
        for (Midia m : listaMidias) {
            if (m.getVisualizacoes() > 0) {
                m.exibirInfo();
                System.out.println("===============================");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma mídia foi assistida ainda.");
        }
    }

    public void removerMidiaPorId(int id) {
        for (int i = 0; i < listaMidias.size(); i++) {
            if (listaMidias.get(i).getId() == id) {
                System.out.println("Mídia removida: " + listaMidias.get(i).getTitulo());
                listaMidias.remove(i);
                return;
            }
        }
        System.out.println("Nenhuma mídia encontrada com o ID informado.");
    }   
}
