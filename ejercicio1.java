package com.cip.prog.mod3act5;
	
import java.util.Scanner;
import java.lang.Math;
	
public class ejercicio1 {
	
	public static void main(String[] arg) {
		double altura;
		double altura2;
		double peso;
		double IMC;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese su peso en kilogramos : ");
			peso = sc.nextFloat();
		
		System.out.print("Ingrese su altura en metros : ");
			altura = sc.nextFloat();
		
		altura2 = Math.pow(altura, 2);
		IMC = peso / altura2;
		
		if (IMC < 18.5) {
			System.out.print("Su IMC es : " + IMC + " tiene un peso insuficiente");
		}//termina el if
		else if (IMC > 18.5 & IMC < 24.9){
			System.out.print("Su IMC es : " + IMC + " tiene un peso normal");
		}//termina el elseif
		else if (IMC > 25 & IMC < 26.9){
			System.out.print("Su IMC es : " + IMC + " tiene un Sobrepeso grado I");
		}
		else if (IMC > 27 & IMC < 29.9){
			System.out.print("Su IMC es : " + IMC + " tiene un Sobrepeso grado II(preobecidad)");
		}
		else if (IMC > 30 & IMC < 34.9){
			System.out.print("Su IMC es : " + IMC + " tiene una Obesidad de tipo I");
		}
		else if (IMC > 35 & IMC < 39.9){
			System.out.print("Su IMC es : " + IMC + " tiene una Obesidad de tipo II");
		}
		else if (IMC > 40 & IMC < 49.9){
			System.out.print("Su IMC es : " + IMC + " tiene una Obesidad de tipo III (mórbida)");
		}
		else {
			System.out.print("Su IMC es : " + IMC + " tiene una Obesidad de tipo IV (extrema)");
		}
		sc.close();
	}
}
