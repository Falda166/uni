/**
 * TestUI.java
 * Ein einfaches Konsolenprogramm, das ein Auswahlmenü anzeigt und
 * die Benutzereingabe verarbeitet.
 * 
 * @autor Felix Retzlaff
 * @datum 11.10.2025
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestUI {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Scanner zur Eingabe von der Konsole
    int input = 0; // Variable zur Speicherung der Benutzereingabe

    // Schleife, die das Menü anzeigt, bis der Benutzer 0 eingibt
    do {
      System.out.println("Willkommen zum Auswahlmenü!");
      System.out.println("Bitte wählen Sie eine der folgenden Optionen:");
      System.out.println("1. Option 1");
      System.out.println("2. Option 2");
      System.out.println("3. Option 3");
      System.out.println("4. Option 4");
      System.out.println("0. Beenden");
      System.out.print("Bitte wählen Sie eine Zahl zwischen 1 und 4>");

      boolean validInput = false;
      while (validInput == false) {
        try {
          input = scanner.nextInt();
          validInput = true; // Eingabe erfolgreich, Schleife verlassen
        } catch (InputMismatchException e) {
          System.out.println("Ungültige Eingabe. Bitte eine Zahl eingeben.");
          validInput = false; // Eingabe ungültig, Schleife fortsetzen
          scanner.next(); // Ungültigen Eingabepuffer leeren
        }
      }

      // Verarbeitung der Benutzereingabe
      switch (input) {
        case 0:
          System.out.println("Programm wird beendet.");
          break;
        case 1:
          System.out.println("Du hast die 1 gewählt.");
          break;
        case 2:
          System.out.println("Du hast die 2 gewählt.");
          break;
        case 3:
          System.out.println("Du hast die 3 gewählt.");
          break;
        case 4:
          System.out.println("Du hast die 4 gewählt.");
          break;
        default:
          System.out.println("Ungültige Auswahl. Bitte eine Zahl zwischen 1 und 5 eingeben.");
          break;
      }
      System.out.println(); // Leerzeile für bessere Lesbarkeit
    } while (input != 0);
    scanner.close(); // Scanner schließen, um Ressourcen freizugeben
  }
}