package roteiro2;

import java.util.Scanner;

public class Questao1SelectionSort{
	
	public static void main(String[] args){
		
		int i, j, aux;
		String entrada;
		String[] valores;
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[15];
		
		entrada = sc.nextLine();
		sc.close();
		valores = entrada.split(" ");
		
		for(i = 0; i < valores.length; i++){
			numeros[i] = Integer.parseInt(valores[i]);
		}
		
		for(i = 0; i < valores.length; i++){
			for(j = i + 1; j < valores.length; j++){
				if(numeros[i] > numeros[j]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
			
			if(i != valores.length - 1){
				System.out.println("\n\nMenor elemento neste passo: " + numeros[i]);
				System.out.print("Estado Atual: ");
				for(j = 0; j < valores.length; j++){
					System.out.print(" " + numeros[j]);
					if(j != valores.length - 1){
						System.out.print(" |");
					}
				}
			}
		}
		
		System.out.print("\n\nResultado final:");
		for(i = 0; i < valores.length; i++){
			System.out.print(" " + numeros[i]);
			if(i != valores.length - 1){
				System.out.print(" |");
			}
		}
	}

}