package Atividade_1;

public class UsaAluno {

	public static void main(String[] args) {
		aluno aluno1 = new aluno();
		aluno aluno2 = new aluno();
		aluno1.ra = 1051392511;
		aluno1.nome = "Murillo";
		aluno1.curso = "DSM";
		aluno2.ra = 1051392512;
		aluno2.nome = "Miguel";
		aluno2.curso = "ADS";
		aluno1.mostrar_alunos();
		aluno2.mostrar_alunos();
	}

}
