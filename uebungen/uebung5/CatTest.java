/**
 * CatTest - P1 Uebung Klassen und Objekte
 * @author Retzlaff Felix
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatTest {

  public static void main(String[] args) {
    List<Cat> allCats = new ArrayList<>();

    allCats.addAll(Arrays.asList(new Cat("Hans", "Brot"), new Cat("Franz", "KA"), new Cat("Günter", "dasdasd")));

    for (Cat curCat : allCats) {
      System.out.println(curCat.getInformation());
    }
    //Geben Sie die aktuelle Anzahl von Cat-Objekten auf der Konsole aus:

    //Legen Sie zwei Cat-Objekte an und weisen Sie den Attributen 
    //sinnvolle Werte zu. 

    //Geben Sie nun wieder die aktuelle Anzahl von Cat-Objekten auf der Konsole aus:

    //Geben Sie mit Hilfe der Methode roar die Informationen zu beiden
    //Cat-Objekten auf der Konsole aus:
    
  }
}

/*
Sind Ihnen waehrend der Implementierung Schwachstellen/Fehlerquellen 
aufgefallen? Notieren Sie diese hier als Kommentar:
...

Arbeiten Sie nun mit ZooUI.java wie besprochen weiter. Notieren Sie hier 
weitere Schwachstellen/Fehlerquellen:
...
*/

