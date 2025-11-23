import java.util.Scanner;

public class Rainfall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int zeroDays = 0;

        for (int day = 1; day <= 7; day++) {

            int input = -1;

            // Eingabe wiederholen, wenn negativ
            while (input < 0) {
                System.out.print("Regenmenge für Tag " + day + ": ");
                input = sc.nextInt();

                if (input < 0) {
                    System.out.println("Ungültig. Keine negativen Werte.");
                }
            }

            // Werte sammeln
            total += input;

            if (input < min) min = input;
            if (input > max) max = input;

            if (input == 0) zeroDays++;
        }

        double average = total / 7.0;

        System.out.println("\n--- Ergebnis ---");
        System.out.println("Gesamtregen: " + total + " mm");
        System.out.println("Durchschnitt pro Tag: " + average + " mm");
        System.out.println("Minimum: " + min + " mm");
        System.out.println("Maximum: " + max + " mm");
        System.out.println("Tage ohne Regen: " + zeroDays);
    }
}
