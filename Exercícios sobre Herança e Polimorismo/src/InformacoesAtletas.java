
public abstract class InformacoesAtletas {

	public void imprimeExclusivosAtleta(Atleta a) {
		if(a instanceof Nadador){
			Nadador n = (Nadador) a;
			n.informarCategoria();
		} else if(a instanceof Corredor){ 
			Corredor c = (Corredor) a;
			c.informarPeso();
		}
	}
	
	public void imprimeInformacoesAtleta(Atleta a) {
		System.out.println(a);
	}
}
