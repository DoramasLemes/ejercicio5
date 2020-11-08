package com.cip.prog.mod3act5;
	
import java.util.Scanner;
import java.lang.Math;
	
public class ejercicio2 {
	
	public static void main(String[] arg) {
		double area;
		double radio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el radio del círculo : ");
			radio = sc.nextFloat();

		area = Math.PI * Math.pow(radio, 2);
		
		System.out.print("El área del circulo es : " + area);
		
		sc.close();
	}
}
