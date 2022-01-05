package generic;

public class CInterface<T extends Comparable<T>> implements Sort<T> {
    T[] vals;
    CInterface(T[] o){
        vals = o;
    }
    
    @Override
    public void sort(T[] List){
        for (int index = 1; index < vals.length; index++) {
            T key = vals[index];
            int position = index - 1;
            while (position >= 0 && key.compareTo(vals[position]) > 0) {
                vals[position + 1] = vals[position];
                position--;
            }
            vals[position + 1] = key;
        }
    }
}