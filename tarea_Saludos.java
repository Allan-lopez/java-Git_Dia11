package saludos_Nombre;

import java.util.Scanner;

public class tarea_Saludos {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("¿Cuál es tu nombre?");
		String nombre = input.nextLine();
		
		System.out.println("¿Cuantos años tienes?");
		int edad = input.nextInt();
		
		System.out.println("Hola " + nombre + " Me da gusto conocerte");
		
		

	}

}
