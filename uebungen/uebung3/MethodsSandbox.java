package uebungen.uebung3;
/**
 * Sandbox for first ex. with methods
 * @author Janett Mohnke 
 * @version 1.0 2023
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
    Toolbox.printnums(3, 5);

    // (3) Lesen Sie zwei float-Werte von der Konsole ein und rufen Sie die 
    //     Methode print aus der Klasse Toolbox auf! 
    //     Hinweis: Informieren Sie sich zunaechst in der JavaDoc über die 
    //     Klasse Float (Web-Suche: java api 21 Float)
    float fnum1 = 3.5f;
    float fnum2 = 5.7f;
    Toolbox.printfloats(fnum1, fnum2);

    // (4) Lesen Sie zwei Strings von der Konsole ein und rufen Sie die 
    //     Methode print aus der Klasse Toolbox auf!
    String str1 = "Hallo";
    String str2 = "Welt";
    Toolbox.printstrings(str1, str2);
  }
}
