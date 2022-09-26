package roteiro1;

import java.util.Scanner;

public class Questao1TresN2 {
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String entrada;
		String[] valores;
		int valor1Antes, valor2Antes, valor1, valor2, aux, i, ciclo, maiorCiclo;
		
		do{
			entrada = sc.nextLine();
			valores = entrada.split(" ");
			valor1 = Integer.parseInt(valores[0]);
			valor2 = Integer.parseInt(valores[1]);
			
			valor1Antes = valor1;
			valor2Antes = valor2;
			
			maiorCiclo = 0;
			
			if(valor1 > valor2) {
				aux = valor1;
				valor1 = valor2;
				valor2 = aux;
			}
			
			for(i = valor1; i <= valor2; i++) {
				
				aux = i;
				
				for(ciclo = 1; aux != 1; ciclo++) {
					
					if(aux%2 == 0) {
						aux = aux/2;
					}
					else {
						aux = 3*aux + 1;
					}
				}
				if(ciclo > maiorCiclo) {
					maiorCiclo = ciclo;
				}
			}
			System.out.println(valor1Antes + " " + valor2Antes + " " + maiorCiclo);
		}while(sc.hasNextLine());
	sc.close();
	}
}
