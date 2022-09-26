package roteiro4;

import java.util.Arrays;
import java.util.Scanner;

public class Questao4FilaBanco {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = input[0], m = input[1], k = input[2];
		int[] firstQueue = new int[n];
		int[] secondQueue = new int[m];
		int[] finalQueue = new int[n + m];
		int firstIndex = 0, secondIndex = 0, finalIndex = 0;
		for (int i = 0; i < n; i++) {
			firstQueue[i] = scanner.nextInt();
			scanner.nextLine();
		}
		for (int i = 0; i < m; i++) {
			secondQueue[i] = scanner.nextInt();
			scanner.nextLine();
		}
		if (k == 2) {
			while (firstIndex < n && secondIndex < m) {
				finalQueue[finalIndex++] = firstQueue[firstIndex++];
				finalQueue[finalIndex++] = secondQueue[secondIndex++];
			}
			
			while (firstIndex < n) {
				finalQueue[finalIndex++] = firstQueue[firstIndex++];
			}
			
			while (secondIndex < m) {
				finalQueue[finalIndex++] = secondQueue[secondIndex++];
			}
		} else {
			while (firstIndex < n && secondIndex < m) {
				finalQueue[finalIndex++] = secondQueue[secondIndex++];
				finalQueue[finalIndex++] = firstQueue[firstIndex++];
			}
			
			while (secondIndex < m) {
				finalQueue[finalIndex++] = secondQueue[secondIndex++];
			}
			
			while (firstIndex < n) {
				finalQueue[finalIndex++] = firstQueue[firstIndex++];
			}
		}
		for (int i = 0; i < finalQueue.length; i++) {
			System.out.println(finalQueue[i]);
		}
	}

}
