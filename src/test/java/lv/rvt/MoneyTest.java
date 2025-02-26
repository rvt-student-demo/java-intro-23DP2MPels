package lv.rvt;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MoneyTest {

    @Test
    public void testScenario1() {
        Money money1 = new Money(1, 99);
        Money money2 = new Money(1, 99);
        Money money3 = money1.plus(money2);
        assertTrue(money3.euros() == 3);
        assertTrue(money3.cents() == 98);
    }

    @Test
    public void testScenario2() {
        Money money1 = new Money(3, 00);
        Money money2 = new Money(0, 99);
        Money money3 = money1.minus(money2);
        assertTrue(money3.euros() == 2);
        assertTrue(money3.cents() == 1);

    }

    @Test
    public void testScenario3() {
        Money money1 = new Money(1, 99);
        Money money2 = new Money(1, 99);
        boolean money3 = money1.lessThan(money2);
        assertTrue(money3 == false);
    }


}