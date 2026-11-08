package android.os;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;

public class ParcelFileDescriptor implements Parcelable, java.io.Closeable {
    public ParcelFileDescriptor() {}

    public static ParcelFileDescriptor adoptFd(int fd) {
        return new ParcelFileDescriptor();
    }

    public static ParcelFileDescriptor dup(FileDescriptor fd) throws IOException {
        return new ParcelFileDescriptor();
    }

    public FileDescriptor getFileDescriptor() {
        return new FileDescriptor();
    }

    public int getFd() {
        return -1;
    }

    @Override
    public void close() throws IOException {}

    @Override
    public int describeContents() {
        return CONTENTS_FILE_DESCRIPTOR;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<ParcelFileDescriptor> CREATOR = new Creator<ParcelFileDescriptor>() {
        @Override
        public ParcelFileDescriptor createFromParcel(Parcel in) {
            return new ParcelFileDescriptor();
        }

        @Override
        public ParcelFileDescriptor[] newArray(int size) {
            return new ParcelFileDescriptor[size];
        }
    };
}
