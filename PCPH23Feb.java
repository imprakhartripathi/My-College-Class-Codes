import java.util.InputMismatchException;
import java.util.Scanner;

public class PCPH23Feb {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Your Name (type 'exit' to quit): ");
            String name;
            try{
                name=ip.nextLine();
            }catch(InputMismatchException IME){
                System.out.println("Wrong Input");
                return;
            }

            if (name.equalsIgnoreCase("exit") || name.equalsIgnoreCase("quit")) {
                break;
            }

            for (int i = 0; i < name.length(); i++) {
                char c = Character.toLowerCase(name.charAt(i));
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    System.out.print(name.charAt(i));
                }
            }
            System.out.println();
        }

        ip.close();
    }
}