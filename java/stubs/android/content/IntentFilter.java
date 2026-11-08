package android.content;
import android.os.Parcelable;
import android.os.Parcel;

public class IntentFilter implements Parcelable {
    public static final int SYSTEM_HIGH_PRIORITY = 1000;
    private int mPriority = 0;

    public IntentFilter() {}
    public IntentFilter(String action) { addAction(action); }

    public void addAction(String action) {}
    public void setPriority(int priority) { mPriority = priority; }
    public int getPriority() { return mPriority; }

    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<IntentFilter> CREATOR = new Creator<IntentFilter>() {
        @Override
        public IntentFilter createFromParcel(Parcel in) { return new IntentFilter(); }
        @Override
        public IntentFilter[] newArray(int size) { return new IntentFilter[size]; }
    };
}
