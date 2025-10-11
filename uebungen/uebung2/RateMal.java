/**
 * RateMal.java
 * Ein einfaches Konsolenprogramm, das ein Zahlenratespiel implementiert.
 * Der Benutzer kann entscheiden, ob er spielen möchte, und das Programm gibt Hinweise,
 * ob die geratene Zahl zu hoch oder zu niedrig ist.
 * 
 * @autor Felix Retzlaff
 * @datum 11.10.2025
 */

import java.util.Scanner;

public class RateMal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int benutzerEingabe = 0;

    System.out.println("Willkommen zu Rate Mal!");

    do {
      System.out.print("Möchtest du das Spiel spielen? (1 = ja, 0 = nein) > ");
      benutzerEingabe = scanner.nextInt();
      System.out.println(); // Leerzeile zur besseren Lesbarkeit

      switch (benutzerEingabe) {
        case 1:
          int meineZahl = (int) (100 * Math.random()) + 1; // Zufallszahl zwischen 1 und 100
          int versuch = 0; // Versuch des Benutzers
          int anzahlVersuche = 0; // Anzahl der Versuche
          System.out.println("Ich habe mir eine Zahl zwischen 1 und 100 ausgedacht. Kannst du sie erraten?");

          // Schleife, die so lange läuft, bis der Benutzer die Zahl errät
          do {
            System.out.print("Bitte gib deinen Tipp ein: ");
            versuch = scanner.nextInt();
            anzahlVersuche++; // Anzahl der Versuche erhöhen

            System.out.println("Versuch " + anzahlVersuche + ":");
            if (versuch < meineZahl) {
              System.out.println("Die gesuchte Zahl ist größer als " + versuch + ".");
            } else if (versuch > meineZahl) {
              System.out.println("Die gesuchte Zahl ist kleiner als " + versuch + ".");
            } else {
              System.out.println("Herzlichen Glückwunsch! Du hast die Zahl " + meineZahl + " in " + anzahlVersuche + " Versuchen erraten!");
            }
            System.out.println(); // Leerzeile zur besseren Lesbarkeit
          } while (versuch != meineZahl);
          break;

        case 0:
          System.out.println("Schade, vielleicht ein anderes Mal.");
          break;

        default:
          System.out.println("Ungültige Eingabe. Bitte 1 für ja oder 0 für nein eingeben.");
          break;
      }
    } while (benutzerEingabe != 0);

    scanner.close();

    // --- Kürzestes Lösungsbeispiel (automatisches Raten per Binärsuche) ---
    int min = 1;
    int max = 100;
    int versuch;
    int meineZahl = (int) (100 * Math.random()) + 1; // Zufallszahl zwischen 1 und 100

    while (true) {
      versuch = (min + max) / 2;
      System.out.println("Mein Tipp ist: " + versuch);

      if (versuch < meineZahl) {
        min = versuch + 1;
      } else if (versuch > meineZahl) {
        max = versuch - 1;
      } else {
        System.out.println("Ich habe die Zahl " + meineZahl + " erraten!");
        break;
      }
    }
  }
}
