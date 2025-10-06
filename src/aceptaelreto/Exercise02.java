package aceptaelreto;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        // Definition of the variables
        int t;
        int i;
        String word;
        try (// Create a Scanner object to read from console
        Scanner sc = new Scanner(System.in)) {
        	// Ask the user for the number of test cases
            System.out.println("Introduce el número de casos de prueba a procesar: ");
            // Read the number of test cases
            t = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            // Create an array to store the results
            String[] results = new String[t];

            // Loop through each test case using the value of t
            for (i = 0; i < t; i++) {
            	// Ask the user to enter a word
                System.out.println("Introduce una palabra: ");
                // Read the next word
                word = sc.nextLine();
                // Store "Bien" if word is "colgadas" ignoring case, else "Mal"
                results[i] = word.equalsIgnoreCase("colgadas") ? "Bien" : "Mal";
            }

            // After reading all words, print all results
            for (i = 0; i < t; i++) {
            	// Display the results
                System.out.println(results[i]);
            }

        }
    }
}
