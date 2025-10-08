/**
 * Sandbox zum Experimentieren mit skalaren Datentypen
 *
 * @author Janett Mohnke
 * @version 1.0 2023
 */
public class U3_1 {
  public static void main(String[] args) {
    // Was ist hier das Problem? Korrigieren Sie, ohne die Datentypen zu aendern.
    if((0.2 + 0.2 + 0.2) == 0.6) {
      System.out.println("Alles klar!");
    } else {
      System.out.println("Nichts ist klar!");
    }
    System.out.println();

    // Bitoperationen: Experimentieren und erlaeutern Sie!
    byte a = 9;
    byte b = 3;
    System.out.println( a & b);
    System.out.println( a | b);
    System.out.println( a ^ b);
  }
}
