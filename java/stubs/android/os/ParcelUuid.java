package android.os;

import java.util.UUID;

public class ParcelUuid implements Parcelable {
    private final UUID mUuid;

    public ParcelUuid(UUID uuid) {
        mUuid = uuid;
    }

    public UUID getUuid() {
        return mUuid;
    }

    public static ParcelUuid fromString(String uuid) {
        return new ParcelUuid(UUID.fromString(uuid));
    }

    @Override
    public String toString() {
        return mUuid.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(mUuid.toString());
    }

    public static final Creator<ParcelUuid> CREATOR = new Creator<ParcelUuid>() {
        @Override
        public ParcelUuid createFromParcel(Parcel in) {
            String s = in.readString();
            return s != null ? fromString(s) : null;
        }

        @Override
        public ParcelUuid[] newArray(int size) {
            return new ParcelUuid[size];
        }
    };
}
