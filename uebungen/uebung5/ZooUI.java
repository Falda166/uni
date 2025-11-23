
import java.io.*;

/**
 * ZooUI - ein vereinfachtes UI fur die Zoo-Anwendung Hinweis: Anders, als in
 * der Vorlesung besprochen, enthaelt dieses UI noch die main-Methode und wir
 * verzichten auf die Klassen Zoo und WildAnimalTester.
 *
 * P1 - Telematik - TH Wildau
 *
 * @author Janett Mohnke
 * @version 1.0
 */
public class ZooUI {

  public static void main(String args[]) throws IOException {
    int input;
    BufferedReader din = new BufferedReader(new InputStreamReader(System.in));

    //Zunaechst muessen die Tier-Objekte erzeugt werden und jedes angelegte
    //Objekt gezaehlt werden.
    Monkey ersterAffe;
    ersterAffe = new Monkey();
    ersterAffe.name = "Otto";
    ersterAffe.favoriteFood = "Bananen";
    Monkey.addAMonkey();

    Monkey zweiterAffe;
    zweiterAffe = new Monkey();
    zweiterAffe.name = "Paula";
    zweiterAffe.favoriteFood = "Gurken";
    Monkey.addAMonkey();

    Cat ersteKatze;
    ersteKatze = new Cat();
    ersteKatze.name = "Egon";
    ersteKatze.favoriteFood = "Maeuse";
    Cat.addACat();

    do { //Hauptschleife
      printMenue();
      input = Integer.parseInt(din.readLine());
      switch (input) {
        case 1:
          //Lassen Sie die Affen bruellen und geben Sie Informationen ueber sie aus.
          System.out.println(ersterAffe.roar());
          System.out.println(zweiterAffe.roar());

          if (Monkey.getNumber() == 1) {
            System.out.println("Im Tierpark lebt 1 Affe.");
          } else {
            System.out.println("Im Tierpark leben "
                    + Monkey.getNumber() + " Affen.");
          }
          break;
        case 2:
          //Lassen Sie die Katzen bruellen und geben Sie Informationen ueber sie aus.
          System.out.println(ersteKatze.roar());

          if (Cat.getNumber() == 1) {
            System.out.println("Im Tierpark lebt 1 Katze.");
          } else {
            System.out.println("Im Tierpark leben "
                    + Cat.getNumber() + " Katzen.");
          }
          break;
        case 3:
          //Lassen Sie die Loewen bruellen und geben Sie Informationen ueber sie aus.
          System.out.println("Im Tierpark leben keine Loewen.");
          break;
        case 4:
          //Lassen Sie die Baeren bruellen und geben Sie Informationen ueber sie aus.
          System.out.println("Im Tierpark leben keine  Baeren.");
          break;
      }
    } while (input != 0);
    System.out.println("Bis zum naechsten Mal!");
  }

  private static void printMenue() {
    System.out.println("\nWaehlen Sie ein Tier aus:");
    System.out.println();
    System.out.println(" 1 Affe");
    System.out.println(" 2 Katze");
    System.out.println(" 3 Loewe");
    System.out.println(" 4 Baer");
    System.out.println(" 0 Das Programm wird beendet");
    System.out.println();
    System.out.println("Bitte waehlen Sie nun aus! ");
  }

}
