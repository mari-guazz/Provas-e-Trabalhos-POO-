public class Animal {
	private String nome;
	private String tipo;
	private double peso;
	private int idade;
	private double preco;
	
	public Animal(String nome, String tipo, double peso, int idade) {
		this.nome = nome;
		this.tipo = tipo;
		this.peso = peso;
		this.idade = idade;
		this.preco = 0;
	}
	
	public Animal(String nome, int idade) {
		 this.nome = nome;
		 this.idade = idade;
		 this.preco = 0;
	 }
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void aumentaIdade() {
		idade++;
	}
	
	public double calculaPrecoAnimal() {
		if (idade <= 10) preco = peso/3;
		else if (idade <= 20) preco = peso/2;
		else if (idade <= 30) preco = peso*1.2;
		else preco = peso*1.73;
		return preco;
	}
	
	public double calculaJuros() {
		if (preco < 1) return 0;
		else if (preco <=100) return 0.1;
		else if (preco <= 249) return 0.29;
		else if (preco <= 986) return 0.61;
		else return 0.75;
	}
	
	public double calculaValorDeVenda() {
		if (preco == 0) calculaPrecoAnimal();
		return preco + preco * calculaJuros();
	}
	
	public void imprimeInfo() {
		System.out.println("Nome: "+nome);
		System.out.println("Tipo: "+tipo);
		System.out.println("Peso: "+peso);
		System.out.println("Preço: R$"+preco);
		System.out.println("Idade: "+idade);
	}
}
