package exemplos;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			System.out.println("Digite um numero para saber o dia da semana correspondente:");
			int semana = leia.nextInt();
			
			switch(semana){
				case 1:
					System.out.println("Domingo");
					break;
				case 2:
					System.out.println("Segunda");
					break;
				case 3:
					System.out.println("Ter�a");
					break;
				case 4:
					System.out.println("Quarta");
					break;
				case 5:
					System.out.println("Quinta");
					break;
				case 6:
					System.out.println("Sexta");
					break;
				case 7:
					System.out.println("Sabado");
					break;
				default: 
					System.out.println("N�o possui dia correspondente");
					break;
			}
		leia.close();
	}

}
