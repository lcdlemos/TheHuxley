package roteiro2;

import java.util.Scanner;

public class Questao2InsertionSort {
	
	public static void main(String[] args){
		
		int i, j, k, chave;
		String sequencia;
		String[] valores;
		Scanner sc = new Scanner(System.in);
		int[] entrada = new int[500], saida = new int[500];
		
		sequencia = sc.nextLine();
		sc.close();
		valores = sequencia.split(" ");
		
		for(i = 0; i < valores.length; i++){
			entrada[i] = Integer.parseInt(valores[i]);
		}
		
		saida = entrada;
		
		for(j = 1; j < valores.length; j++){
			
			chave = entrada[j];
			i = j - 1;
			
			System.out.println("\n\nChave: " + chave);
			System.out.print("Estado Atual:");
			for(k = 0; k < valores.length; k++){
				System.out.print(" " + entrada[k]);
				if(k != valores.length - 1){
					System.out.print(" |");
				}
			}
			
			while((i >= 0) && (chave < saida[i])){
				saida[i+1] = saida[i];
				saida[i] = chave;
				i--;
				
				System.out.print("\n");
				for(k = 0; k < valores.length; k++){
					System.out.print(saida[k]);
					if(k != valores.length - 1){
						System.out.print(" | ");
					}
				}
			}
			
			saida[i+1] = chave;
		}
		
		System.out.print("\n\nResultado Final:");
		for(i = 0; i < valores.length; i++){
			System.out.print(" " + saida[i]);
			if(i != valores.length - 1){
				System.out.print(" |");
			}
		}
	}
}