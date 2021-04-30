package utils;

import java.util.ArrayList;
import java.util.Arrays;

public class Utils {
    private String[] array;
    private final ArrayList<String> products;
    private int size = 0;

    public Utils () {
        int default_size = 10;
        this.array = new String[default_size];
        this.products = new ArrayList<>();
    }


    public void listAdd (String item) {
        this.products.add(item);
    }
    public void add (String item) {
        if (size == array.length) {
            grow();
        }
        this.array[this.size++] = item;
    }
    private void grow () {
        int newSize = this.array.length * 2;
        this.array = Arrays.copyOf(array, newSize);
    }

    public String[] getArray () {
        return this.array;
    }
    public ArrayList<String> getList () {
        return this.products;
    }
}
