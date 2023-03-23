import java.util.ArrayList;
import java.util.Scanner;

public class Dinglemouse {
    public static int kookaCounter(final String laughing) {
        int count = 0;
        int i = 0;
        String machoEmbra = " ";
        ArrayList datos = new ArrayList<String>();

        if (laughing.equals("")) {
            return 0;
        }
        while (i < laughing.length()) {
            if (count < 2) {
                machoEmbra += laughing.charAt(i);
                count++;
                i++;
            } else {
                datos.add(machoEmbra);
                count = 0;
                machoEmbra = " ";
            }

        }
        int nAves = 0;
        i = 0;
        while (i < datos.size()) {
            if (i == 0) {
                nAves++;
            } else {
                if (!datos.get(i - 1).equals(datos.get(i))) {
                    nAves++;
                }
            }
            i++;
        }

        return nAves;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(kookaCounter(sc.nextLine()));
    }
}
