package strategy;

public interface SortingStrategy {

    public <T extends Comparable<T>> void sort(T[] data);
}
