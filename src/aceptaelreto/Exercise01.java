package aceptaelreto;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Definition of the variables
		int n1;
		int n2;
		int n3;
		// Create Scanner object to read numbers from the console
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.println("Introduce el número 1: ");
        // Read the first house number
        n1 = sc.nextInt();
        // Ask the user to enter the number
        System.out.println("Introduce el número 2: ");
        // Read the second house number
        n2 = sc.nextInt();
        // Ask the user to enter el número 3: 
        System.out.println("Introduce el número 3: ");
        // Read the third house number
        n3 = sc.nextInt();

        // Print "DERECHA" if even and <=1000, "IZQUIERDA" if odd and <=1000, else "Número inválido"
        System.out.println(n1 > 1000 ? "Número inválido" : (n1 % 2 == 0 ? "DERECHA" : "IZQUIERDA"));
        System.out.println(n2 > 1000 ? "Número inválido" : (n2 % 2 == 0 ? "DERECHA" : "IZQUIERDA"));
        System.out.println(n3 > 1000 ? "Número inválido" : (n3 % 2 == 0 ? "DERECHA" : "IZQUIERDA"));

        // Close the Scanner
        sc.close();
	}

}
