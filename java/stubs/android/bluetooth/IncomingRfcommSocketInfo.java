package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class IncomingRfcommSocketInfo implements Parcelable {
    public int status;
    public android.os.ParcelFileDescriptor pfd;
    public BluetoothDevice bluetoothDevice;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<IncomingRfcommSocketInfo> CREATOR = new Creator<IncomingRfcommSocketInfo>() {
        @Override
        public IncomingRfcommSocketInfo createFromParcel(Parcel in) {
            return new IncomingRfcommSocketInfo();
        }

        @Override
        public IncomingRfcommSocketInfo[] newArray(int size) {
            return new IncomingRfcommSocketInfo[size];
        }
    };
}
