import java.util.ArrayList;

public class ProcuraCorruptos {

	public static ArrayList<Deputado> deputadosMaisFuncionarios(ArrayList<Deputado> lista){
		ArrayList<Deputado> result = new ArrayList<>();
		for (Deputado d : lista) {
			if (d.getFuncionarios().size() > 10) {
				result.add(d);
			}
		}
		return result;
	}

	public static ArrayList<Deputado> deputadosRecebemValores(ArrayList<Deputado> lista){
		ArrayList<Deputado> result = new ArrayList<>();
		for (Deputado d : lista) {
			for (Funcionario f : d.getFuncionarios()) {
				double deveReceber = f.getSalarioBrut() * 0.7;
				if (f.getSalarioLiq() < deveReceber) {
					result.add(d);
					break;
				}
			}
		}
		return result;
	}
	
	public static ArrayList<Deputado> deputadosDesviamVerbas(ArrayList<Deputado> lista){
		ArrayList<Deputado> result = new ArrayList<>();
		for (Deputado d : lista) {
			double deveReceber = d.getSalarioBrut() * 0.8;
			if (d.getSalarioLiq() > deveReceber) {
				result.add(d);
				break;
			}
		}
		return result;
	}
}
