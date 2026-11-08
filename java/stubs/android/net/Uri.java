package android.net;

import android.os.Parcelable;

public class Uri implements Parcelable {
    public static Uri parse(String uriString) {
        return new Uri();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel out, int flags) {}

    public static final Creator<Uri> CREATOR = new Creator<Uri>() {
        @Override
        public Uri createFromParcel(android.os.Parcel in) {
            return new Uri();
        }

        @Override
        public Uri[] newArray(int size) {
            return new Uri[size];
        }
    };
}
