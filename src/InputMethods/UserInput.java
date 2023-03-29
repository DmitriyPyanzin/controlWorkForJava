package InputMethods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    private final Scanner sc = new Scanner(System.in);

    public int nextInteger() throws ScannerException {
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            throw new ScannerException("Ошибка ввода параметра");
        }
    }

    public void nextLine() {
        sc.nextLine();

    }

}
