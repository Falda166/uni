/**
 * Sandbox zum Experimentieren mit Kontrollstrukturen
 *
 * @author Janett Mohnke
 * @version 1.0 2023
 */
public class U3_2 {
  public static void main(String[] args) {
    //Implementieren Sie eine while-Schleife, die 5x "Hallo!" auf der Konsole
    //ausgibt!
    int i = 0;
    while (i < 5) {
      System.out.println("Hallo");
      i++;
    }

    //Nutzen Sie eine for-Schleife, um einen Countdown auf der Konsole 
    //auszugeben, der von 20 abwaerts bis 0 zaehlt und das Programm dann 
    //mit dem Ausruf Fertig! beendet.

    for (int j = 1; j <= 20; j++) {
      System.out.println(j);
    }
    System.out.println("Fertig!");
  }
}
