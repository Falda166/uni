import java.util.Scanner;

public class Bin2Dez {
    public static int[] converter(String Bin) {
        if (Bin.length() > 8) {
            Bin = Bin.substring(0, 8);
        }

        int[] digits = new int[Bin.length()];
        for (int i = 0; i < Bin.length(); i++) {
            digits[i] = Character.getNumericValue(Bin.charAt(i));
        }

        for (int d : digits) {
            System.out.print(d + " ");
        }

        return digits;
    }

    public static int Bin2Dez(int[] Bin) {
        int[] Encoder = {1, 2, 4, 8, 16, 32, 64, 128};
        int Dez = 0;
        for (int i = 0; i < Bin.length; i++) {
            System.out.println(Encoder[i]);
            if (Bin[i] == 1) {
                Dez = Dez + Encoder[i];
            }
        }
        return Dez;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the Binary Number>");
        String DezString = scanner.next();
        int Dez = Bin2Dez(converter(DezString));
        System.out.println(Dez);
    }
}
