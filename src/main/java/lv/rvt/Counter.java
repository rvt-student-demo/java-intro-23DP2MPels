package lv.rvt;

public class Counter {
    private int value;   // a variable that remembers the value of the counter

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void increase(int increaseBy) {
        if(increaseBy > 0) {
            this.value = value + increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if(decreaseBy > 0) {
            this.value = value - decreaseBy;
        }
    }
    
    public int value() {
        return this.value;
    }

    public void reset() {
            value = 0;
    }

}
