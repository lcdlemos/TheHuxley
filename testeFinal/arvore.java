package testeFinal;

import java.util.Scanner;

public class arvore {
	
public static void main(String[] args){
		
		int i, contaFundo = 0, profundidade = 0;
		boolean existe = false;
		String entrada, teste = "", valor;
		char[] arvore;
		Scanner sc = new Scanner(System.in);
				
		entrada = sc.nextLine();		
		
		arvore = entrada.toCharArray();
		
		entrada = sc.nextLine();
		
		valor = entrada;
		
		sc.close();
		
		for(i = 0; i < arvore.length; i++){
			if(arvore[i] == '(') {
				contaFundo++;
				if(!teste.equals("")){
					if(teste.equals(valor)) {
						existe = true;
						teste = "";
						break;
					}
					else {
						existe = false;
						teste = "";
					}
				}
			}
			else if(arvore[i] == ')') {
				contaFundo--;
				if(!teste.equals("")){
					if(teste.equals(valor)) {
						existe = true;
						teste = "";
						break;
					}
					else {
						existe = false;
						teste = "";
					}
				}
			}
			else{
				teste += arvore[i];
			}
			
			if(contaFundo > profundidade) {
				profundidade = contaFundo;
			}
			
		}
		
		if(existe) {
			System.out.println("ESTA NA ARVORE");
			System.out.println(profundidade - 1);
		}
		else {
			System.out.println("NAO ESTA NA ARVORE");
		}
				
	}
}