
public class Turma {
	private String disciplina;
	private Aluno[] alunos;
	
	public Turma(String disciplina, int maxAlunos) {
		this.disciplina = disciplina;
		this.alunos = new Aluno[maxAlunos];
		}
	
	public void adicionarAluno(Aluno aluno) {
		for(int i = 0; i < alunos.length; i++) {
			if(alunos[i] == null) {
				alunos[i] = aluno;
				return;
			}
		}
	}
	
	public void removerAluno(String nome) {
		for(int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null && alunos[i].getNome().equals(nome))
				alunos [i] = null;
		}
	}
	
	public void imprimirAlunos() {
		System.out.println("Alunos matriculados em " + disciplina + ":");
		for (Aluno aluno : alunos) {
			if (aluno != null)
				System.out.println("Nome: " + aluno.getNome() +  " / Matrícula: " + aluno.getMatricula());
			
		}
	}
	
	public Aluno alunoMaisNovo() {
		Aluno maisNovo = null;
		for (Aluno aluno : alunos) {
			if (aluno != null) 
				if (maisNovo == null || aluno.getIdade() < maisNovo.getIdade())
					maisNovo = aluno;
		}
		
		return maisNovo;
	}
}
