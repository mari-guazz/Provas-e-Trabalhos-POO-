
public class TesteAssociacao {

	public static void main(String[] args) {
		
		Time t1 = new Time("Grêmio", "Porto Alegre");
		
		Jogador j1 = new Jogador("fulaninho", "atacante", t1);
		Jogador j2 = new Jogador("ciclaninho", "goleiro", t1);
		
		System.out.println("Jodadores do " + t1.getNome() + ":");
		System.out.println(j1.getNome() + ", " + j1.getPosicao() + ", " + j1.getTime().getNome() );
		System.out.println(j2.getNome() + ", " + j2.getPosicao() + ", " + j2.getTime().getNome() );
		
	}

}
