package teste;

public class Calcualdora {

	public static void main(String[] args) {
		int idade;
		msg();
		msg("Cleslley");
		idade = calc(2003, 2024);
		System.out.println("A sua idade é: " + idade);
	}

	public static void msg() {
		System.out.println("Bom dia!");
	}
	
	public static void msg(String nome) {
		System.out.println("Bom dia! " + nome);
	}
	
	public static int calc(int ano_nasc, int ano_atual) {
		int idade = ano_atual - ano_nasc;
		return idade;
	}
}
