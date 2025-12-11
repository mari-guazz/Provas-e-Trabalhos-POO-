import java.util.Scanner;
public class Loja {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Informe a capacidade de produtos: ");
		int x = s.nextInt();
		
		Produto[] produtos = new Produto[x];
		for (int i = 0; i < x; i++) {
			System.out.println("\nProduto " + (i + 1) + ":");
			System.out.println("Nome: ");
			String nome = s.nextLine();
			s.nextLine();
			System.out.println("Preco: ");
			double preco = s.nextDouble();
			s.nextLine();
			
			produtos[i] = new Produto(nome, preco);
		}
		
		System.out.println("\n Lista de produtos: ");
		for (int i = 0; i < produtos.length; i++) {
			System.out.println("Produto " + (i+1) + "-Nome: " + produtos[i].getNome() + 
					"Preço: " + produtos[i].getPreco());
		
		}
	}

}
