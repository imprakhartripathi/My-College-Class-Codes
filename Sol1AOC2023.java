import java.io.File;
import java.util.Scanner;

public class Sol1AOC2023 {

    public static int processString_1(String str) {
        // return 0;
        int n1 = 0, n2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                n1 = str.charAt(i) - 48;
                break;
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                n2 = str.charAt(i) - 48;
                break;
            }
        }

        return n1 * 10 + n2;
    }

    final static String[] numNames = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static int processString_2(String str) {
        // return 0;
        int n1 = 0, n2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                n1 = str.charAt(i) - 48;
                break;
            }
            boolean f = false;
            for (int j = 1; j < 10; j++) {
                if (str.substring(i, Math.min(i + numNames[j].length(), str.length())).equals(numNames[j])) {
                    n1 = j;
                    f = true;
                    break;
                }
            }
            if (f)
                break;
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                n2 = str.charAt(i) - 48;
                break;
            }
            boolean f = false;
            for (int j = 1; j < 10; j++) {
                if (str.substring(i, Math.min(i + numNames[j].length(), str.length())).equals(numNames[j])) {
                    n2 = j;
                    f = true;
                    break;
                }
            }
            if (f)
                break;
        }

        return n1 * 10 + n2;
    }

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("./in-01.txt"));
        } catch (Exception e) {
            System.out.println("bruh");
            return;
        }
        long res_1 = 0;
        long res_2 = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            res_1 += processString_1(line);
            res_2 += processString_2(line);
        }
        System.out.print("Result for Numerical Processing 1 : ");
        System.out.print(res_1 + "\n");
        System.out.print("Result for Numerical Processing 2 : ");
        System.out.print(res_2 + "\n");
        sc.close();
    }
}