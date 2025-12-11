
public class TesteFilme {

	public static void main(String[] args) {
		
		Filme f1 = new Filme("Star Wars: Uma Nova Esperança", "George Lucas", 1977);
		Filme f2 = new Filme("O Senhor dos Aneis: A Sociedade do Anel", "Peter Jackson", 2001);
		
		
		System.out.println("Título: " + f1.getTitulo());
		System.out.println("Diretor: " + f1.getDiretor());
		System.out.println("Ano de Lançamento: " + f1.getAnoLancamento());
		
		System.out.println("\nTítulo: " + f2.getTitulo());
		System.out.println("Diretor: " + f2.getDiretor());
		System.out.println("Ano de Lançamento: " + f2.getAnoLancamento());
	}

}
