/**
 * Sandbox zum Experimentieren mit skalaren Datentypen
 *
 * @author Janett Mohnke
 * @version 1.0 2023
 */
public class U3_1 {
  public static void main(String[] args) {
    // Was ist hier das Problem? Korrigieren Sie, ohne die Datentypen zu aendern.
    if(Math.abs((0.2 + 0.2 + 0.2) - 0.6) < 0.1) {
      System.out.println("Alles klar!");
    } else {
      System.out.println("Nichts ist klar!");
    }
    System.out.println();

    // Bitoperationen: Experimentieren und erlaeutern Sie!
    byte a = 9; // 1001
    byte b = 3; // 0011
    System.out.println( a & b); // vergleicht ob beide stellen gleich sind  and
    System.out.println( a | b); // vergleicht ob eine stelle 1 ist von beiden or
    System.out.println( a ^ b); // vergleicht ob es ungleich ist  xor
  }
}
