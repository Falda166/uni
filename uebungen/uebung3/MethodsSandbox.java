import java.util.Scanner;
/**
 * Eine Klasse zum Testen von Methodenaufrufen.
 * @author Felix Retzlaff
 * @version 1.0 2025
 */
public class MethodsSandbox {

  //Schreiben Sie eine Methode sayHelloUser(), die auf der Konsole ausgibt:
  // Los geht's!
  public static void sayHelloUser() {
    System.out.println("Los geht's!");
  }
  
  public static void main(String[] args) {
    // (1) Rufen Sie die Methode sayHelloUser() auf!
    sayHelloUser();
    // Nutzen Sie fuer die folgenden Aufgaben die Klasse BufferedReader 
    // (2) Lesen Sie zwei int-Werte von der Konsole ein und rufen Sie die 
    //     Methode print aus der Klasse Toolbox auf!
    int num1 = 3;
    int num2 = 5;
    Toolbox.printnums(num1, num2); // Aufruf der Methode printnums aus der Klasse Toolbox

    // (3) Lesen Sie zwei float-Werte von der Konsole ein und rufen Sie die 
    //     Methode print aus der Klasse Toolbox auf! 
    //     Hinweis: Informieren Sie sich zunaechst in der JavaDoc über die 
    //     Klasse Float (Web-Suche: java api 21 Float)
    float fnum1 = 3.5f;
    float fnum2 = 5.7f;
    Toolbox.printfloats(fnum1, fnum2); // Aufruf der Methode printfloats aus der Klasse Toolbox

    // (4) Lesen Sie zwei Strings von der Konsole ein und rufen Sie die 
    //     Methode print aus der Klasse Toolbox auf!
    String str1 = "Hallo";
    String str2 = "Welt";
    Toolbox.printstrings(str1, str2); // Aufruf der Methode printstrings aus der Klasse Toolbox

    Scanner sc = new Scanner(System.in); // Scanner zum Einlesen von Werten

    System.out.print("Gib die Seite a in cm ein: ");
    double a = sc.nextDouble();

    System.out.print("Gib die Seite b in cm ein: ");
    double b = sc.nextDouble();

    double c = Toolbox.getLengthOfC(a, b); // Aufruf der Methode getLengthOfC aus der Klasse Toolbox
    System.out.println("Die Laenge der Seite c ist: " + c + " cm");

    System.out.print("Gib die erste Zahl ein (int): ");
    int i1 = sc.nextInt();
    System.out.print("Gib die zweite Zahl ein (int): ");
    int i2 = sc.nextInt();
    int intSum = Toolbox.plus(i1, i2); // Aufruf der Methode plus aus der Klasse Toolbox
    System.out.println("Die Summe der beiden int-Zahlen ist: " + intSum);

    System.out.print("Gib die erste Zahl ein (float): ");
    float f1 = sc.nextInt();
    System.out.print("Gib die zweite Zahl ein (float): ");
    float f2 = sc.nextInt();
    float floatSum = Toolbox.plus(f1, f2); // Aufruf der Methode plus aus der Klasse Toolbox
    System.out.println("Die Summe der beiden float-Zahlen ist: " + floatSum);

    sc.nextLine();
    System.out.print("Gib den ersten String ein: ");
    String s1 = sc.nextLine();
    System.out.print("Gib den zweiten String ein: ");
    String s2 = sc.nextLine();
    String stringSum = Toolbox.plus(s1, s2); // Aufruf der Methode plus aus der Klasse Toolbox
    System.out.println("Die Verkettung der beiden Strings ist: " + stringSum);

    System.out.print("Gib eine positive ganze Zahl ein: ");
    int zahl = sc.nextInt();
    if (zahl > 0) {
      int digits = Toolbox.getNumberOfDigits(zahl); // Aufruf der Methode getNumberOfDigits aus der Klasse Toolbox
      System.out.println("Die Zahl " + zahl + " hat " + digits + " Stellen");
    } else {
      System.out.println("Die Zahl ist nicht positiv!");
    }
  }
}
