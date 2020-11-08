package com.cip.prog.mod3act5;

import java.lang.Math;
	
public class ejercicio7 {
	
	public static void main(String[] arg) {
		double media;
		
		System.out.println("El jugador 1 hace su lanzamiento:");
		int j1RandomNumber1 = (int) (Math.random()*6+1);
		System.out.println("Dado 1: " + j1RandomNumber1);
		int j1RandomNumber2 = (int) (Math.random()*6+1);
		System.out.println("Dado 2: " + j1RandomNumber2);
		
		System.out.println("El jugador 2 hace su lanzamiento:");
		int j2RandomNumber1 = (int) (Math.random()*6+1);
		System.out.println("Dado 1: " + j2RandomNumber1);
		int j2RandomNumber2 = (int) (Math.random()*6+1);
		System.out.println("Dado 2: " + j2RandomNumber2);
		
		int sumaJ1 = j1RandomNumber1 + j1RandomNumber2;
		int sumaJ2 = j2RandomNumber1 + j2RandomNumber2;
		int ganador = Math.max(sumaJ1, sumaJ2);
		System.out.println("La tirada más alta es " + ganador + ".");
		
		if (sumaJ1 > sumaJ2) {
			System.out.println("El ganador es el jugador 1.");
		}
		else {
			System.out.println("El ganador es el jugador 2.");
		}
		
		media = (sumaJ1 + sumaJ2) / 4;
		System.out.print("La media de los 4 dados es " + Math.round(media) + ".");
	}
}
