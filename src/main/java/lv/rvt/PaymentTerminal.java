package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals = 0; // number of sold affordable meals
    private int heartyMeals = 0;  // number of sold hearty meals

    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        double give_back = 0;
        if (payment >= 2.5) {
            money = money + 2.5;
            if (payment > 2.5) {
                give_back = payment - 2.5;
            }
            else {
                give_back = 0;
            }
            affordableMeals = affordableMeals + 1;
            return give_back;
        }
        else {
            return payment;
        }
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public double eatHeartily(double payment) {
        double give_back = 0;
        if (payment >= 4.3) {
            money = money + 4.3;
            if (payment > 4.3) {
                give_back = payment - 4.3;
            }
            else {
                give_back = 0;
            }
            heartyMeals = heartyMeals + 1;
            return give_back;
        }
        else {
            return payment;
        }
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public boolean eatAffordably(PaymentCard card) {

        if (card.takeMoney(2.5) == true) {
            affordableMeals = affordableMeals + 1;
            return true;
        }
        else {
            return false;
        }

        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public boolean eatHeartily(PaymentCard card) {

        if (card.takeMoney(4.3) == true) {
            heartyMeals = heartyMeals + 1;
            return true;
        }
        else {
            return false;
        }

        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        money += sum;
        card.addMoney(sum);
    }

    public void addMoneyToCard(PaymentCard card, int sum) {
        money += sum;
        card.addMoney(sum);
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
