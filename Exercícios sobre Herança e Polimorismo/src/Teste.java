
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data dataCompeticao = new Data(19, 05, 2011);
		Competicao competicao = new Competicao("Correr Cansa", dataCompeticao );
		
		competicao.imprimeData();
		
		Nadador nadador1 = new Nadador("Cielo", 23, "borboleta");
		
		nadador1.imprimeInfo();
		
		Corredor corredor1 = new Corredor("Pedro", 91, 68, competicao);
		dataCompeticao.setMes(2);
		
		corredor1.imprimeInfo();
	}

}
