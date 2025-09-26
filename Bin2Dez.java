public class Bin2Dez {
    // Function to convert the inserted string to an array
    public static int[] converter(String Bin) {
        // Checking if the string is 8 digits long
        if (Bin.length() > 8) {
            Bin = Bin.substring(0, 8);  // Trimming the string to 8 digits
        }

        int[] digits = new int[Bin.length()];   // Generating a new int[] variable
        for (int i = 0; i < Bin.length(); i++) {
            digits[i] = Character.getNumericValue(Bin.charAt(i));   // Inserting the values to the new int[] variable
        }

        return digits;  // Returning the generated array
    }

    // Function to do the math to turn the bin to a dezimal number
    public static int Bin2Dez(int[] Bin) {
        int[] Encoder = {1, 2, 4, 8, 16, 32, 64, 128};
        int Dez = 0;
        // Iterating through the Bin array
        for (int i = 0; i < Bin.length; i++) {
            if (Bin[i] == 1) {
                Dez = Dez + Encoder[i]; // Adding the Dez value up to generate the final number
            }
        }
        return Dez; // returning Dez
    }

    public static void main(String[] args) {
        System.out.print("Insert the Binary Number>");
        String DezString = System.console().readLine();

        int Dez = Bin2Dez(converter(DezString));    // This is the main part of the script

        System.out.println("The Dezimal number is: " + Dez);    // Printing out the final converted number
    }
}
