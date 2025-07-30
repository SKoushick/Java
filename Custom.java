package generics;

import java.util.*;

public class Custom {

    private int[] data;
    private static int Default = 10;
    private int size = 0;

    public void CustomAr() {
        this.data = new int[Default];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public void add(int a) {
        if (isFull()) {
            resize();
        }
        data[size++] = a;
    }

    public int remove() {
        var remove = data[--size];
        return remove;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public int set(int index, int value) {
        return data[index] = value;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        /*
         * list.add(34);
         * list.add(65);
         * list.add(12);
         * list.add(10);
         */

    }
}