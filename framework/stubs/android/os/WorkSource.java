package android.os;

public class WorkSource implements Parcelable {
    public WorkSource() {}
    public WorkSource(int uid) {}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<WorkSource> CREATOR = new Creator<WorkSource>() {
        @Override
        public WorkSource createFromParcel(Parcel in) {
            return new WorkSource();
        }

        @Override
        public WorkSource[] newArray(int size) {
            return new WorkSource[size];
        }
    };
}
