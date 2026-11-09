package android.os;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bundle implements Parcelable {
    public static final Bundle EMPTY = new Bundle();
    private Map<String, Object> mMap = new HashMap<>();

    public Bundle() {}

    public Bundle(ClassLoader loader) {}

    public void putString(String key, String value) {
        mMap.put(key, value);
    }

    public String getString(String key) {
        Object val = mMap.get(key);
        return val instanceof String ? (String) val : null;
    }

    public String getString(String key, String defaultValue) {
        String val = getString(key);
        return val != null ? val : defaultValue;
    }

    public void putInt(String key, int value) {
        mMap.put(key, value);
    }

    public int getInt(String key) {
        Object val = mMap.get(key);
        return val instanceof Integer ? (Integer) val : 0;
    }

    public int getInt(String key, int defaultValue) {
        Object val = mMap.get(key);
        return val instanceof Integer ? (Integer) val : defaultValue;
    }

    public void putBoolean(String key, boolean value) {
        mMap.put(key, value);
    }

    public boolean getBoolean(String key) {
        return getBoolean(key, false);
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        Object val = mMap.get(key);
        return val instanceof Boolean ? (Boolean) val : defaultValue;
    }

    public void putLong(String key, long value) {
        mMap.put(key, value);
    }

    public long getLong(String key) {
        return getLong(key, 0L);
    }

    public long getLong(String key, long defaultValue) {
        Object val = mMap.get(key);
        return val instanceof Long ? (Long) val : defaultValue;
    }

    public void putParcelable(String key, Parcelable value) {
        mMap.put(key, value);
    }

    public <T extends Parcelable> T getParcelable(String key) {
        Object val = mMap.get(key);
        return (T) val;
    }

    public boolean containsKey(String key) {
        return mMap.containsKey(key);
    }

    public Set<String> keySet() {
        return mMap.keySet();
    }

    public void clear() {
        mMap.clear();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        // basic stub
    }

    public static final Creator<Bundle> CREATOR = new Creator<Bundle>() {
        @Override
        public Bundle createFromParcel(Parcel in) {
            return new Bundle();
        }

        @Override
        public Bundle[] newArray(int size) {
            return new Bundle[size];
        }
    };
}
