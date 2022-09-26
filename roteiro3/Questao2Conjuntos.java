package roteiro3;

import java.util.Scanner;

public class Questao2Conjuntos {
	
	public static void main(String[] args){
		
		int i, j, iguais = 0, k = 0;
		String entrada;
		String[] numeros;
		Scanner sc = new Scanner(System.in);
		int[] A = new int[5], B = new int[5];
		
		entrada = sc.nextLine();
		numeros = entrada.split(" ");
		
		for(i = 0; i < numeros.length; i++){
			A[i] = Integer.parseInt(numeros[i]);	//Formacao do conjunto A
		}
		
		entrada = sc.nextLine();
		sc.close();
		numeros = entrada.split(" ");
		
		for(i = 0; i < numeros.length; i++){
			B[i] = Integer.parseInt(numeros[i]);	//Formacao do conjunto B
		}
		
		for(i = 0; i < A.length; i++){
			for(j = 0; j < B.length; j++){
				if(A[i] == B[j]){
					iguais++;						//Contagem de quantos elementos sao da interseccao
				}
			}
		}
		
		int[] C = new int[iguais];
		
		for(i = 0; i < A.length; i++){
			for(j = 0; j < B.length; j++){
				if(A[i] == B[j]){
					C[k] = A[i];
					k++;
				}
			}
		}
		
		for(i = 0; i < C.length; i++){
			System.out.print(C[i]);
			if(i != C.length - 1){
				System.out.print(" ");
			}
		}
	}
}
