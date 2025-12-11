
public class Nadador extends Atleta{
	private String categoria;
	
	public Nadador(String nome, int idade, String categoria) {
		super(nome, idade);
		this.categoria = categoria;
		// TODO Auto-generated constructor stub
	}

	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public void imprimeInfo() {
		System.out.println("Nome " + nome + "\nIdade " + idade + "\nCategoria " + categoria);
	}
	
	public void informarCategoria() {
		System.out.println("É um nadador, e sua categoria é " + categoria);
	}
}
