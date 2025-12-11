import java.util.Scanner;
import models.*;
import services.GerenciadorPlaylists;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorPlaylists gerenciador = new GerenciadorPlaylists();
        gerenciador.carregarDoArquivo("dados.txt");

        int opcao;
        do {
            System.out.println("\n=== MENU PLAYLIST ===");
            System.out.println("1. Listar Playlists");
            System.out.println("2. Criar Playlist");
            System.out.println("3. Adicionar Música");
            System.out.println("4. Remover Música");
            System.out.println("5. Listar Músicas de uma Playlist");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt(); sc.nextLine();

            switch (opcao) {
                case 1 -> gerenciador.listarPlaylists();
                case 2 -> {
                    System.out.print("Nome da playlist: ");
                    String nome = sc.nextLine();
                    gerenciador.adicionarPlaylist(new Playlist(gerenciador.hashCode(), nome));
                    System.out.println("Playlist criada!");
                }
                case 3 -> {
                    System.out.print("Nome da playlist: ");
                    String nome = sc.nextLine();
                    Playlist p = gerenciador.buscarPlaylist(nome);
                    if (p != null) {
                        System.out.print("Título da música: ");
                        String titulo = sc.nextLine();
                        System.out.print("Nome do artista: ");
                        String artistaNome = sc.nextLine();
                        System.out.print("Gênero: ");
                        String genero = sc.nextLine();
                        System.out.print("Duração (segundos): ");
                        int duracao = sc.nextInt(); sc.nextLine();

                        Artista a = new Artista(1, artistaNome, genero);
                        Musica m = new Musica(1, titulo, duracao, a);
                        p.adicionarMusica(m);
                        System.out.println("Música adicionada!");
                    } else {
                        System.out.println("Playlist não encontrada.");
                    }
                }
                case 4 -> {
                    System.out.print("Nome da playlist: ");
                    String nome = sc.nextLine();
                    Playlist p = gerenciador.buscarPlaylist(nome);
                    if (p != null) {
                        System.out.print("Título da música: ");
                        String titulo = sc.nextLine();
                        p.removerMusica(titulo);
                    }
                }
                case 5 -> {
                    System.out.print("Nome da playlist: ");
                    String nome = sc.nextLine();
                    Playlist p = gerenciador.buscarPlaylist(nome);
                    if (p != null) p.listarMusicas();
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
