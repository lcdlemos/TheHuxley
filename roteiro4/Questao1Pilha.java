package roteiro4;

import java.util.Scanner;

public class Questao1Pilha {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			String[] stack = new String[1000];
			int index = 0;
			
			String[] input = scanner.nextLine().split(" ");
			while (!input[0].equals("Finalizar")) {
				if (input[0].equals("Empilhar")) {
					stack[index++] = input[1];
				} else if (input[0].equals("Desempilhar")) {
					index --;
				} else {
					String result = "";
					for (int i = index - 1; i >= 0; i--) {
						result += (i == 0) ? String.valueOf(stack[i]) : String.valueOf(stack[i]) + " ";
					}
					System.out.println(result);
				}
				input = scanner.nextLine().split(" ");
			}
		}
}
