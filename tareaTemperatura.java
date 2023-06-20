package conversionTemp;

import java.util.Scanner;

public class tareaTemperatura {
	public static void main (String[] arg) {
		Scanner input = new Scanner (System.in);
		System.out.println("Ingrese la temperatura en grados centígrados");
		double centigrados = input.nextDouble();
		double fahrenheit = (centigrados * 9/5) + 32;
		
		System.out.println(centigrados + " grados centígrados es igual a " + fahrenheit + " grados Fahrenheit.");
	}

}
