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

    public int nextIntegerChoice() throws ScannerException, AnswerException {
        int num;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            throw new ScannerException("Вы ввели не число");
        }
        if (num < 0 || num > 2)
            throw new AnswerException("Команды " + num + " нет");

        return num;
    }

    public int changeQuantity() throws ScannerException, NumberException, MaxToysException {
        int num;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            throw new ScannerException("Вы ввели не число");
        }
        if (num < 0)
            throw new NumberException("Число не может быть отрицательным");
        if (num > 25)
            throw new MaxToysException("Слишком много игрушек");

        return num;
    }

    public int changeLoss() throws ScannerException, NumberException, MaxToysException {
        int num;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            throw new ScannerException("Вы ввели не число");
        }
        if (num < 0)
            throw new NumberException("Число не может быть отрицательным");
        if (num > 100)
            throw new MaxToysException("Слишком большое число");

        return num;
    }


}
