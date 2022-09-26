package roteiro1;

import java.util.Scanner;

public class Questao2OrdemCrescente {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, aux;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a > b) {
			aux = a;
			a = b;
			b = aux;
			
			if(b > c) {
				aux = b;
				b = c;
				c = aux;
				
				if(a > b) {
					aux = a;
					a = b;
					b = aux;
				}
			}
		}
		else {
			if(b > c) {
				aux = b;
				b = c;
				c = aux;
				
				if(a > b) {
					aux = a;
					a = b;
					b = aux;
				}
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
	}
}