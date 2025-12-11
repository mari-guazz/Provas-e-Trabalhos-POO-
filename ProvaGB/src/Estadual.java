
public class Estadual extends Deputado {
 private String estado;
 
	public Estadual(String nome, String partido, double salarioBrut, double salarioLiq, String estado) {
		super(nome, salarioBrut, salarioLiq, partido);
		this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
