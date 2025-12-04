public class Pessoa {

    private String nome;
    private TeleSena[] telesenas;
    private double premioRecebido = 0;

    //Associa as pessoas aos seus bilhetes
    public Pessoa(String nome, int quantidadeTeleSenas) {
        this.nome = nome;
        telesenas = new TeleSena[quantidadeTeleSenas];

        for (int i = 0; i < quantidadeTeleSenas; i++) {
            telesenas[i] = new TeleSena();
        }
    }

    public String getNome() {
        return nome;
    }

    public TeleSena[] getTeleSenas() {
        return telesenas;
    }

    public void adicionarPremio(double valor) {
        premioRecebido += valor;
    }

    public double getPremioRecebido() {
        return premioRecebido;
    }
}