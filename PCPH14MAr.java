import java.util.Scanner;

public class PCPH14MAr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            String password = scanner.nextLine();

            if (isComplexEnough(password)) {
                System.out.println("Correct");
            } else {
                System.out.println("Too weak");
            }
    }

    public static boolean isComplexEnough(String password) {
        if (password.length() < 5) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        
        for (char ch : password.toCharArray()) {
            
                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                }
                else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                }
                else if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            
        }

        return hasUpperCase && hasLowerCase && hasDigit;
    }
}
