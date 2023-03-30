import InputMethods.*;
import TextMethods.*;
import Toys.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        new Greeting().greeting();
        new UserInput().nextLine();
        boolean isQuit = true;
        ArrayList<String> listOfToys = new ArrayList<>();

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

                            else if (ansChoice == 3)
                                new Raffle().raffle(listOfToys, ans);

                        }
                    }
                }

            } else if (answer == 2) {
                if (listOfToys.size() == 0)
                    System.out.println("\nИгрушек нет в списке на выдачу\n");
                else {
                    for (String listOfToy : listOfToys) {
                        System.out.println(listOfToy);
                    }
                    System.out.println();
                }

            } else if (answer == 3) {
                if (listOfToys.size() == 0)
                    System.out.println("\nИгрушек нет в списке на выдачу\n");
                else {
                    try (FileWriter writer = new FileWriter("listToys.txt", true))
                    {
                        writer.write(listOfToys.get(0));
                        writer.append("\n");
                        writer.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    listOfToys.remove(0);
                    System.out.println("\nИгрушку отдали победителю!\n");
                }

            } else {
                try(FileReader reader = new FileReader("listToys.txt"))
                {
                    int c;
                    while ((c=reader.read()) !=-1 ){
                        System.out.print((char) c);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            }
        }
    }

}