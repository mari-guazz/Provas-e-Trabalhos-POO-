
public class Corredor extends Atleta{
	private double peso;
	private Competicao competicao;
	
	public Corredor(String nome, int idade, double peso, Competicao competicao) {
		super(nome, idade);
		this.peso = peso;
		this.competicao = competicao;
		// TODO Auto-generated constructor stub
	}

	public double getpeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public Competicao getCompeticao() {
		return competicao;
	}
	
	public void setCompeticao(Competicao competicao) {
		this.competicao = competicao;
	}
	
	public void imprimeCompeticao() {
		System.out.println(competicao);
	}
	
	@Override
	public void imprimeInfo() {
		System.out.println("Nome" + nome + "\nIdade" + idade + "\nPeso" + peso + "\nCompete em ");
		competicao.imprimeData();
	}
	
	public void informarPeso() {
	System.out.println("É um corredor, e o peso deste corredor é " + peso);
	}
}
