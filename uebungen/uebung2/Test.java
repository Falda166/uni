import java.io.*; //wird fuer die Eingabe benoetigt

/**
  * Programm, das eine int-Variable von der Standardeingabe liest.
  * PSE 1 - Telematik - TH Wildau
  * 
  * @author Janett Mohnke
  */
public class Test {
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
		  
		/*
		 * ... und nun sind Sie dran.  
		 */
		 System.out.println( "Sie haben eine " + zahl + " eingeben."); 
  }
}                           
