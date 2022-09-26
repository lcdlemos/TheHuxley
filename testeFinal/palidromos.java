package testeFinal;

import java.util.Scanner;

public class palidromos {
	
	public static void main(String[] args){
		
		int i, j, contaAbre = 0, contaFecha = 0;
		boolean palid = true;
		String entrada, palavra = "";
		char[] letras, palindromo;
		Scanner sc = new Scanner(System.in);
				
		entrada = sc.nextLine();
		sc.close();
		
		letras = entrada.toCharArray();
		
		for(i = 0; i < letras.length; i++){
			if(letras[i] == '(') {
				contaAbre++;
			}
			else if(letras[i] == ')') {
				contaFecha++;
			}
			else{
				palavra += letras[i];
			}
		}
		
		palindromo = palavra.toCharArray();
		
		i = 0;
		j = palindromo.length - 1;
		
		while(i < j && palid) {
			palid = (palindromo[i] == palindromo[j]);
			i++;
			j--;
		}
		
		System.out.println("----");
		
		if(contaAbre == contaFecha){
			System.out.println("PARENTESES: BALANCEADOS");
		}
		else{
			System.out.println("PARENTESES: NAO BALANCEADOS");
		}
		
		if(palid){
			System.out.println("PALINDROMO: SIM");
		}
		else{
			System.out.println("PALINDROMO: NAO");
		}
		
		System.out.println("----");
		
	}
}