
public class Funcionario {
private String nome;
private double salarioBrut;
private double salarioLiq;

public Funcionario(String nome, double salarioBrut, double salarioLiq) {
	this.nome = nome;
	this.salarioBrut = salarioBrut;
	this.salarioLiq = salarioLiq;
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

}
