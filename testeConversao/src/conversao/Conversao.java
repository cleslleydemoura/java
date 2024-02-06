package conversao;

public class Conversao {

	public static void main(String[] args) {
		
		
		double salario = 2700.50;
		float pontoFlutuante = 3.14f; // Ou f no final ou então usar o cast: (float) 3.14
		int valor = (int) salario;
		
		// tranformando o valor do tipo double em int.
		
		
		int valor2 = 2000000000;
		long numeroGrande = 123324325423653451L; // O L no final indica para o compilador que é um número literal
		short numeroPequeno = 2103;
		byte byteNumero = 127; // num. máximo
		
		System.out.println(valor + "\n" + pontoFlutuante + "\n" + valor2 + "\n" + numeroGrande + "\n" + numeroPequeno+ "\n" + byteNumero); // número impresso without as casas decimais após o 2700
	}

}
