package areaCirculo;

import java.util.Scanner;

public class tareaCirculo {
	public static void main(String[] arg) {
		Scanner Input = new Scanner (System.in);
		
		System.out.println("Ingrese el valor del radio");
		double radio = Input.nextDouble();
		
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El área del círculo es: " + area);
		
	}
}
