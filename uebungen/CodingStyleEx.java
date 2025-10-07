/**
 * Ein Beispiel zum Ueben der CodingStyles in Java
 * @author Janett Mohnke
 * @version 1.0 2023
 */
public class CodingStyleEx {
  public static void  main(String[] args) {
    int i = 21; 
    int j = 10;
    float f = 13.0f;
    String s1 = "A,"; 
    String s2 = "B,"; 
    String s3 = "C";  

    //Zunaechst ein Kinderlied:
    System.out.println( "WIR SINGEN:");
    System.out.println( s1 + s2 + s3 );
    System.out.println( "Die Katze lief im Schnee,");
    System.out.println( "Und als sie wieder nach Hause kam,");
    System.out.println( "Da hatt' sie weisse Stiefel an,");
    System.out.println( "O jemine, o jemine,");
    System.out.println( "Die Katze lief im Schnee.");
    
    //Nun eine kleine Addditionsaufgabe:
    System.out.println("\nWIR RECHNEN:");
    System.out.println( i + "+" + j + "=" + (i+j) );
    System.out.println( i + "-" + j + "=" + (i-j) );

    //Fazit:
    System.out.println("\nEGAL WAS:");
    System.out.println("Schoener programmieren lohnt sich!");
  }
}