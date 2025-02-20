package lv.rvt;
import java.util.Scanner;

import lv.rvt.Packable;
import lv.rvt.StatisticsInterface;

public class Statistics implements StatisticsInterface{

    @Override
    public double minValue() {

    }

    @Override
    public double minValue() {

    }

    @Override
    public double averageValue() { 
    
    }
    
}












/*
public class Statistics {
    private int count = 0;
    private int sum = 0;
    private int odd , even = 0;

    public Statistics() {

    }

    public void addNumber(int number) {
        this.sum = this.sum + number;
        if (number % 2 == 0) {
            this.even = this.even + number;
        }
        if (number % 2 != 0) {
            this.odd = this.odd + number;
        }
        this.count = this.count + 1;

    }

    public int evenCount() {
        return this.even;
    }

    public int oddCount() {
        return this.odd;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return (double) this.sum/this.count; 
    }
}
 */