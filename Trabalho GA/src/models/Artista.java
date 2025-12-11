package models;


public class Artista {
    private int id;
    private String nome;
    private String generoMusical;

    public Artista() {}

    public Artista(int id, String nome, String generoMusical) {
        this.id = id;
        this.nome = nome;
        this.generoMusical = generoMusical;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getGeneroMusical() { return generoMusical; }
    public void setGeneroMusical(String generoMusical) { this.generoMusical = generoMusical; }

    @Override
    public String toString() {
        return "Artista: " + nome + " (" + generoMusical + ")";
    }
}
