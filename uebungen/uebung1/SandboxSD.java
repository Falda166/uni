/**
 * Sandbox zum Experimentieren mit skalaren Datentypen
 *
 * @author Felix Retzlaff
 * @version 1.0 2025
 */
public class SandboxSD {

  public static void main(String[] args) {
    // (1) Legen Sie fuer jeden skalaren Datentypen eine Variable an, weisen
    // Sie einen Wert zu und geben Sie diesen auf der Konsole aus.

    // Ganzzahlen: byte, short, int, long
    byte beispielByte = 42;                  // sehr kleine ganze Zahl
    short beispielShort = 32000;             // etwas größere Zahl
    int beispielInt = 1_000_000;             // normale ganze Zahl
    long beispielLong = 9_000_000_000L;      // sehr große Zahl, L nötig
    System.out.println("byte: " + beispielByte);
    System.out.println("short: " + beispielShort);
    System.out.println("int: " + beispielInt);
    System.out.println("long: " + beispielLong);

    // Fließkommazahlen: float, double
    float beispielFloat = 3.14f;             // einfache Genauigkeit, f nötig
    double beispielDouble = 3.141592653589793; // hohe Genauigkeit
    System.out.println("float: " + beispielFloat);
    System.out.println("double: " + beispielDouble);

    // Wahrheitswert: boolean
    boolean beispielBoolean = true;          // wahr/falsch
    System.out.println("boolean: " + beispielBoolean);

    // Einzelnes Zeichen: char
    char beispielChar = 'X';                 // genau ein Zeichen
    System.out.println("char: " + beispielChar);

    // (2) Versuchen Sie, den Inhalt der verschiedenen Variablen einander 
    // zuzuweisen. Notieren Sie jeweils als Kommentar: Wo verwenden Sie
    // implizite Typkonvertierung? Wo verwenden Sie explizite Typkonvertierung?
    // Begruenden Sie jeweils.
    // Formulieren Sie insgesamt 5 verschiedene Beispiele.
    
    // 1) Implizite Typkonvertierung: byte -> int
    byte kleineZahl = 42;
    int grosseZahl = kleineZahl;
    // byte passt immer in einen int, kein Informationsverlust -> implizit

    // 2) Explizite Typkonvertierung: double -> float
    double piDouble = Math.PI;
    float piFloat = (float) piDouble;
    // double kann mehr stellen als float speichern -> Informationsverlust möglich deshalb explizit casten

    // 3) Implizite Typkonvertierung: int -> long
    int alter = 25;
    long langZahl = alter;
    // int passt in einen long ohne Datenverlust, kein Cast nötig

    // 4) Explizite Typkonvertierung: long -> int
    long sehrGross = 3_000_000_000L;
    int kleinInt = (int) sehrGross;
    // long kann größer sein als int, möglicherweise Overflow -> explizit casten

    // 5) Explizite Typkonvertierung: int -> char
    int ascii = 65;
    char buchstabe = (char) ascii;
    // int und char sind unterschiedlich -> casten nötig
        
    // (3) Ermitteln Sie die kleinste und die groesste Zahl, die in einer 
    // int-Variablen abgespeichert werden kann.
    // Hinweis: Mit Integer.MAX_VALUE bzw. Integer.MIN_VALUE erhalten Sie
    // diese Werte.
    // Was faellt Ihnen auf?

    int maxInt = Integer.MAX_VALUE;
    System.out.println("Groester int-wert: " + maxInt);

    int minInt = Integer.MIN_VALUE;
    System.out.println("Kleinster int-wert: " + minInt);

    /*Beobachtung
     * MAX_VALUE = 2_147_483_647
     * MIN_VALUE = -2_147_483_648
     * Auffällig: MIN_VALUE ist um 1 größer als MAX_VALUE,
     * da die negative Seite bei Zweierkomplement-Arithmetik einen Wert mehr hat.
     */

    // (4) Addieren Sie zur groessten int-Zahl 1 und geben Sie das Ergebnis
    // auf der Konsole aus. Welchen Wert hat Ihre Variable nun?

    System.out.println(maxInt + 1); // sie hat nun den kleinsten int wert da ein Overflow war
        
    // (5) Testen Sie nun eine andere Grenze: Ziehen Sie von der kleinsten 
    // int-Zahl 1 ab und ermitteln Sie den Wert.
    // Geben Sie das Ergebnis wieder auf der Konsole aus.

    System.out.println(minInt - 1); // Overflow aber andersherum und java macht daraus dann die größte int Zahl
        
        
    // (6) Betrachten Sie die nun folgenden Anweisungen.
    // Experimentieren Sie! Was passiert? Kommentieren Sie die
    // Anweisungen dafuer aus. Lassen Sie sich die Ergebnisse ggf.
    // ausgeben. Kommentieren Sie Ihre Beobachtungen.
    
        
    int counter = 100;            // Variable counter wird auf 100 gesetzt
    counter = counter + 1;        // Counter wird um 1 erhöht -> 101
    System.out.println(counter);
    counter += 20;                // Kurzschreibweise für counter = counter + 20 -> 121
    System.out.println(counter);
    counter++;                    // Post Inkrement: counter um 1 erhöhen -> 122
                                  // hier wird erst counter ausgegeben oder genutzt und dann erhöht
    System.out.println(counter);
    ++counter;                    // hier wird counter erst erhöht und dann ausgegeben daraufhin sieht man die änderung auch sofort
    System.out.println(counter);
    
    System.out.println(++counter);  // man sieht dass er +1 gemacht hat
    System.out.println(counter++);  // man sieht es nicht
    System.out.println(++counter);  // und hier sieht man es wieder
        
    // (7) Lesen Sie zunaechst die angegebene Literatur
    // zum Thema <Einfache Datentypen und deren Operationen> und 
    // experimentieren Sie dann. Hinweis: Lassen Sie sich die Ergebnisse
    // ausgeben. Kommentieren Sie Ihre Beobachtungen.
        
    // Ganzzahlige Division (int)
    int i1 = 7;
    int i2 = 2;
    int i3 = i1 / i2;   // Ergebnis ist 3, Rest wird abgeschnitten
    System.out.println("int-Division: " + i3); // Ausgabe: 3
    // Bei int-Division werden Nachkommastellen verworfen
    // 7/2=3.5 -> int speichert nur 3
     
    // Fließkommadivision (float)
    float f1 = 7.0f;
    float f2 = 2.0f;
    float f3 = f1 / f2;   // Ergebnis ist 3.5
    System.out.println("float-Division: " + f3); // Ausgabe: 3.5
    // bei float (oder double) bleibt der Dezimalwert erhalten
              
    // (8) Was ist das Problem? Korrigieren Sie, ohne
    // die Datentypen der Variablen zu aendern.
        
    int iValA = 25;
    int iValB = 10;
    // Problem: iValA/iValB ist int/int -> ganzzahlige Division, Ergebnis 2 statt 2.5
    float erg = ((float)iValA/iValB)*100; // Lösung: iValA explizit zu float casten, damit die Division als Fließkomma gerechnet wird
    System.out.println(erg);
  }

}
