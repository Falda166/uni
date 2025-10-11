import java.io.*; //wird fuer die Eingabe benoetigt

/**
  * Programm, das eine int-Variable von der Standardeingabe liest.
  * P1 - Telematik - TH Wildau
  * 
  * @author Janett Mohnke
  * @version 1.0 2023
  */
public class U3_3 {
  public static void main(String[] args) 
  throws IOException //wird fuer die Methode Integer.parseInt() benoetigt
  {    
		/*
		 * Die folgenden Zeilen fordern den Nutzer des Programms auf,
		 * eine Zahl einzugeben.
		 * Die Eingabe wird in der int-Variablen zahl gespeichert
		 * und kann von Ihnen verarbeitet werden.
		 * Hinweis: Sie muessen diesen Code jetzt noch nicht verstehen. 
		 */
		int zahl;
		BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
		// Wenn Sie die folgenden zwei Zeilen wiederholen,
		// koennen Sie auch mehrere Zahlen einlesen.
		System.out.print( "Bitte geben Sie eine ganze Zahl ein: ");  
		zahl = Integer.parseInt(din.readLine());		
		
		System.out.println( "Sie haben eine " + zahl + " eingeben."); 

		/*
		 * ... und nun sind Sie dran.  
		 * Aufgabe 1:
		 */

		//Lesen Sie zwei ganze Zahlen von der Konsole ein.
		int zahl1 = Integer.parseInt(din.readLine());
    int zahl2 = Integer.parseInt(din.readLine());
		int max;

		System.out.println(zahl1 + " & " + zahl2);

		//Schreiben Sie nun die Anweisungen, die den Wert der groesseren int-Variablen
    //bestimmt und in einer int-Variablen max abspeichert.

		if (zahl1 == zahl2) {
			System.out.println("Sind gleichgross...");
		}	else if (zahl1 > zahl2) {
				System.out.println(zahl1 + " ist größer!");
				max = zahl1;
			} else {
				System.out.println(zahl2 + " ist größer!");
				max = zahl2;
			}

		/*
		 *	Aufgabe 2:
		 */

		//Echo: Implementieren Sie eine do-While-Schleife, in der solange Strings
		//von der Konsole einleseen und wieder ausgeben, bis eine 0 eingegeben wird.
		int zahl3;
		do {
			zahl3 = Integer.parseInt(din.readLine());
		} while (zahl3 != 0);
		System.out.println("Ende im gelände".repeat(100));
  }
}                           
