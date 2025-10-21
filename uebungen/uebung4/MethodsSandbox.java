import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Sandbox for first ex. with methods
 * @author Janett Mohnke 
 * @version 1.0 2023
 */
public class MethodsSandbox {

  //Schreiben Sie eine Methode sayHelloUser(), die auf der Konsole ausgibt:
  // Los geht's!
  static void sayHelloUser() {
    System.out.println("Los geht's");
  }
  
  public static void main(String[] args) throws IOException {
    // (1) Rufen Sie die Methode sayHelloUser() auf!
    sayHelloUser();

    // Nutzen Sie fuer die folgenden Aufgaben die Klasse BufferedReader 
    // (2) Lesen Sie zwei int-Werte von der Konsole ein und rufen Sie die 
    //     Methode print aus der Klasse Toolbox auf!
    int num1;
    int num2;
		BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Bitte geben Sie eine ganze Zahl1 ein: ");  
		num1 = Integer.parseInt(din.readLine());		
    System.out.println("Bitte geben Sie eine ganze Zahl1 ein: ");
    num2 = Integer.parseInt(din.readLine());

    Toolbox.printNums(num1, num2);

    // (3) Lesen Sie zwei float-Werte von der Konsole ein und rufen Sie die 
    //     Methode print aus der Klasse Toolbox auf! 
    //     Hinweis: Informieren Sie sich zunaechst in der JavaDoc über die 
    //     Klasse Float (Web-Suche: java api 21 Float)
    float float1 = 1.111f;
    float float2 = 1.2323f;

    Toolbox.printNums((int) float1, (int) float2);

    // (4) Lesen Sie zwei Strings von der Konsole ein und rufen Sie die 
    //     Methode print aus der Klasse Toolbox auf!
    Toolbox.printNums("eddads", "rggwrwgr");

  }
  
}
