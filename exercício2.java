package VetorMatriz;

import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		float [] dado  = new float [10]; 
		float m;
		
		
	        for (int i=0; i<10; i++) {
			System.out.println("Entre com os lançamentos do vetor");
			dado[i]=entrada.nextFloat(); }
		
	        
	        for (int i=0;i<10;i++) {
	        System.out.println("\n"+dado[i]);
	        
	        }
	       
	        
	 m=(dado[0]+dado[1]+dado[2]+dado[3]+dado[4]+dado[5]+dado[6]+dado[7]+dado[8]+dado[9])/10 ;    
	 System.out.println("\n A média aritmética dos lançamentos é: " + m);  
	     
		

	}

}
