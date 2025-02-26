package lv.rvt;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money addition) {
        if (addition.cents() + cents() > 99 ) {
            Money newMoney = new Money(addition.euros + euros() + 1, addition.cents() + cents() - 100);
            return newMoney;
        }
        else {
            Money newMoney = new Money(addition.euros + euros(), addition.cents() + cents());
            return newMoney;
        }
        
    }

    public boolean lessThan(Money compared) {
        if (euros() < compared.euros()) {
            return true;
        }
        if (euros() == compared.euros() && cents() < compared.cents()) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int newEuros = euros() - decreaser.euros();
        int newCents = cents() - decreaser.cents();
        if (newCents < 0) {
            newEuros--;
            newCents += 100;
        }
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }
        return new Money(newEuros, newCents);
    }

}
