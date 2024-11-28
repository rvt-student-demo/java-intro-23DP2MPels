package lv.rvt;

public class Timer {
    private ClockHand HundredSeconds;
    private ClockHand seconds;

    public Timer() {
        this.HundredSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.HundredSeconds.advance();

        if (this.HundredSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + HundredSeconds;
    }
}
