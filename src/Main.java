import InputMethods.*;
import TextMethods.*;

public class Main {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        new Greeting().greeting();
        userInput.nextLine();

        boolean isQuit = true;

        while (isQuit) {
            int answer = -1;
            new MainMenu().mainMenu();

            try {
                answer = userInput.nextInteger();
            } catch (ScannerException e) {
                System.err.println("Ошибка: " + e.getMessage());
                userInput.nextLine();
            } catch (AnswerException e) {
                System.err.println(e.getMessage());
            }

            if (answer == 1) {
                boolean isQuitMenu = true;
                while (isQuitMenu) {
                    int ans = -1;
                    new ChoiceToys().choiceToys();

                    try {
                        ans = userInput.nextInteger();
                    } catch (ScannerException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                        userInput.nextLine();
                    } catch (AnswerException e) {
                        System.err.println(e.getMessage());
                    }
                    if (ans == 0)
                        isQuitMenu = false;
                }
            }

            else if (answer == 0)
                new GoodBay().goodBay();
                isQuit = false;
        }
    }

}