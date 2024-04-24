package escola_tecnologia;

public class Aluno {

	public static void main(String[] args) {
										//
		CadAluno Victor = new CadAluno("Victor"," computer science");
		CadAluno Guilherme = new CadAluno("Cleslley", "computer science");
		CadAluno Cleslley = new CadAluno("Guilherme", "geologia");
		
		Victor.cod=001;
		Victor.nome="Victor Claudinho Vieira Moura";
		Victor.RGM=12223242;
		
		Cleslley.cod=002;
		Cleslley.nome="Cleslley de Moura Lima";
		Cleslley.RGM=92827262;
		
		Guilherme.cod=003;
		Guilherme.nome="Guilherme Texeira da Costa";
		Guilherme.RGM=62524232;

	}

}
