package android.os;

public class Handler {
    public final Looper mLooper;
    public Handler() { mLooper = Looper.myLooper(); }
    public Handler(Looper looper) { mLooper = looper; }

    public boolean post(Runnable r) { return true; }
    public boolean postDelayed(Runnable r, long delayMillis) { return true; }
    public boolean postDelayed(Runnable r, Object token, long delayMillis) { return true; }
    
    public void removeCallbacks(Runnable r) {}
    public void removeCallbacksAndMessages(Object token) {}
    public void removeMessages(int what) {}
    public void removeMessages(int what, Object object) {}

    public boolean hasMessages(int what) { return false; }
    public boolean hasMessages(int what, Object object) { return false; }

    public boolean sendMessage(Message msg) { return true; }
    public boolean sendMessageDelayed(Message msg, long delayMillis) { return true; }
    public boolean sendEmptyMessage(int what) { return sendMessage(obtainMessage(what)); }
    public boolean sendEmptyMessageDelayed(int what, long delayMillis) { return sendMessageDelayed(obtainMessage(what), delayMillis); }

    public final Message obtainMessage() { return new Message(); }
    public final Message obtainMessage(int what) { Message m = new Message(); m.what = what; return m; }
    public final Message obtainMessage(int what, Object obj) { Message m = new Message(); m.what = what; m.obj = obj; return m; }
    public final Message obtainMessage(int what, int arg1, int arg2) { Message m = new Message(); m.what = what; m.arg1 = arg1; m.arg2 = arg2; return m; }
    public final Message obtainMessage(int what, int arg1, int arg2, Object obj) { Message m = new Message(); m.what = what; m.arg1 = arg1; m.arg2 = arg2; m.obj = obj; return m; }

    public Looper getLooper() { return mLooper; }

    public void handleMessage(Message msg) {}
}
