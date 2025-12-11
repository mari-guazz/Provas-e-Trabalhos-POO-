import java.util.ArrayList;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		ArrayList<Deputado> deputados = new ArrayList<>();
		String[] partidos = {"PT", "PSDB", "MDB", "PL", "PP", "PSB", "PSD"};
		String[] estados = {"RS", "SC", "SP", "RJ"};
		
		for (int i = 1; i <= 10; i++) {
			String nome = "Dep " + i;
			String partido = partidos[r.nextInt(partidos.length)];
			
			double salarioBrut = 2000 + r.nextDouble() * 28000;
			double salarioLiq = 2000 + r.nextDouble() * 28000;
			
			boolean ehFederal = r.nextBoolean();
			Deputado d;
			if (ehFederal) {
				int cadastro = 100000 + r.nextInt(900000);
				d = new Federal(nome, partido, salarioBrut, salarioLiq, cadastro);
			} else {
				String estado = estados[r.nextInt(estados.length)];
				d = new Estadual(nome, partido, salarioBrut, salarioLiq, estado);
			}
			
			int numFuncionarios = 3 + r.nextInt(33);
			
			for (int f = 1; f<= numFuncionarios; f++) {
				String nomeF = "Func_" + i + "_" + f;
				double salarioBrutF = 1000 + r.nextDouble()*10000;
				double salarioLiqF = salarioBrutF * 0.7;
				
				
				d.inserirFuncionario(new Funcionario(nomeF, salarioBrutF, salarioLiqF));
			}
			deputados.add(d);
		}
		
		System.out.println("Deputados com mais funcionairos que o permitido: ");
		for (Deputado d : ProcuraCorruptos.deputadosMaisFuncionarios(deputados)) {
			imprimirIdentificacao(d);
		}
		
		
		System.out.println("Deputados que recebem valores dos funcionários: ");
		for (Deputado d : ProcuraCorruptos.deputadosRecebemValores(deputados)) {
			imprimirIdentificacao(d);
		}
		
		System.out.println("Deputados que desviam verbas: ");
		for (Deputado d : ProcuraCorruptos.deputadosDesviamVerbas(deputados)) {
			imprimirIdentificacao(d);
		}
	}
		
		public static void imprimirIdentificacao(Deputado d) {
			if (d instanceof Federal) {
				System.out.println("Federal - Cadastro: " + ((Federal) d).getCadastro() + " - Nome: " + d.getNome());
			} else {
				System.out.println("Estadual - Estado: " + ((Estadual) d).getEstado() + " - Nome: " + d.getNome());
			}
		
	}

}
