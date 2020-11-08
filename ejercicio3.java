package com.cip.prog.mod3act5;
	
import java.util.Scanner;
import java.lang.Math;
	
public class ejercicio3 {
	
	public static void main(String[] arg) {
		int num;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el primer número entero : ");
			num = sc.nextInt();
		System.out.print("Ingrese el segundo número entero : ");
			num2 = sc.nextInt();
		
		System.out.print("El número mas grande es : " + Math.max(num, num2));
		
		sc.close();
	}
}
