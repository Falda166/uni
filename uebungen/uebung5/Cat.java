/**
 * Klasse Cat (P1 Uebung "Klassen und Objekte")
 * @author Ihr Name
 * @version 1.0 2023
 */
public class Cat {
  private static int numberOfCats = 0;
  private String name;
  private String favoriteFood;

  Cat(String name, String favoriteFood) {
    this.name = name;
    this.favoriteFood = favoriteFood;
    this.numberOfCats++;
  }

  String getInformation() {
    return this.name + " eats " + this.favoriteFood;
  }
}
