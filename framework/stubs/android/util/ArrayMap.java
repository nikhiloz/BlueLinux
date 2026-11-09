package android.util;

import java.util.HashMap;

public class ArrayMap<K, V> extends HashMap<K, V> {
    public ArrayMap() {
        super();
    }
    public ArrayMap(int capacity) {
        super(capacity);
    }
}
