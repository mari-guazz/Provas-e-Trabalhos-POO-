
public class Atleta {
	protected String nome;
	protected int idade;
	
	public Atleta(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimeInfo() {
		System.out.println("Nome" + nome + "\nIdade" + idade);
		
		
	}
}
