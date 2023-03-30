import InputMethods.*;
import TextMethods.*;
import Toys.ChangeLoss;
import Toys.ChangeQuantity;

public class Main {

    public static void main(String[] args) {

        new Greeting().greeting();
        new UserInput().nextLine();
        boolean isQuit = true;

        while (isQuit) {
            int answer = -1;
            answer = new AnswerMethod().answerMethod(answer);

            if (answer == 0) {
                new GoodBay().goodBay();
                isQuit = false;

            } else if (answer == 1) {
                boolean isQuitMainMenu = true;

                while (isQuitMainMenu) {
                    int ans = -2;
                    ans = new AnswerMethod().answerMethod(ans);

                    if (ans == 0)
                        isQuitMainMenu = false;

                    else {
                        boolean isQuitChoiceMenu = true;

                        while (isQuitChoiceMenu){
                            int ansChoice = -3;
                            new WorkingWithToys().workingWithToys(ans);

                            try {
                                ansChoice = new UserInput().nextIntegerChoice();
                            } catch (ScannerException e) {
                                System.err.println("Ошибка: " + e.getMessage());
                                new UserInput().nextLine();
                            } catch (AnswerException e) {
                                System.err.println(e.getMessage());
                            }

                            if (ansChoice == 0)
                                isQuitChoiceMenu = false;

                            else if (ansChoice == 1)
                                new ChangeQuantity().changeQuantity(ans);

                            else if (ansChoice == 2)
                                new ChangeLoss().changeLoss(ans);

                        }
                    }
                }

            } else if (answer == 2) {
                System.out.println("Здесь список игрушек на выдачу");

            } else if (answer == 3) {
                System.out.println("Здесь выдаем призовую игрушку");

            } else {
                System.out.println("Здесь смотрим список выданных игрушек");

            }
        }
    }

}