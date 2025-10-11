import java.util.Scanner;

public class Interface {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    try {
      System.out.println("Menu");
      System.out.println("1");
      int inputInt = Integer.parseInt(input);
      System.out.println("Erfolgreich");
    } catch (NumberFormatException e) {
      System.err.println("Keine Zahl eingegeben!");
    }

    switch (inputInt) {
      case 1:
        System.out.println("Du hast die 1 gewählt.");
        break;
      case 2:
        System.out.println("Du hast die 2 gewählt.");
        break;
      case 3:
        System.out.println("Du hast die 3 gewählt.");
        break;
      case 4:
        System.out.println("Du hast die 4 gewählt.");
        break;
      case 5:
        System.out.println("Du hast die 5 gewählt.");
        break;
    }
  }
}