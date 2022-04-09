//Q1	
package com.program;
import java.util.Scanner;

public class Program {
	 
	public static void main(String[] args) {
		System.out.println(" informe o valor :");
		Scanner scan = new Scanner ( System.in);
		
		double raio = scan.nextFloat();
		double area = Math.PI * raio * raio ;
		
		System.out.print("A ÁREA É :");
		System.out.print( String.format(" % .4f" , area));
}

}


//Q2
package q2_poo;
import java.text.DecimalFormat; import java.util.Scanner;

//import java.util.Scanner;

public class Program {


public static void main(String[] args)  {
		
		
		
		// ÁREA DAS FIGURAS GEOMÉTRICAS
		
		    @SuppressWarnings("resource")
			Scanner input = new Scanner( System.in ); 
		    	
			double a, b , c , pi;
			double triangulo , circulo , trapezio , quadrado , retangulo;
			
			pi = 3.14159;
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			
			triangulo = a * c / 2;
			circulo = pi * c * c;
			trapezio = ( a + b ) * c / 2;
			quadrado = b * b;
			retangulo = a * b;
			
		System.out.println( " a área do triângulo é : " + String.format( " %.3f ", triangulo));
		
		System.out.println( " a área do circulo é : " + String.format( " %.3f ", circulo));
		
		System.out.println( " a área do trapézio é : " + String.format( " %.3f ", trapezio));
		
		System.out.println( " a área do quadrado é : " + String.format( " %.3f ", quadrado));
		
		System.out.println( " a área do retângulo é : " + String.format( " %.3f ", retangulo));
	}
}

//Q3

package q3java;

public class Program {
public static void main(String[]args) {
	
	
 double a = 3;
 double b = 15;
 double c = 12;
 double delta, x1, x2 ;
 
 delta = Math.pow(b, 2.0) - 4*3*12;
 x1= (-15 + Math.sqrt(delta)) / (2.0 * 3);
 x2= (-15 - Math.sqrt(delta)) / (2.0 * 3);

 System.out.println("VALOR DE DELTA É: "+delta);
 System.out.println("VALOR DE X1 É: "+x1);
 System.out.println("VALOR DE X2 É: "+x2);
}
}

