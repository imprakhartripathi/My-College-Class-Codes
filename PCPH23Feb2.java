import java.util.InputMismatchException;
import java.util.Scanner;

public class PCPH23Feb2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name;
         try{
                name=ip.nextLine();
            }catch(InputMismatchException IME){
                System.out.println("Wrong Input");
                return;
            }
        ip.close();

        int[] charCounts = new int[256];

        for (char c : name.toCharArray()) {
            charCounts[c]++;
        }

        System.out.println("Character counts:");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] != 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
    }
}
