package roteiro4;

import java.util.Arrays;
import java.util.Scanner;

public class Questao5FilaDeAtendimento {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] queue_with_p = new int[1000][2];
		int[][] queue_without_p = new int[1000][2];
		int head_with_p = 0, tail_with_p = 0;
		int head_without_p = 0, tail_without_p = 0;
		
		String input = scanner.nextLine();
		
		int count = 0;
		while (!input.equals("f")) {
			if (input.equals("a")) {
				String[] client = scanner.nextLine().split(" ");
				int id = Integer.parseInt(client[0]), age = Integer.parseInt(client[1]);
				if (age > 60) {
					queue_with_p[tail_with_p++] = new int[]{id, age};
				} else {
					queue_without_p[tail_without_p++] = new int[]{id, age};
				}
			} else if (input.equals("r")) {
				if (count < n) {
					if (head_with_p < tail_with_p) {
						head_with_p ++;
						count ++;
					} else {
						if (head_without_p < tail_without_p) {
							head_without_p ++;
						}
					}
				} else {
					if (head_without_p < tail_without_p) {
						head_without_p ++;
					}
					count = 0;
				}
			} else if (input.equals("i")) {
				System.out.println("fila de idosos:");
				if (head_with_p < tail_with_p) {
					for (int i = head_with_p; i < tail_with_p; i++) {
						System.out.println(String.format("ID: %d IDADE: %d", queue_with_p[i][0], queue_with_p[i][1]));
					}
				} else {
					System.out.println("fila vazia!");
				}
				
				System.out.println("fila de nao-idosos:");
				if (head_without_p < tail_without_p) {
					for (int i = head_without_p; i < tail_without_p; i++) {
						System.out.println(String.format("ID: %d IDADE: %d", queue_without_p[i][0], queue_without_p[i][1]));
					}
				} else {
					System.out.println("fila vazia!");
				}
				System.out.println("----------\n");
			}
			input = scanner.nextLine();
		}
	}
}