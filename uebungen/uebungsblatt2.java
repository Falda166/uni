/**
 * Programmierung 1: Uebungsblatt 2
 * @author Felix Retzlaff
 * @version 1.0
 * @since 2025-10-07
 */

public class uebungsblatt2 {
  public static void main(String[] args) {
    // Anzahl der Einwohner in Deutschland, ganze Zahl, reicht für int da es bis 2 Mrd geht
    int einwohnerDeutschland = 84100000;

    // Anzahl der Menschen auf der Welt, Größer als 2 Mrd deshalb long nötig
    long weltbevoelkerung = 8250423613L;

    // Hat nur 2 zustände, ob es gerade Tag ist oder nicht deshalb boolean
    boolean tag = true | false;

    // Anzahl der Semester im Studium eine kleine ganze zahl deswegen byte
    byte anzahlSemester = 6;

    // Der Anfangsbuchstabe meines Nachnamens, genau ein zeichen deshalb ein char
    char anfangNachname = 'R';

    // Wahrscheinlichkeit für Schnee an Weihnachten, Dezimalzahl daher double
    double wahrscheinlichkeitSchnee = 0.25;

    // Kreiszahl Pi, hier als float für einfache genauigkeit
    float pi = 3.1415926536f; // oder

    // und hier als double für eine noch genauere darstellung und mit Math.PI
    double piDouble = Math.PI;
  }
}