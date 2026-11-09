package android.os;

public class Message implements Parcelable {
    public int what;
    public int arg1;
    public int arg2;
    public Object obj;
    public Handler target;

    public static Message obtain() { return new Message(); }
    public static Message obtain(Message orig) {
        Message m = new Message();
        if (orig != null) {
            m.what = orig.what;
            m.arg1 = orig.arg1;
            m.arg2 = orig.arg2;
            m.obj = orig.obj;
            m.target = orig.target;
        }
        return m;
    }
    public static Message obtain(Handler h) {
        Message m = new Message();
        m.target = h;
        return m;
    }
    public void sendToTarget() {
        if (target != null) target.sendMessage(this);
    }

    @Override
    public int describeContents() { return 0; }
    @Override
    public void writeToParcel(Parcel dest, int flags) {}
    public static final Creator<Message> CREATOR = new Creator<Message>() {
        @Override
        public Message createFromParcel(Parcel in) { return new Message(); }
        @Override
        public Message[] newArray(int size) { return new Message[size]; }
    };
}
