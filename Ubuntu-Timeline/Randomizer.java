import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Randomizer{
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println();
            long randomnumber = random.nextLong(999999999);
            System.out.print(randomnumber + " ");
        System.out.println();
    }
}