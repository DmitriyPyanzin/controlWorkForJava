import InputMethods.*;
import TextMethods.*;

public class AnswerMethod {

    public int answerMethod(int num) {
        if (num == -1)
            new MainMenu().mainMenu();

        else if (num == -2)
            new ChoiceToys().choiceToys();

        try {
            num = new UserInput().nextInteger();
        } catch (ScannerException e) {
            System.err.println("Ошибка: " + e.getMessage());
            new UserInput().nextLine();
        } catch (AnswerException e) {
            System.err.println(e.getMessage());
        }

        return num;
    }

}
