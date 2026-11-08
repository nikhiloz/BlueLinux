package android.os;

public class Parcel {
    public static Parcel obtain() {
        return new Parcel();
    }

    public void recycle() {}

    public void writeString(String s) {}
    public String readString() { return null; }

    public void writeInt(int val) {}
    public int readInt() { return 0; }

    public void writeLong(long val) {}
    public long readLong() { return 0L; }

    public void writeFloat(float val) {}
    public float readFloat() { return 0.0f; }

    public void writeDouble(double val) {}
    public double readDouble() { return 0.0; }

    public void writeByte(byte val) {}
    public byte readByte() { return 0; }

    public void writeByteArray(byte[] b) {}
    public byte[] createByteArray() { return null; }

    public void writeParcelable(Parcelable p, int flags) {}
    public <T extends Parcelable> T readParcelable(ClassLoader loader) { return null; }

    public void writeStrongBinder(IBinder b) {}
    public IBinder readStrongBinder() { return null; }

    public void writeBundle(Bundle val) {}
    public Bundle readBundle() { return null; }
    public Bundle readBundle(ClassLoader loader) { return null; }

    public void writeBoolean(boolean val) {}
    public boolean readBoolean() { return false; }
    public <T extends Parcelable> void writeTypedObject(T parcelable, int flags) {}
    public <T extends Parcelable> T readTypedObject(Parcelable.Creator<T> c) { return null; }
    public <T extends Parcelable> void writeTypedList(java.util.List<T> val) {}
    public <T extends Parcelable> java.util.ArrayList<T> createTypedArrayList(Parcelable.Creator<T> c) { return null; }
    public <T> void writeTypedArray(T[] val, int flags) {}
    public void readByteArray(byte[] val) {}



    public <T> void readTypedList(java.util.List<T> list, Parcelable.Creator<T> c) {}
    public void writeList(java.util.List val) {}
    public java.util.ArrayList readArrayList(ClassLoader loader, Class clazz) { return new java.util.ArrayList(); }

}
