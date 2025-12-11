package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import models.*;

public class GerenciadorPlaylists {
    private ArrayList<Playlist> playlists;

    public GerenciadorPlaylists() {
        playlists = new ArrayList<>();
    }

    public void carregarDoArquivo(String caminho) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            boolean cabecalho = true;
            while ((linha = br.readLine()) != null) {
                if (cabecalho) { cabecalho = false; continue; }
                if (linha.trim().isEmpty()) continue;

                String[] partes = linha.split(";");
                if (partes.length < 5) {
                    System.out.println("Linha inválida: " + linha);
                    continue;
                }

                int idArtista = Integer.parseInt(partes[0]);
                String nomeArtista = partes[1];
                String genero = partes[2];
                String tituloMusica = partes[3];
                int duracao = Integer.parseInt(partes[4]);

                Artista artista = new Artista(idArtista, nomeArtista, genero);
                Musica musica = new Musica(idArtista, tituloMusica, duracao, artista);

                if (playlists.isEmpty()) {
                    playlists.add(new Playlist(1, "Favoritas"));
                }

                playlists.get(0).adicionarMusica(musica);
            }
            System.out.println("Arquivo carregado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }

    public void adicionarPlaylist(Playlist p) {
        playlists.add(p);
    }

    public void listarPlaylists() {
        for (Playlist p : playlists) {
            System.out.println(p);
        }
    }

    public Playlist buscarPlaylist(String nome) {
        for (Playlist p : playlists) {
            if (p.getNome().equalsIgnoreCase(nome)) return p;
        }
        return null;
    }

    public void removerPlaylist(String nome) {
        playlists.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }
}
