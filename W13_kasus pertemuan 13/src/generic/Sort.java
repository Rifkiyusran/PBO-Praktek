package generic;

interface Sort<T extends Comparable<T>> {
    void sort(T[] List);
}