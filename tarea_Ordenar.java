package ordenNumeros;

import java.util.Scanner;

public class tarea_Ordenar {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número");
		int numero1 = input.nextInt();
		
		System.out.println("Ingrese el segundo número");
		int numero2 = input.nextInt();
		
		System.out.println("Ingrese el tercer número");
		int numero3 = input.nextInt();

		int mayor = numero1;
		int menor = numero1;
		
		if (numero2 > mayor) {
			mayor = numero2; 
		} 
		else if (numero2 < menor) {
			menor = numero2;
		}
		
		if (numero3 > mayor) {
			mayor = numero3;
		}
		else if (numero3 < menor){
			menor = numero3;
		}
		
		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);
	}
}
