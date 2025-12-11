
public class Federal extends Deputado {
 private int cadastro;
 
	public Federal(String nome, String partido, double salarioBrut, double salarioLiq, int cadastro) {
		super(nome, salarioBrut, salarioLiq, partido);
		this.cadastro = cadastro;
	}
	
	public int getCadastro() {
		return cadastro;
	}
	
	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}
}
