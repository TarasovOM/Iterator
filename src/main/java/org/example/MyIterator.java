package org.example;
import java.util.Iterator;
import java.util.Random;


public class MyIterator implements Iterator<Integer> {
    public int min, max;

    public MyIterator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        if (min < max) {
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        return new Random().nextInt(min,max);
    }
}