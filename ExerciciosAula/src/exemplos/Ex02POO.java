package exemplos;

public class Ex02POO {

	int numeroDaChamada = 22023;
	String nome = "Gabriela";

	public static void main(String[] args) {
		Ex02POO aluno01 = new Ex02POO();

		System.out.println("O numero da aluna � " + aluno01.numeroDaChamada + 
				" o nome dela �: " + aluno01.nome);
		
		Ex02POO aluno02 = new Ex02POO();

		System.out.println("O numero da aluna � " + aluno02.numeroDaChamada + 
				" o nome dela �: " + aluno02.nome);
	}

}
