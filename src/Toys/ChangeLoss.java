package Toys;

import InputMethods.*;

public class ChangeLoss {

    public void changeLoss(int answer) {
        int num = 0;

        System.out.println("На сколько ты хочешь увеличить или уменьшить выигрыш для игрушек?");
        System.out.println("Помни, что ты не можешь добавить больше 100% и убавить ниже 0%: ");
        System.out.println("Для того, чтобы отнять %, необходимо ввести отрицательное число");

        try {
            num = new UserInput().changeLoss();
        } catch (ScannerException e) {
            System.err.println("Ошибка: " + e.getMessage());
            new UserInput().nextLine();
        } catch (NumberException | MaxToysException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        if (answer == 1) {
            if (new HagiVagi().getFrequencyOfLoss() + num < 0) {
                System.out.println("Слишком низкий шанс, нельзя убавить");
                new HagiVagi().changeLossToys(Math.abs(new HagiVagi().getFrequencyOfLoss() - num));
                System.out.println("Процент выигрыша стал " + new HagiVagi().getFrequencyOfLoss());


            } else if (new HagiVagi().getFrequencyOfLoss() + num > 100) {
                System.out.println("Слишком высокий шанс нельзя добавить, процент выиграша максимальный");
                new HagiVagi().changeLossToys(Math.abs(new HagiVagi().getFrequencyOfLoss() - num));
                System.out.println("Процент выигрыша стал " + new HagiVagi().getFrequencyOfLoss());

            } else {
                new HagiVagi().changeLossToys(num);
                System.out.println("Процент выигрыша стал " + new HagiVagi().getFrequencyOfLoss());

            }

        } else if (answer == 2) {
            if (new DonaldDuck().getFrequencyOfLoss() + num < 0) {
                System.out.println("Слишком низкий шанс, нельзя убавить");
                new DonaldDuck().changeLossToys(Math.abs(new DonaldDuck().getFrequencyOfLoss() - num));
                System.out.println("Процент выигрыша стал " + new DonaldDuck().getFrequencyOfLoss());

            } else if (new DonaldDuck().getFrequencyOfLoss() + num > 100) {
                System.out.println("Слишком высокий шанс нельзя добавить, процент выиграша максимальный");
                new DonaldDuck().changeLossToys(Math.abs(new DonaldDuck().getFrequencyOfLoss() - num));
                System.out.println("Процент выигрыша стал " + new DonaldDuck().getFrequencyOfLoss());

            } else {
                new DonaldDuck().changeLossToys(num);
                System.out.println("Процент выигрыша стал " + new DonaldDuck().getFrequencyOfLoss());

            }

        } else if (answer == 3) {
            if (new SponchBob().getFrequencyOfLoss() + num < 0) {
                System.out.println("Слишком низкий шанс, нельзя убавить");
                new SponchBob().changeLossToys(Math.abs(new SponchBob().getFrequencyOfLoss() - num));
                System.out.println("Процент выигрыша стал " + new SponchBob().getFrequencyOfLoss());

            } else if (new SponchBob().getFrequencyOfLoss() + num > 100) {
                System.out.println("Слишком высокий шанс нельзя добавить, процент выиграша максимальный");
                new SponchBob().changeLossToys(Math.abs(new SponchBob().getFrequencyOfLoss() - num));
                System.out.println("Процент выигрыша стал " + new SponchBob().getFrequencyOfLoss());

            } else {
                new SponchBob().changeLossToys(num);
                System.out.println("Процент выигрыша стал " + new SponchBob().getFrequencyOfLoss());

            }

        } else {
            if (new MickiMouse().getFrequencyOfLoss() + num < 0) {
                System.out.println("Слишком низкий шанс, нельзя убавить");
                new MickiMouse().changeLossToys(Math.abs(new MickiMouse().getFrequencyOfLoss() - num));
                System.out.println("Процент выигрыша стал " + new MickiMouse().getFrequencyOfLoss());

            } else if (new MickiMouse().getFrequencyOfLoss() + num > 100) {
                System.out.println("Слишком высокий шанс нельзя добавить, процент выиграша максимальный");
                new MickiMouse().changeLossToys(Math.abs(new MickiMouse().getFrequencyOfLoss() - num));
                System.out.println("Процент выигрыша стал " + new MickiMouse().getFrequencyOfLoss());

            } else {
                new MickiMouse().changeLossToys(num);
                System.out.println("Процент выигрыша стал " + new MickiMouse().getFrequencyOfLoss());

            }
        }
    }
}
