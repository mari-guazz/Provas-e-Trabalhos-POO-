import java.util.*;

public class ControleTeleSena {

    private Pessoa[] pessoas = new Pessoa[20];
    private List<Integer> numerosSorteados = new ArrayList<>();
    private int totalTeleSenasVendidas = 0;
    private List<Pessoa> ganhadores = new ArrayList<>();

    public ControleTeleSena() {
        gerarPessoasECompras();
    }
    
    //Determina quantos bilhetes cada pessoa comprou
    private void gerarPessoasECompras() {
        String[] nomes = {
            "Ana","Bruno","Carlos","Daniela","Eduardo",
            "Fernanda","Giovana","Henrique","Isabela","João",
            "Karen","Lucas","Mariana","Nicolas","Olivia",
            "Paulo","Renata","Sofia","Thiago","Vanessa"
        };

        for (int i = 0; i < 20; i++) {
            int qtd = (int)(Math.random() * 15 + 1);
            pessoas[i] = new Pessoa(nomes[i], qtd);
            totalTeleSenasVendidas += qtd;
        }
    }
    
    //Verifica se um dos conjuntos de um bilhete é igual aos números sorteados
    private boolean conjuntoCompleto(int[] conjunto) {
        for (int n : conjunto) {
            if (!numerosSorteados.contains(n)) {
                return false;
            }
        }
        return true;
    }

    private void verificarGanhadores() {
        for (Pessoa p : pessoas) {
            for (TeleSena t : p.getTeleSenas()) {
                if (conjuntoCompleto(t.getConjunto1()) || conjuntoCompleto(t.getConjunto2())) {
                    if (!ganhadores.contains(p)) {
                        ganhadores.add(p);
                    }
                }
            }
        }
    }
    
    //Sorteia os 25 números da Tele Sena e chama o método para verificar quem ganhou
    public void realizarSorteio() {
        Set<Integer> usados = new HashSet<>();

        while (numerosSorteados.size() < 25) {
            int n = (int)(Math.random() * 60 + 1);
            if (usados.add(n)) {
                numerosSorteados.add(n);
            }
        }

        verificarGanhadores();

        while (ganhadores.isEmpty()) {
            int n = (int)(Math.random() * 60 + 1);
            if (usados.add(n)) {
                numerosSorteados.add(n);
                verificarGanhadores();
            }
        }
    }

    public void mostrarResultados() {

        double totalArrecadado = totalTeleSenasVendidas * TeleSena.VALOR;
        double premioTotal = totalArrecadado * 0.8;
        double premioPorPessoa = premioTotal / ganhadores.size();
        double lucro = totalArrecadado - premioTotal;

        for (Pessoa g : ganhadores) {
            g.adicionarPremio(premioPorPessoa);
        }

        System.out.println("RESULTADOS DA TELE SENA");
        System.out.println("Números sorteados: " + numerosSorteados);
        System.out.println("Qtd. Tele Senas vendidas: " + totalTeleSenasVendidas);
        System.out.println("Qtd. ganhadores: " + ganhadores.size());
        System.out.println("Valor arrecadado: R$" + totalArrecadado);
        System.out.println("Prêmio total: R$" + premioTotal);
        System.out.println("Lucro: R$" + lucro);

        System.out.println("\nGANHADORES");
        for (Pessoa p : ganhadores) {
            System.out.println("Nome: " + p.getNome() +
                               " | Prêmio: R$" + p.getPremioRecebido());
        }

    }
}