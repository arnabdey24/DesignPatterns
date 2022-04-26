package strategy;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        Integer[] integers={88,33,44,56,22,99,98,46,23};

        SortingStrategy strategy=new MergeSort();

        strategy.sort(integers);

        System.out.println(Arrays.toString(integers));
    }
}
