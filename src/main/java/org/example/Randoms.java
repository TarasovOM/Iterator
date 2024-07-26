package org.example;
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    protected int min, max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(this.min, this.max);
    }
}

