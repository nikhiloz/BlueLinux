package android.util;

import java.util.HashMap;

public class SparseArray<E> {
    private final HashMap<Integer, E> mMap = new HashMap<>();

    public SparseArray() {}
    public SparseArray(int initialCapacity) {}

    public void put(int key, E value) {
        mMap.put(key, value);
    }

    public E get(int key) {
        return mMap.get(key);
    }

    public E get(int key, E valueIfKeyNotFound) {
        return mMap.getOrDefault(key, valueIfKeyNotFound);
    }

    public void remove(int key) {
        mMap.remove(key);
    }

    public int size() {
        return mMap.size();
    }

    public int keyAt(int index) {
        return (int) mMap.keySet().toArray()[index];
    }

    public E valueAt(int index) {
        return (E) mMap.values().toArray()[index];
    }

    public void clear() {
        mMap.clear();
    }


    public boolean contains(int key) { return get(key) != null; }

}
