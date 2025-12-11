import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Informe a quantidade de animais na fazenda: ");
		Animal[] animais = new Animal[Integer.parseInt(s.nextLine())];
		
		for(int i=0; i<animais.length; i++)
			animais[i] = new Animal("Animal "+i, "Tipo "+i, Math.random()*500+1, i+2);
		
		Fazenda f = new Fazenda(animais);
		
		System.out.println("--> Idade média dos animais: "+f.idadeMedia());
		System.out.println("\n--> Valor total de venda: "+f.calculaValorAnimais());
		System.out.println("\n--> Tipo dos animais da fazenda:");
		
		Animal[] animaisNaFazenda = f.getAnimais();
		
		for(int i=0; i<animaisNaFazenda.length; i++)
			if(animaisNaFazenda[i] != null)
				System.out.println("\t- "+animaisNaFazenda[i].getTipo());
		
		System.out.print("\n--> Informe o nome de um animal para aumentar a idade: ");
		String nome = s.nextLine();
		if(f.aumentaIdade(nome))
			System.out.println("Idade do animal "+nome+" aumentada com sucesso.");
		else
			System.out.println("Animal "+nome+" não encontrado na fazenda.");
		
		System.out.println("\n--> Informações dos animais da fazenda: ");
		f.imprimeInfo();
		
		System.out.println("\n--> Informações do animal com maior valor de venda: ");

		int posicaoMaiorValorVenda = 0;
		for(int i=1; i<animaisNaFazenda.length; i++)
			if(animaisNaFazenda[i].calculaValorDeVenda() > animaisNaFazenda[posicaoMaiorValorVenda].calculaValorDeVenda())
				posicaoMaiorValorVenda = i;
		
		animaisNaFazenda[posicaoMaiorValorVenda].imprimeInfo();
	}
}







