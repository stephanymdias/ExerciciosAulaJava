package exemplos;

import java.util.Scanner;

public class MetodoRetornoParametro03 {

	static int soma(int num01, int num02) {
		return num01+num02;
	}
	
	static int subtracao(int num01, int num02) {
		return num01-num02;
	}
	
	static int divisao(int num01, int num02) {
		return num01/num02;
	}
	
	static int multiplicacao(int num01, int num02) {
		return num01*num02;
	}
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			System.out.println("Digite o primeiro numero");
			int num01 = leia.nextInt();
			System.out.println("Digite o outro numero");
			int num02 = leia.nextInt();
			System.out.println("A soma �:"+soma(num01,num02));
			System.out.println("A subtracao �:"+subtracao(num01,num02));
			System.out.println("A divisao �:"+divisao(num01,num02));
			System.out.println("A multiplicacao �:"+multiplicacao(num01,num02));
		leia.close();
	}

}
