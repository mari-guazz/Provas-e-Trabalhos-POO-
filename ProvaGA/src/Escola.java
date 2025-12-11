import java.util.Scanner;
public class Escola {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o número de alunos para a turma de Matemática: ");
		int numAlunos = s.nextInt();
		s.nextLine();
		
		Turma turma = new Turma("Matemática", numAlunos);
		
		for (int i = 0; i < numAlunos; i++) {
			System.out.println("Nome: ");
			String nome = s.nextLine();
			
			System.out.println("Idade: ");
			int idade = s.nextInt();
			s.nextLine();
			
			System.out.println("Matrícula: ");
			int matricula = s.nextInt();
			s.nextLine();
			
			Aluno aluno = new Aluno(nome, idade, matricula);
			turma.adicionarAluno(aluno);
			
		}
		
		turma.imprimirAlunos();
		
		Aluno alunoMaisNovo = turma.alunoMaisNovo();
		if (alunoMaisNovo != null) {
			System.out.println("Removendo mais novo: " + alunoMaisNovo.getNome());
			turma.removerAluno(alunoMaisNovo.getNome());
			
		}
		
		System.out.println("Lista atualizada: ");
		turma.imprimirAlunos();

	}

}
