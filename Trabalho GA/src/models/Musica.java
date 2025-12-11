package models;
public class Musica {
    private int id;
    private String titulo;
    private int duracaoSegundos;
    private Artista artista;

    public Musica() {}

    public Musica(int id, String titulo, int duracaoSegundos, Artista artista) {
        this.id = id;
        this.titulo = titulo;
        this.duracaoSegundos = duracaoSegundos;
        this.artista = artista;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getDuracaoSegundos() { return duracaoSegundos; }
    public void setDuracaoSegundos(int duracaoSegundos) { this.duracaoSegundos = duracaoSegundos; }

    public Artista getArtista() { return artista; }
    public void setArtista(Artista artista) { this.artista = artista; }

    @Override
    public String toString() {
        return "Música: " + titulo + " | " + artista.getNome() + " | " + duracaoSegundos + "s";
    }
}
