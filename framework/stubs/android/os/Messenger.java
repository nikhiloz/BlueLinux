package android.os;

public final class Messenger implements Parcelable {
    private IBinder mTarget;

    public Messenger(Handler target) {
        mTarget = null;
    }

    public Messenger(IBinder target) {
        mTarget = target;
    }

    public void send(Message message) throws RemoteException {
        if (message.target != null) {
            message.target.sendMessage(message);
        }
    }

    public IBinder getBinder() {
        return mTarget;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeStrongBinder(mTarget);
    }

    public static final Creator<Messenger> CREATOR = new Creator<Messenger>() {
        @Override
        public Messenger createFromParcel(Parcel in) {
            IBinder b = in.readStrongBinder();
            return b != null ? new Messenger(b) : null;
        }

        @Override
        public Messenger[] newArray(int size) {
            return new Messenger[size];
        }
    };
}
