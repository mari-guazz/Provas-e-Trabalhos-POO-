public class Fazenda {
	private Animal[] animais;
	
	public Fazenda(Animal[] animais) {
		this.animais = animais;
	}
	
	public Animal[] getAnimais() {
		return animais;
	}
	
	public void setAnimais(Animal[] animais) {
		this.animais = animais;
	}
	
	public double calculaValorAnimais() {
		double soma = 0;
		for(int i = 0; i<animais.length; i++)
			if (animais[i] != null)
				soma += animais[i].calculaValorDeVenda();
		return soma;
	}
	
	public void imprimeInfo() {
		for(int i = 0; i < animais.length; i++)
			if (animais[i] != null)
				animais[i].imprimeInfo();
	}
	
	public double idadeMedia() {
		double somaIdades = 0;
		int quantidadeAnimais = 0;
		for(int i = 0; i < animais.length; i++)
			if (animais[i] != null) {
				somaIdades += animais[i].getIdade();
				quantidadeAnimais++;
			}
		return quantidadeAnimais > 0 ? somaIdades/quantidadeAnimais : -1;
				
	}
	
	public boolean aumentaIdade(String nome) {
		for(int i=0; i<animais.length; i++)
			if(animais[i] != null && animais[i].getNome().equalsIgnoreCase(nome)) {
				animais[i].aumentaIdade();
				return true;
			}
			return false;
	}
}
