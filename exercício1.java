package VetorMatriz;

import java.util.Scanner;

public class exercício1 {

	public static void main(String[] args)
	{ 
		Scanner entrada = new Scanner(System.in);
		float[] nota = new float [5];
		
		
		for (int i = 0; i<5; i++) {
			System.out.println("Entre com uma nota");
			nota[i]=entrada.nextFloat();
			
		}
		
		for (int i=0;i<5;i++)
		{
			System.out.println("Nota"+i+1+"="+nota[i]);
		}
		
		double max = nota[0];
	    for (int i = 1; i < nota.length; i++) {
	       if (nota[i] > max) 
	      	 max = nota[i];
	    }

	System.out.println("Maximo nota é " + max);
		
		

	}

}
