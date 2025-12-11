
public class Jogador {
	private String nome;
	private String posicao;
	private Time time;
	
	public Jogador(String nome, String posicao, Time time) {
		this.nome = nome;
		this.posicao = posicao;
		this.time = time;
	}
	
	public String getNome() {
		 return nome;
	 }
	 
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	 
	 public String getPosicao() {
		 return posicao;
	 }
	 
	 public void setPosicao(String posicao) {
		 this.posicao = posicao;
	 }
	
	 public Time getTime() {
		 return time;
	 }
	 
	 public void setTime(Time time) {
		 this.time = time;
	 }
}
