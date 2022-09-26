package roteiro3;

import java.util.Scanner;

public class Questao3MatrizN {
	
	public static void main(String[] args){
		
		int n, i, j;
		Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Digite a ordem N da matriz:\n");
	    n = sc.nextInt();
	    
	    int[][] matriz = new int[n][n];
	    
	    for(i = 0; i < n; i++){
	        for(j = 0; j < n; j++){
	            if(i < j){
	                //matriz[i][j] = 10;
	                //System.out.print(matriz[i][j]);
	            	System.out.print("10     ");
	            }
	            else if(i > j){
	            	//matriz[i][j] = -10;
	                //System.out.print(matriz[i][j]);
	            	System.out.print("-10    ");
	            }
	            else{
	                //matriz[i][j] = 1;
	                //System.out.print(matriz[i][j]);
	            	System.out.print("1      ");
	            }
	        }
	        System.out.print("\n");
	    }
		
	}
}
