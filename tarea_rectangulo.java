package areaRectangulo;

import java.util.Scanner;

public class tarea_rectangulo {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de la base del rectagulo");
		float base = input.nextInt();
		
		System.out.println("Ingrese el valor de la altura del rectangulo");
		float altura = input.nextInt ();
		
		float area = base * altura;
		
		System.out.println("La area del rectangulo es:" + area);
	}
}
