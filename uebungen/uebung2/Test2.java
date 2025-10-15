import java.util.Scanner; //wird fuer die Eingabe benoetigt

/**
 * Programm, das eine int-Variable von der Standardeingabe liest. 
 * ++++ VARIANTE 2 +++++ 
 * PSE 1 - Telematik - TH Wildau
 *
 * @author    Janett Mohnke
 * @version   1.0 2013
 */
public class Test2 {

  public static void main(String[] args) {

    /*
     * Die folgenden Zeilen fordern den Nutzer des Programms auf,
     * eine Zahl einzugeben.
     * Die Eingabe wird in der int-Variablen zahl gespeichert
     * und kann von Ihnen verarbeitet werden.
     * Hinweis: Sie muessen diesen Code jetzt noch nicht verstehen. 
     */
     int zahl;
     Scanner scanner = new Scanner(System.in);
        
     // Wenn Sie die folgenden zwei Zeilen wiederholen,
     // koennen Sie auch mehrere Zahlen einlesen.
     System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
     zahl = scanner.nextInt();
 
     /*
      * ... Ausgabe:  
      */
     System.out.println("Sie haben eine " + zahl + " eingeben.");     
  }
} 
