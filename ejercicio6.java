package com.cip.prog.mod3act5;
	
import java.util.Scanner;
import java.lang.Math;
	
public class ejercicio6 {
	
	public static void main(String[] arg) {
		double num;
		double num2;
		double division;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el primer número entero : ");
			num = sc.nextDouble();
		System.out.print("Ingrese el segundo número entero : ");
			num2 = sc.nextDouble();
			
		division = num / num2;
		
		System.out.print("Los decimales de la division son : " + String.format("%.2f", division));
		
		sc.close();
	}
}
