public class zahlenRaten {
    public static int numberGuesser(int number) {
        int tipp = 0;
        int min = 1, max = 100;
        int versuche = 0;
        int oldnum = 0;
        while (tipp != number) {
            versuche++;
            oldnum = tipp;
            tipp = (min + max) / 2;
            System.out.println("trying " + tipp);
            if (oldnum == tipp) {
                tipp--;
                if (tipp == number) {
                    return versuche;
                } else {
                    tipp = tipp + 2;
                }
            }
            if (tipp == number) {
                return versuche;
            } else {
                if (tipp < number) {
                    min = tipp - 1;
                } else if (tipp > number) {
                    max = tipp + 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] triesList = new int[100];
        int tries;

        for (int i = 1; i<100; i++) {
            tries = numberGuesser(i);
            triesList[i] = tries;
            System.out.println(i + " found!\ntries: " + tries);
        }

        for (int i = 1; i<100; i++) {
            System.out.println(triesList[i]);
        }
        
    }
}