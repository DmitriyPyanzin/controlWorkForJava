package InputMethods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    private final Scanner sc = new Scanner(System.in);

    public int nextInteger() throws ScannerException, AnswerException {
        int num;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            throw new ScannerException("Вы ввели не число");
        }
        if (num < 0 || num > 4)
            throw new AnswerException("Команды " + num + " нет");

        return num;
    }

    public void nextLine() {
        sc.nextLine();

    }

}
