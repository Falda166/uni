/**
 * Einfacher Variablentausch (Dreieckstausch)
 * 
 * @author Felix Retzlaff
 * @version 1.0
 * @since 2025-10-07
 */

public class Swap {
  public static void main(String[] args) throws InterruptedException {
    // Drei Variablen mit Beispielwerten
    int a = 1;
    int b = 2;
    int c = 3;

    System.out.println("Vor dem Tausch: a=" + a + ", b=" + b + ", c=" + c);
    
    // Dreieckstausch: a -> b, b -> c, c -> a
    while (true) { 
      int temp = a;   // temporäre Variable speichert a
      a = b;          // a bekommt Wert von b
      b = c;          // b bekommt Wert von c
      c = temp;       // c bekommt ursprünglichen Wert von a

      System.out.print("\rNach dem Tausch: a=" + a + ", b=" + b + ", c=" + c);
      Thread.sleep(1000);
    }
  }
}
