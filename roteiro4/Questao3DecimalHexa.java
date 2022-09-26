package roteiro4;

import java.util.Scanner;

public class Questao3DecimalHexa {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] stack = new int[1000];
		int index = 0;
		boolean stop = false;
		while (!stop) {
			int r = n % 16;
			n /= 16;
			if (n >= 16) {
				stack[index++] = r;
			} else {
				stack[index++] = r;
				if (n != 0) {
					stack[index++] = n;
				}
				stop = true;
			}
		}
		String result = "";
		for (int i = index - 1; i >= 0; i--) {
			if (stack[i] < 10) {
				result += stack[i];
			} else {
				if (stack[i] == 10) {
					result += "A";
				} else if (stack[i] == 11) {
					result += "B";
				} else if (stack[i] == 12) {
					result += "C";
				} else if (stack[i] == 13) {
					result += "D";
				} else if (stack[i] == 14) {
					result += "E";
				} else if (stack[i] == 15) {
					result += "F";
				}
			}
		}
		System.out.println(result);
	}

}
