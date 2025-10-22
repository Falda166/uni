/**
 * Diese Klasse enthaelt verschiedene statische Methoden zur
 * Demonstration von Methodenaufrufen.
 * @author Felix Retzlaff
 * @version 1.0 2025
 */
public class Toolbox {
    // Methode zum Ausgeben von zwei int-Werten
    public static void printnums(int a, int b) {
        System.out.println("Zahl 1: " + a);
        System.out.println("Zahl 2: " + b);
    }

    // Methode zum Ausgeben von zwei float-Werten
    public static void printfloats(float a, float b) {
        System.out.println("Zahl 1: " + a);
        System.out.println("Zahl 2: " + b);
    }

    // Methode zum Ausgeben von zwei Strings
    public static void printstrings(String a, String b) {
        System.out.println("String 1: " + a);
        System.out.println("String 2: " + b);
    }

    // Methode zur Berechnung der Laenge der Seite c im rechtwinkligen Dreieck
    public static double getLengthOfC(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    // Methode zur Addition von zwei int-Werten
    public static int plus(int x, int y) {
        return x + y;
    }

    // Methode zur Addition von zwei float-Werten
    public static float plus(float x, float y) {
        return x + y;
    }

    // Methode zur Verkettung von zwei Strings
    public static String plus(String x, String y) {
        return x + y;
    }

    // Methode zur Bestimmung der Anzahl der Ziffern einer positiven ganzen Zahl
    public static int getNumberOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
