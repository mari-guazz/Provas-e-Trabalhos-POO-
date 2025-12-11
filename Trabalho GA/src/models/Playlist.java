package models;


import java.util.ArrayList;

public class Playlist {
    private int id;
    private String nome;
    private ArrayList<Musica> musicas;

    public Playlist() {
        this.musicas = new ArrayList<>();
    }

    public Playlist(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public ArrayList<Musica> getMusicas() { return musicas; }

    // Métodos CRUD
    public void adicionarMusica(Musica m) {
        musicas.add(m);
    }

    public void removerMusica(String titulo) {
        musicas.removeIf(m -> m.getTitulo().equalsIgnoreCase(titulo));
    }

    public void listarMusicas() {
        if (musicas.isEmpty()) {
            System.out.println("Nenhuma música na playlist.");
        } else {
            for (Musica m : musicas) {
                System.out.println(m);
            }
        }
    }

    @Override
    public String toString() {
        return "Playlist: " + nome + " (" + musicas.size() + " músicas)";
    }
}
