package android.companion;

import android.os.Parcelable;

public class AssociationRequest implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel out, int flags) {}

    public static final Creator<AssociationRequest> CREATOR = new Creator<AssociationRequest>() {
        @Override
        public AssociationRequest createFromParcel(android.os.Parcel in) {
            return new AssociationRequest();
        }

        @Override
        public AssociationRequest[] newArray(int size) {
            return new AssociationRequest[size];
        }
    };
}
