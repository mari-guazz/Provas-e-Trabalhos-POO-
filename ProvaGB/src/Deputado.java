import java.util.ArrayList;

public class Deputado {
	private String nome;
	private double salarioBrut;
	private double salarioLiq;
	private String partido;
	private ArrayList<Funcionario> funcionarios;
	
	public Deputado(String nome, double salarioBrut, double salarioLiq, String partido) {
		this.nome = nome;
		this.salarioBrut = salarioBrut;
		this.salarioLiq = salarioLiq;
		this.partido = partido;
		this.funcionarios = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBrut() {
		return salarioBrut;
	}

	public void setSalarioBrut(double salarioBrut) {
		this.salarioBrut = salarioBrut;
	}

	public double getSalarioLiq() {
		return salarioLiq;
	}

	public void setSalarioLiq(double salarioLiq) {
		this.salarioLiq = salarioLiq;
	}
	
	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public void inserirFuncionario(Funcionario f) {
		funcionarios.add(f);
	}
	
	
	
}
